package main.functionalProgramming.StreamAPIs;

import java.time.LocalDate;
import java.time.Year;
import java.time.ZoneId;
import java.util.*;
import java.util.stream.Collectors;

public final class SummarizeClients {
    public static void main(String[] args) {

        int numClients = 0;
        int totalQuarterlySpend = 0;
        long nextExpiration = 0L;
        Set<ZoneId> representedZoneIds = new HashSet<>();
        Map<Year, Long> contractsPerYear = new HashMap<>();
        List<UdacisearchClient> clients = ClientStore.getClients();

        //Using Streams to Calculate;
        numClients =
                clients
                        .size();

        totalQuarterlySpend =
                clients
                        .stream()
                        .mapToInt(UdacisearchClient::getQuarterlyBudget)
                        .sum();

        nextExpiration =
                clients
                        .stream()
                                .min(Comparator.comparing(UdacisearchClient::getContractEnd))
                                        .map(UdacisearchClient::getId)
                        .orElse(-1L);

        representedZoneIds =
                clients
                        .stream()
                                .flatMap( c -> c.getTimeZones().stream())
                                        .collect(Collectors.toSet());

        contractsPerYear =
                       clients
                               .stream()
                                       .collect(
                                               Collectors.
                                                       groupingBy(SummarizeClients::getContractYear,Collectors.counting()));


        System.out.println("Num clients: " + numClients);
        System.out.println("Total quarterly spend: " + totalQuarterlySpend);
        System.out.println("Average budget: " + (double) totalQuarterlySpend / numClients);
        System.out.println("ID of next expiring contract: " + nextExpiration);
        System.out.println("Client time zones: " + representedZoneIds);
        System.out.println("Contracts per year: " + contractsPerYear);
    }

    private static Year getContractYear(UdacisearchClient client) {
        LocalDate contractDate =
                LocalDate.ofInstant(client.getContractStart(), client.getTimeZones().get(0));
        return Year.of(contractDate.getYear());
    }
}


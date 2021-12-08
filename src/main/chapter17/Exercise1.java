package main.chapter17;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.concurrent.SubmissionPublisher;
import java.util.stream.Stream;

/*The SubmissionPublisher is a fully functional implementation of the Publisher
interface,which you can use to demonstrate the basic functionality of a reactive application
 */

public class Exercise1 {

    public static void main(String[] args) {
        SubmissionPublisher<String> publisher = new SubmissionPublisher<>();
        LipsumSubscriber lipsumSubscriber = new LipsumSubscriber();

        publisher.subscribe(lipsumSubscriber);

        String filePath = "res/ReadMe.txt";
        /*Here we are loading the file as a Stream of Strings*/
        try (Stream<String> words = Files.lines(Paths.get(filePath))) {
            words.flatMap((l) -> Arrays.stream(l.split("[\\s.,\\n]+"))).
                    forEach(publisher::submit);
            publisher.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

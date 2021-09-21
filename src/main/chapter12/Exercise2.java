package main.chapter12;

/*Regular Expressions-how to use capturing groups to extract only the vital information from a small string*/

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercise2 {

    public static void main(String[] args) {
        String url = "https://icotelub.cm/about";

        /*ignoring the useles characters between that and the protocol-the ://*/
        /* regular expression with 2 groups*/
        /*Adding a third group to the regular expression to find the domain*/
        /*Adding a fourth group to the regex to find the path*/
        String regex = "(http[s])(?:://)([w]{0,3}\\.?[a-zA-Z]\\.[a-zA-Z]{2,3})(?:[/])(.*)";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(url);

        /* Attempt to find the first group*/
        boolean foundMatches = matcher.find();

        if (foundMatches){
            String protocol = matcher.group(1);
             /*Now,collect the domain group and print it*/
            String domain = matcher.group(2);
            /*Now extract the path content and print it*/
            String path = matcher.group(3);

            System.out.println("Protocol:" + protocol);
            System.out.println("Domain:" + domain);
            System.out.println("Path:" + path);
        }


    }

}

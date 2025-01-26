package lab8.problem4.b;

import java.util.Arrays;
import java.util.List;

public class ForEachExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Hello there", "Goodbye", "Back soon",
                "Away", "On Vacation", "Everywhere you want to be");

        // Using a method reference
        list.forEach(ForEachExample::printUpperCase);
    }


    private static void printUpperCase(String s) {
        System.out.println(s.toUpperCase());
    }
}


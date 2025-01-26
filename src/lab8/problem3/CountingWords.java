package lab8.problem3;

import java.util.List;

public class CountingWords {


    public static void main(String[] args) {
        List<String> words = List.of("apple", "banana", "cherry", "date", "grape");
        int result = countWords(words, 'c', 'd', 5);
        System.out.println(result);
    }

    public static int countWords(List<String> words, char c, char d, int len) {

        return (int) words.stream()
                .filter(word -> word.length() == len)
                .filter(word -> word.indexOf(c) >= 0)
                .filter(word -> word.indexOf(d) < 0)
                .count();
    }
}

package TestPractice;

import java.util.List;

public class WordsLengthGreater3 {
    public static void main(String[] args) {
        List<String> words = List.of("java", "stream", "lambda", "api", "map", "java");
        long ans=words.stream()
                .distinct()
                .filter(n->n.length()>3)
                .count();
        System.out.println(ans);
    }
}

package Java8.StreamPractice;

import java.util.List;

public class ThreeChecks {
    public static void main(String[] args) {
        List<String> words = List.of("java", "stream", "lambda", "api", "map", "java");
        boolean any=words.stream().anyMatch(s-> s.startsWith("j"));
        boolean all=words.stream().allMatch(s->s.length()>2);
        boolean none=words.stream().noneMatch(String::isEmpty);
        System.out.println("any :"+any+" all :"+all+" none :"+none);
    }
}

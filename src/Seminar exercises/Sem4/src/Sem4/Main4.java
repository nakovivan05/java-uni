package Sem4;
import java.util.List;
import java.util.Comparator;
import java.util.Arrays;
public class Main4 {
    public static List<String> transformWords(List<String> words) {
        return words.stream().filter(w -> w.length() >= 5).map(String::toUpperCase).distinct().sorted(Comparator.comparingInt(String::length).thenComparing(Comparator.naturalOrder())).toList();
    }
    public static void main(String[] args) {
        List<String> words = Arrays.asList("java", "stream", "lambda", "code", "lambda", "programming");
        List<String> transformed = transformWords(words);
        System.out.println("Transformed: " + transformed);
    }
}

package Sem4;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.Arrays;
public class Main {
    public static List<Integer> getEvenNumbersGreaterThan10(List<Integer> numbers) {
        return numbers.stream().filter(n -> n % 2 == 0).filter(n -> n > 10).sorted().toList();
    }
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 12, 8, 20, 13, 14);
        List<Integer> result = getEvenNumbersGreaterThan10(numbers);
        System.out.println(result);
    }
}

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.Comparator;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {

        //1
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 11, 22, 33, 44);
        int sum = numbers.stream()
                .filter(n -> n >= 10)
                .map(n -> n * n)
                .reduce(0, Integer::sum);
        System.out.println(sum);

        //2
        List<String> words = Arrays.asList("Juice", "Book", "Java", "London", "Joker");
        List<String> upperCase = words.stream()
                .filter(word -> word.startsWith("J"))
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(upperCase);

        //3
        List<String> names = Arrays.asList("Beck", "Olaf", "Garp", "Ronnie", "Aaron");
        Set<String> sorted = names.stream()
                .sorted()
                .collect(Collectors.toCollection(HashSet::new));
        System.out.println(sorted);

        //4
        List<Human> people = Arrays.asList(
                new Human("Levani", 26),
                new Human("Petre", 21),
                new Human("Mariami", 18),
                new Human("Giorgi", 19)
        );
        boolean islevani = people.stream()
                .filter(human -> human.getAge() >= 15)
                .anyMatch(human -> human.getName().equals("Levani"));
        System.out.println(islevani);

        //5 vol.1.0
        List<Integer> numberList = Arrays.asList(7, 10, 8, 12, 17, 5, 3, 2, 54, 14);
        Integer secondSmallest = numberList.stream()
                .distinct()
                .sorted()
                .skip(1)
                .findFirst()
                .orElse(null);
        System.out.println(secondSmallest);

        //5 vol.2.0
        Integer secondLargest = numberList.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElse(null);
        System.out.println(secondLargest);
    }
}
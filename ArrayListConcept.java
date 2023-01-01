import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ArrayListConcept {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("Volvo", "Bharat", "Mohit", "Yash"));
        list.set(0, "Sonal");
        System.out.println(list);
//        list.stream().max(Integer::sum).ifPresent(System.out::println);
//
        list.sort(Comparator.naturalOrder());
        System.out.println(list);

        list.sort(Comparator.reverseOrder());
        System.out.println(list);
//        list.stream().max(String::compareTo).ifPresent(System.out::println);
//        list.sort(Comparator.comparingInt(Integer::intValue).reversed());
//        list.stream().max(Integer::compare).ifPresent(System.out::println);
//        System.out.println(list);
//        list.stream().sorted().forEach(System.out::println);
//        list.stream().reduce(Integer::max).ifPresent(System.out::println);
//
//        list.sort(Integer::compare);
//        System.out.println(list);
//        list.stream().sorted().forEach(System.out::println);
//        list.sort(Integer::compareTo);
//        System.out.println(list);
//        list.sort(Collections.reverseOrder());
//        System.out.println(list);
//        Collections.reverse(list);
//        System.out.println(list);
//
//        list.stream().reduce(Integer::max).ifPresent(System.out::println);
//        list.stream().reduce(Integer::min).ifPresent(System.out::println);
//        System.out.println(list);
    }
}

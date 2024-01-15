package jan13;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterList {
    public static void main(String[] args) {
        Stream<Integer> number=Stream.of(1,2,3,4,5,6,7,8,9,10,15);
      //  number.forEach((i)-> System.out.println(i*5));
        List<Integer> list = number.filter(i -> i % 3 == 0)
                .filter(i -> i % 5 == 0).
                collect(Collectors.toList());
        System.out.println(list);
    }
}

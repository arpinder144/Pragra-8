package jan09;

import java.util.function.Predicate;

public class Practice {
    public static void main(String[] args) {
        Predicate<String> predicate= name ->name.length()>5;
        System.out.println(predicate.test("johnjohn"));
    }
}

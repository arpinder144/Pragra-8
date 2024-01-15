package jan13;

import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {
        Function<String,Integer> func=(s)-> s.length();
        System.out.println(func.apply("hello"));
    }
}

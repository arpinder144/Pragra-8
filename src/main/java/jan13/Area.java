package jan13;

import java.util.function.Function;

public class Area {
    public static void main(String[] args) {
        Function<Integer, Integer> area= (r)-> (int)(Math.PI*r*r);
        System.out.println(area.apply(2));
    }
}

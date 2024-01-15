package jan09.stringdemo;

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {


    Lower up=(input)->input.toUpperCase().trim();
    Lower lo=(input)->input.toLowerCase().trim();
    Lower replace=(input)->input.replace("B","T");
        System.out.println(up.apply("   pragra"));
        System.out.println(lo.apply("Pragra"));
        System.out.println(replace.apply("Best"));
        Predicate<Integer> predicate=(a)->a>2;
        System.out.println(predicate.test(5));
      //  Predicate<String> predicate1= i->Integer.parseInt(i.length());
    }


}
interface Lower{
    String apply(String input);
}

interface Length{
    String input(String in);

}
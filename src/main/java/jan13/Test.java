package jan13;

import java.util.function.Predicate;

public class Test {
    public static void main(String[] args) {
        Predicate<Integer> evenOdd= (i) -> i%2==0;
        boolean input=evenOdd.test(12);
        if(input == true){
            System.out.println("even");
        }else {
            System.out.println("odd");
        }
        System.out.println("---------------------------------------------------");

        Predicate<String> str=(s)->s.isEmpty();
        boolean strInput= str.test("");
        if(strInput == true){
            System.out.println("String is empty");
        }else {
            System.out.println("String has value");
        }

        System.out.println("-----------------------------------------------------");

        Predicate<Integer> positive=(i)-> i<0;
        boolean posInput= positive.test(4);
        if(posInput == true){
            System.out.println("Negative number");
        }else {
            System.out.println("Positive number");
        }



    }
}

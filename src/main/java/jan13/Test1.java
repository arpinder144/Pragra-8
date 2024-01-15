package jan13;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class Test1 {
    public static void main(String[] args) {
       /* 1. Write a consumer which double each element give to it or list[later].
       */
        Consumer<Integer> number=(i)-> System.out.println(i*2);
        number.accept(5);


        List<Integer> list= Arrays.asList(1,5,8,6,2);
        Consumer<Integer> number1=(i)-> System.out.println(i*2);



        Function<Integer,Integer> func=(i)->i*2;
        System.out.println(func.apply(5));


    }
    public static void sum(int a){
        System.out.println(a*2);
    }
}

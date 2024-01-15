package jan13;

import java.util.function.Predicate;

public class Palindrome {
    public static void main(String[] args) {
        /*StringBuilder ss=new StringBuilder(s);
        StringBuilder reverse = ss.reverse();
        boolean equals = ss.equals(reverse);

         */
//        Predicate<String> check=(s)-> s.equals(new StringBuilder(s).reverse());
//        System.out.println(check.test("madam"));
        Predicate<String> check1=(s)-> {
            StringBuilder n1=new StringBuilder(s);
            String rev = n1.reverse().toString();
           return s.equals(rev);

        };
        System.out.println(check1.test("madam"));
    }
}

package jan09;

public class MainTest {
    public static void main(String[] args) {
        Test test = ()-> System.out.println("Interface Test");
        test.test();
        Vehicle vehicle=() -> System.out.println("Vehicle running");
        vehicle.run();
        Mobile mobile=(phone)->System.out.println("Phone number:"+phone);
        mobile.call(123456);
        Calculator calculator=(a,b) -> {return a+b;};
        System.out.println("Calculator:"+calculator.calcualte(4.5, 5.5));
        Computer computer=()-> System.out.println("Internet");
        computer.surfInternet();
        Greeting greeting=(greet)->{return greet;};
        System.out.println("Greeting:"+greeting.greet("hello"));
        Calculator addition=(a,b) -> a+b;
        Calculator Sub=(a,b) -> a-b;
        Calculator Mul=(a,b) -> a*b;
        Calculator div=(a,b) -> a/b;
        System.out.println("Add"+addition.calcualte(4 , 5));
        System.out.println("Sub:"+Sub.calcualte(10, 8));
        System.out.println("Mul:"+Mul.calcualte(5, 3));
        System.out.println("Div:"+div.calcualte(15, 3));


    }
}
@FunctionalInterface
interface Test {
    void test();
}
interface Vehicle {
    void run();
}
interface Mobile {
    void call(int phone);
}

interface Calculator {
    Double calcualte(double a, double b);
}
interface Computer {
    void surfInternet();
}

interface Greeting {
    String greet(String greet);
}

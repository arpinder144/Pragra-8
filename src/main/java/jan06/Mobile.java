package jan06;

public interface Mobile  {
    void call();
    default void show(){
        System.out.println("Default show method");
    }
}

package jan06.bankinter;

public interface Bank {
    void saving();

}
class Main{
    public static void main(String[] args) {
        //()-> System.out.println("Saving....");
        // show(()-> System.out.println("Saving...."));
        Bank bank = () -> System.out.println("Hllo");
        bank.saving();
    }

}
package jan13;

import java.time.LocalDateTime;
import java.util.function.Supplier;

public class DateTime {
    public static void main(String[] args) {
        Supplier<LocalDateTime> date= ()-> LocalDateTime.now();
    }
}

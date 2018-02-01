import java.util.function.Consumer;

/**
 * Created by Taras on 02.02.2018.
 */
public class Main {

    public static final String OUTPUT = "Hello, world!!!";

    public static void main(String[] args) {
        f(OUTPUT, System.out::println);
    }

    private static <T> void f(T t, Consumer<T> func) {
        func.accept(t);
    }
}

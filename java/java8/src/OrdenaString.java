import java.util.ArrayList;
import java.util.List;
import static java.util.Comparator.*;

public class OrdenaString {
    public static void main(String[] args) throws Exception {
        List<String> palavras = new ArrayList<String>();
        palavras.add("alura online");
        palavras.add("editora casa do código");
        palavras.add("caelum");
        palavras.add("Lucas ferreira");

        // palavras.sort((umaString, outraString) -> Integer.compare(umaString.length(),
        // outraString.length()));
        // palavras.sort((umaString, outraString) -> umaString.length() -
        // outraString.length());
        // palavras.sort(comparing(String::length));

        palavras.sort(comparing(String::toLowerCase));
        palavras.sort(comparing(String::length).reversed());
        
        // palavras.forEach(palavara -> System.out.println(palavara));
        palavras.forEach(System.out::println);


        new Thread(() -> System.out.println("Executando um Runnable")).start();
        ;

    }
}

// new Thread(new Runnable() {

// @Override
// public void run() {
// System.out.println("Executando um Runnable");
// }

// }).start();
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class TestaExercicio {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Map<Integer, String> pessoas = new HashMap<>();
        pessoas.put(31, "Lucas Ferreira");
        pessoas.put(53, "João Oliveira");
        pessoas.put(12, "Maria Silva");
        pessoas.put(43, "João Santeiro");

        Set<Integer> keySetPessoas = pessoas.keySet();
        keySetPessoas.forEach(System.out::println);

        Collection<String> valuesPessoas = pessoas.values();
        valuesPessoas.forEach(System.out::println);

        Set<Entry<Integer, String>> entrySetPessoas = pessoas.entrySet();
        for (Entry<Integer, String> entry : entrySetPessoas) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}

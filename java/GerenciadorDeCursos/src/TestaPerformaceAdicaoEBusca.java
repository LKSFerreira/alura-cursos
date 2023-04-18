import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class TestaPerformaceAdicaoEBusca {
    public static void main(String[] args) {
        Collection<Integer> numerosArrayList = new HashSet<>();
        //Collection<Integer> numerosArrayList = new ArrayList<>();
        long tempoInicial = System.currentTimeMillis();

        for (int i = 0; i < 180000; i++) {
            numerosArrayList.add(i);
        }

        for (Integer numero : numerosArrayList) {
            numerosArrayList.contains(numero);
        }  
        long tempoFinal = System.currentTimeMillis();

        System.out.println("Tempo gasto para para inserir elementos na ArrayList: " + (tempoFinal-tempoInicial) + "ms");
    }
}
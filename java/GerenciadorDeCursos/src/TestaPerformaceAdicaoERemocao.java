import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestaPerformaceAdicaoERemocao {
    public static void main(String[] args) {
        System.err.println("LinkedList VS ArrayList");

        List<Integer> numerosArrayList = new ArrayList<>();
        List<Integer> numerosLinkedList = new LinkedList<>();

        int quantidadeElementos = 10000000;

        long tempoArrayList = insereElementoNa(numerosArrayList, quantidadeElementos);
        long tempoLikedList = insereElementoNa(numerosLinkedList, quantidadeElementos);
        
        System.out.println("Tempo gasto para para inserir elementos na ArrayList: " + tempoArrayList + "ms");
        System.out.println("Tempo gasto para para inserir elementos na LinkedList: " + tempoLikedList + "ms");

        System.err.println("=====================================");
        
        tempoArrayList = removeElementosNa(numerosArrayList);
        tempoLikedList = removeElementosNa(numerosLinkedList);

        System.out.println("Tempo gasto para para remover elementos na ArrayList: " + tempoArrayList + "ms");
        System.out.println("Tempo gasto para para remover elementos na LinkedList: " + tempoLikedList + "ms");
        
    }

    private static long removeElementosNa(List<Integer> numerosLinkedList) {
        long tempoInicial = System.currentTimeMillis();

        for (int i = 0; i < numerosLinkedList.size(); i++) {
            numerosLinkedList.remove(0);
        }

        long tempoFinal = System.currentTimeMillis();

        return tempoFinal-tempoInicial;
    }

    private static long insereElementoNa(List<Integer> numerosList, int quantidadeElementos) {
        long tempoInicial = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++) {
            numerosList.add(i);
        }

        long tempoFinal = System.currentTimeMillis();
        return tempoFinal-tempoInicial;
    }
}

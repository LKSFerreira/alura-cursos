import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestaListaAulas {
    public static void main(String[] args) {
        Aula aula = new Aula("Revisando as ArrayList", 21);
        Aula aula2 = new Aula("Listas de Objetos", 19);
        Aula aula3 = new Aula("Relacionamento de lista e objetos", 15);

        ArrayList<Aula> aulas = new ArrayList<>();

        aulas.add(aula);
        aulas.add(aula2);
        aulas.add(aula3);

        Collections.sort(aulas);
        System.out.println(aulas);
        
        aulas.sort(Comparator.comparing(Aula::getTempo));
        System.out.println(aulas);
    }
}

import java.util.ArrayList;
import java.util.Collections;

public class TestaListas {
    public static void main(String[] args) throws Exception {
        String primeiroCurso = "Java e java.util: Coleções, Wrappers e Lambda expressions";
        String segundoCurso = "Java Exceções: aprenda a criar, lançar e controlar exceções";
        String terceiroCurso = "Java OO: entendendo a Orientação a Objetos";
        

        ArrayList<String> cursoList = new ArrayList<>();
        cursoList.add(primeiroCurso);
        cursoList.add(segundoCurso);
        cursoList.add(terceiroCurso);

        System.out.println(cursoList + "\n");

        Collections.sort(cursoList);

        cursoList.forEach(curso -> System.out.println("Aula: " + curso));
    }
}

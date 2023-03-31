import java.util.HashSet;
import java.util.Set;

public class TestaAlunosSemAcentos {
    public static void main(String[] args) {
        Set<String> alunos = new HashSet<>();
        alunos.add("Paulo");
        alunos.add("Alberto");
        alunos.add("Pedro");
        System.out.println("Aluno adicionado? " + alunos.add("Nico"));
        alunos.add("Sérgio");
        alunos.add("Rodrigo");
        alunos.add("Guilherme");
        alunos.add("Maurício");

        // alunos.forEach(System.out::println);
        for (String string : alunos) {
            System.out.println(string);
        }
        System.out.println("Total de alunos: " + alunos.size());

        System.out.println("Aluno adicionado? " + alunos.add("Nico"));
        alunos.add("Alberto");

        System.out.println("Total de alunos: " + alunos.size());
    }
}

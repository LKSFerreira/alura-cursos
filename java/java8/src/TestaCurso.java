import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Comparator.*;

public class TestaCurso {
    public static void main(String[] args) {
        List<Curso> cursos = new ArrayList<Curso>();
        cursos.add(new Curso("Python", 45));
        cursos.add(new Curso("JavaScript", 150));
        cursos.add(new Curso("Java 8", 113));
        cursos.add(new Curso("C", 55));
        cursos.add(new Curso("C++", 120));
        cursos.add(new Curso("C#", 39));
        cursos.add(new Curso("PHP", 50));
        cursos.add(new Curso("Ruby", 40));

        System.out.println("====================================");
        System.out.println("Ordenado por quantidade de alunos:");
        cursos.sort(comparing(Curso::getAlunos));
        cursos.forEach(curso -> System.out.println(curso.getNome()));
        System.out.println("====================================");
        System.out.println("Primeiro Elemento:");
        cursos.stream().filter(curso -> curso.getAlunos() > 50)
                .findFirst()
                .ifPresent(System.out::println);
        System.out.println("====================================");

        
        System.out.println("====================================");
        System.out.println("Mapeando para um Stream de Strings:");
        Stream<String> nomes = cursos.stream().map(Curso::getNome);
        nomes.forEach(System.out::println);

        System.out.println("====================================");
        System.out.println("Mapeando para um Stream de Integers:");
        cursos.stream()
                .filter(c -> c.getAlunos() > 50)
                .map(c -> c.getAlunos())
                .forEach(x -> System.out.println(x));

        System.out.println("====================================");
        System.out.println("Mapeando para um Stream de Integers:");
        cursos.stream()
                .filter(curso -> curso.getAlunos() > 100)
                .map(Curso::getAlunos)
                .forEach(System.out::println);

        System.out.println("====================================");
        System.out.println("Calcule a quantidade média de alunos de todos os seus cursos utilizando a API de Stream.");
        cursos.stream()
                .mapToInt(Curso::getAlunos)
                .average()
                .ifPresent(System.out::println);

        System.out.println("====================================");
        cursos.stream()
                .filter(curso -> curso.getAlunos() > 50)
                .collect(Collectors.toList())
                .forEach(System.out::println);

    }
}

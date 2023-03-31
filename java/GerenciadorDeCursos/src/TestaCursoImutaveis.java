import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCursoImutaveis {
    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Dominando as coleções do Java", "Lucas Ferreira");

        List<Aula> aulas = javaColecoes.getAulas();
        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Como realaizar um sort", 21));
        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Revisando as ArrayList", 21));
        javaColecoes.adiciona(new Aula("Listas de Objetos", 19));
        javaColecoes.adiciona(new Aula("Relacionamento de listas e objetos", 15));

        System.out.println("=====================================");
        System.out.println(aulas);
        System.out.println("=====================================");

        List<Aula> colecoesOrganizadas = new ArrayList<>(javaColecoes.getAulas());
        Collections.sort(colecoesOrganizadas);
        colecoesOrganizadas.forEach(aula -> {
            System.out.println(aula);
        });

        System.out.println("=====================================");
        System.out.println(javaColecoes);
        System.out.println("=====================================");

        Collections.reverse(colecoesOrganizadas);
        colecoesOrganizadas.forEach(aula -> {
            System.out.println(aula);
        });

    }
}

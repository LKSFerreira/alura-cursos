import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Curso {
    String nome;
    String instrutor;
    List<Aula> aulas = new LinkedList<Aula>();
    Set<Aluno> alunos = new HashSet<Aluno>();
    Map<Integer, Aluno> matriculaParaAluno = new HashMap<Integer, Aluno>();

    public Curso(String nome, String instrutor) {
        this.nome = nome;
        this.instrutor = instrutor;
    }

    public String getNome() {
        return nome;
    }

    public String getInstrutor() {
        return instrutor;
    }

    public List<Aula> getAulas() {
        return Collections.unmodifiableList(aulas);
    }

    public void adiciona(Aula aula) {
        this.aulas.add(aula);
    }

    public String getTempoTotal() {
        return this.aulas.stream().mapToInt(Aula::getTempo).sum() + " minutos";
    }

    public void matricula(Aluno aluno) {
        this.alunos.add(aluno);
        this.matriculaParaAluno.put(aluno.getNumeroMatricula(), aluno);
    }

    public Set<Aluno> getAlunos() {
        return Collections.unmodifiableSet(alunos);
    }

    public boolean estaMatriculado(Aluno aluno) {
        return this.alunos.contains(aluno);
    }

    public Aluno buscaMatriculado(int matricula) {
        if (!matriculaParaAluno.containsKey(matricula)) {
            throw new IllegalArgumentException("Matrícula não encontrada");
        }
        return matriculaParaAluno.get(matricula);
    }

    @Override
    public String toString() {
        return "Curso: " + nome + ", tempo total: " + getTempoTotal() + ",\nAulas do Curso: " + this.aulas;
    }

}

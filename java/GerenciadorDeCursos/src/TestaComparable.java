import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TestaComparable {

    public static void main(String[] args) {
        
        Funcionario funcionario = new Funcionario("João", 30);
        Funcionario funcionario2 = new Funcionario("Maria", 25);
        Funcionario funcionario3 = new Funcionario("José", 40);
        Funcionario funcionario4 = new Funcionario("Ana", 20);
        Funcionario funcionario5 = new Funcionario("Pedro", 35);

        Set<Funcionario> funcionarios = new TreeSet<>(new OrdenaPorIdade());
        
        funcionarios.add(funcionario);
        funcionarios.add(funcionario2);
        funcionarios.add(funcionario3);
        funcionarios.add(funcionario4);
        funcionarios.add(funcionario5);

        Iterator<Funcionario> iteratorFuncionarios = funcionarios.iterator();

        while (iteratorFuncionarios.hasNext()) {
            Funcionario funcionarioAtual = iteratorFuncionarios.next();
            System.out.println("Funcionário: " + funcionarioAtual.getNome() + " - Idade: " + funcionarioAtual.getIdade());
        }

    }
}

class Funcionario {
    private String nome;
    private int idade;

    public Funcionario(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }
    
    public int getIdade() {
        return idade;
    }
}

class OrdenaPorIdade implements Comparator<Funcionario> {
    @Override
    public int compare(Funcionario funcionario, Funcionario outroFuncionario) {
        return funcionario.getIdade() - outroFuncionario.getIdade();
    }
}

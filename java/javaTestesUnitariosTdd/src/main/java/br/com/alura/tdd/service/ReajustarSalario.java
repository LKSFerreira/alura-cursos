package br.com.alura.tdd.service;

import java.math.BigDecimal;

import br.com.alura.tdd.model.Desempenho;
import br.com.alura.tdd.model.Funcionario;

public class ReajustarSalario {

    public void concederReajuste(Funcionario funcionario, Desempenho desempenho) {
        BigDecimal reajuste = funcionario.getSalario().multiply(desempenho.percentualReajuste());
        funcionario.reajustaSalario(reajuste);
    }

}

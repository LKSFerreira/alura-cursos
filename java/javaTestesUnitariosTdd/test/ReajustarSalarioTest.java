import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.Test;

import br.com.alura.tdd.model.Desempenho;
import br.com.alura.tdd.model.Funcionario;
import br.com.alura.tdd.service.ReajustarSalario;

public class ReajustarSalarioTest {

    private ReajustarSalario reajusteSalario;
    private Funcionario funcionario;

    public ReajustarSalarioTest() {
        reajusteSalario = new ReajustarSalario();
        funcionario = new Funcionario("Test jUnit", LocalDate.now(), new BigDecimal("1000"));
    }

    @Test
    public void deveriaReajustarSalarioDoFuncionarioEmTresPorCentoQuandoDesempenhoForADesejar() {
        reajusteSalario.concederReajuste(funcionario, Desempenho.A_DESEJAR);
        assertEquals(new BigDecimal("1030.00"), funcionario.getSalario());        
    }

    @Test
    public void deveriaReajustarSalarioDoFuncionarioEmQuinzePorCentoQuandoDesempenhoForBom(){
        reajusteSalario.concederReajuste(funcionario, Desempenho.BOM);
        assertEquals(new BigDecimal("1150.00"), funcionario.getSalario());
    }

    @Test
    public void deveriaReajustarSalarioDoFuncionarioEmVintePorCentoQuandoDesempenhoForOtimo(){
        reajusteSalario.concederReajuste(funcionario, Desempenho.OTIMO);
        assertEquals(new BigDecimal("1200.00"), funcionario.getSalario());
    }
}

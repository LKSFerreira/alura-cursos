import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import br.com.alura.tdd.model.Funcionario;
import br.com.alura.tdd.service.BonusService;

public class BonusServiceTest {
    @Test
    public void bonusDeveriaSerZeroParaFuncionarioComSalarioAcimaDeDezMil() {
        BonusService bonusService = new BonusService();

        assertThrows(Throwable.class, () -> bonusService
                .calcularBonus(new Funcionario("Teste Testador", LocalDate.now(), new BigDecimal("20000"))));
                
        try {
            bonusService.calcularBonus(new Funcionario("Teste Testador", LocalDate.now(), new BigDecimal("20000")));
            fail();
        } catch (Exception e) {
            assertEquals("Funcionario com salário maior que R$ 10.000,00 não pode receber bonus!", e.getMessage());
        }
    }

    @Test
    public void bonusDeveriaSerDezPorCentoDoSalario() {
        BonusService bonusService = new BonusService();
        BigDecimal bonus = bonusService
                .calcularBonus(new Funcionario("Teste Testador", LocalDate.now(), new BigDecimal("2000")));
        assertEquals(new BigDecimal("200.00"), bonus);
    }

    @Test
    public void bonusDeveriaSerMilParaFuncionarioComSalarioDeExatamenteDezMil() {
        BonusService bonusService = new BonusService();
        BigDecimal bonus = bonusService
                .calcularBonus(new Funcionario("Teste Testador", LocalDate.now(), new BigDecimal("10000")));
        assertEquals(new BigDecimal("1000.00"), bonus);
    }
}

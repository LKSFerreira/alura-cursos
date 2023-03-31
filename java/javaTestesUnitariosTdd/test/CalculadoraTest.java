import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import br.com.alura.tdd.model.Calculadora;

public class CalculadoraTest {
    @Test
    public void deveriaSerUmValorPositivoQuandoSomadoDoisValoresPositivo() {
        Calculadora calc = new Calculadora();
        int resultado = calc.soma(1, 1);
        assertEquals(2, resultado);
    }

    @Test
    public void deveriaSerUmValorNegativoQuandoSomadoDoisValoresNegativo() {
        Calculadora calc = new Calculadora();
        int resultado = calc.soma(-1, -1);
        assertEquals(-2, resultado);
    }

    @Test
    public void deveriaSerZeroQuandoSomadoDoisValoresIguaisComSinalDiferente() {
        Calculadora calc = new Calculadora();
        int resultado = calc.soma(-1, 1);
        assertEquals(0, resultado);
    }

    @Test
    public void deveriaSerZeroQuandoSomadoDoisValoresZero() {
        Calculadora calc = new Calculadora();
        int resultado = calc.soma(0, 0);
        assertEquals(0, resultado);
    }

    @Test
    public void deveriaSerOValorDoPrimeiroParametroQuandoOValorDoSegundoParametroForZero() {
        Calculadora calc = new Calculadora();
        int resultado = calc.soma(1, 0);
        assertEquals(1, resultado);
    }

    @Test
    public void deveriaSerOValorDoSegundoParametroQuandoOValorDoPrimeiroParametroForZero() {
        Calculadora calc = new Calculadora();
        int resultado = calc.soma(0, 1);
        assertEquals(1, resultado);
    }
}
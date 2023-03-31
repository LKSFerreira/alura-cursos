import java.text.DateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class TestaDatas {
    public static void main(String[] args) {
        LocalDate hoje = LocalDate.now();
        System.out.println(hoje);

        LocalDate dataFutra = LocalDate.of(2099, Month.JANUARY, 25);
        System.out.println(dataFutra);

        Period periodo = Period.between(hoje, dataFutra);
        System.out.println(periodo.getYears() + " anos e " + periodo.getDays() + " dias");

        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String valorFormatado = hoje.format(formatador);

        System.out.println(valorFormatado);

        formatador = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        valorFormatado = dataFutra.format(formatador);
        System.out.println(valorFormatado);

    }
}

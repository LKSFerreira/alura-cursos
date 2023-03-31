import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TestaRecibo {
    public static void main(String[] args) {
        Set<Recibo> recibos = new TreeSet<>();

        Recibo recibo = new Recibo();
        recibo.setNumero(123);
        Recibo recibo2 = new Recibo();
        recibo2.setNumero(456);
        Recibo recibo3 = new Recibo();
        recibo3.setNumero(789);

        recibos.add(recibo);
        recibos.add(recibo2);
        recibos.add(recibo3);

        recibos.forEach(System.out::println);

        Iterator<Recibo> iterator = recibos.iterator();

        int contador = 0;
        while (iterator.hasNext()) {
            Recibo reciboAtual = iterator.next();
            System.out.println("Index do elemento: "+ contador + " - Recibo " + reciboAtual);
            contador++;
        }

    }
}

class Recibo implements Comparable<Recibo> {
    private int numero;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public int compareTo(Recibo outroRecibo) {
        return this.numero - outroRecibo.numero;
    }

    

    @Override
    public String toString() {
        return "[Recibo número: " + numero + "]";
    }
}
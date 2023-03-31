public class Aula implements Comparable<Aula> {
    String titulo;
    int tempo;

    public Aula(String titulo, int duracao) {
        this.titulo = titulo;
        this.tempo = duracao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTempo() {
        return tempo;
    }

    public void setTempo(int duracao) {
        this.tempo = duracao;
    }

    @Override
    public int compareTo(Aula outraAula) {
        return this.titulo.compareTo(outraAula.titulo);
    }

    @Override
    public String toString() {
        return "Aula: " + this.titulo + ", Duração: " + this.tempo;
    }
}

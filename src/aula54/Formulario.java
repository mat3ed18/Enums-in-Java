package aula54;

public class Formulario {

    enum Genero {
        FEMININO('F'), MASCULINO('M');

        private final char valor;

        Genero(char valor) {
            this.valor = valor;
        }
    }

    private String nome;
    private Genero genero;

    public Formulario(String nome, String genero) {
        this.nome = nome;
        this.genero = (genero.equals("M") || genero.equals("M".toLowerCase()) || genero.equals("F") || genero.equals("F".toLowerCase())) ? (genero.equals("M") || genero.equals("M".toLowerCase())) ? Genero.MASCULINO : Genero.FEMININO : null;
    }

    public Formulario() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Formulario{" + "nome=" + nome + ", genero=" + genero + '}';
    }
    
}

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

    public Formulario(String nome, Genero genero) {
        this.nome = nome;
        this.genero = genero;
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

}

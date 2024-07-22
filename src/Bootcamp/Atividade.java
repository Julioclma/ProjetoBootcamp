package Bootcamp;

public class Atividade {
    private String titulo;
    private String descricao;
    private int duracao;

    public Atividade(String titulo, String descricao, int duracao) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.duracao = duracao;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getDuracao() {
        return duracao;
    }

    @Override
    public String toString() {
        return "Atividade{" +
                "titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", duracao=" + duracao +
                '}';
    }
}

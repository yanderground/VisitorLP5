package org.example;

public class DVD implements ItemBiblioteca {

    private String titulo;
    private String diretor;
    private int duracao; // em minutos

    public DVD(String titulo, String diretor, int duracao) {
        this.titulo = titulo;
        this.diretor = diretor;
        this.duracao = duracao;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDiretor() {
        return diretor;
    }

    public int getDuracao() {
        return duracao;
    }

    @Override
    public String aceitar(Visitor visitor) {
        return visitor.exibirDVD(this);
    }
}

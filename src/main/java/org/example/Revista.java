package org.example;

public class Revista implements ItemBiblioteca {

    private String titulo;
    private int edicao;
    private String editora;

    public Revista(String titulo, int edicao, String editora) {
        this.titulo = titulo;
        this.edicao = edicao;
        this.editora = editora;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getEdicao() {
        return edicao;
    }

    public String getEditora() {
        return editora;
    }

    @Override
    public String aceitar(Visitor visitor) {
        return visitor.exibirRevista(this);
    }
}

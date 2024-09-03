package org.example;

public class Livro implements ItemBiblioteca {

    private String titulo;
    private String autor;
    private int paginas;

    public Livro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getPaginas() {
        return paginas;
    }

    @Override
    public String aceitar(Visitor visitor) {
        return visitor.exibirLivro(this);
    }
}

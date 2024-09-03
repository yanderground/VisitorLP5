package org.example;

public interface Visitor {
    String exibirLivro(Livro livro);
    String exibirRevista(Revista revista);
    String exibirDVD(DVD dvd);
}

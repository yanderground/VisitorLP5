package org.example;

public class ItemBibliotecaVisitor implements Visitor {

    public String exibir(ItemBiblioteca item) {
        return item.aceitar(this);
    }

    @Override
    public String exibirLivro(Livro livro) {
        return "Livro{" +
                "titulo='" + livro.getTitulo() + '\'' +
                ", autor='" + livro.getAutor() + '\'' +
                ", paginas=" + livro.getPaginas() +
                '}';
    }

    @Override
    public String exibirRevista(Revista revista) {
        return "Revista{" +
                "titulo='" + revista.getTitulo() + '\'' +
                ", edicao=" + revista.getEdicao() +
                ", editora='" + revista.getEditora() + '\'' +
                '}';
    }

    @Override
    public String exibirDVD(DVD dvd) {
        return "DVD{" +
                "titulo='" + dvd.getTitulo() + '\'' +
                ", diretor='" + dvd.getDiretor() + '\'' +
                ", duracao=" + dvd.getDuracao() + " minutos" +
                '}';
    }
}

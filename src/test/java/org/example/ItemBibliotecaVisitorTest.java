package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ItemBibliotecaVisitorTest {

    @Test
    void deveExibirLivro() {
        Livro livro = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1200);

        ItemBibliotecaVisitor visitor = new ItemBibliotecaVisitor();
        assertEquals("Livro{titulo='O Senhor dos Anéis', autor='J.R.R. Tolkien', paginas=1200}", visitor.exibir(livro));
    }

    @Test
    void deveExibirRevista() {
        Revista revista = new Revista("National Geographic", 202, "NatGeo");

        ItemBibliotecaVisitor visitor = new ItemBibliotecaVisitor();
        assertEquals("Revista{titulo='National Geographic', edicao=202, editora='NatGeo'}", visitor.exibir(revista));
    }

    @Test
    void deveExibirDVD() {
        DVD dvd = new DVD("Madmax", "George Miller", 120);

        ItemBibliotecaVisitor visitor = new ItemBibliotecaVisitor();
        assertEquals("DVD{titulo='Madmax', diretor='George Miller', duracao=120 minutos}", visitor.exibir(dvd));
    }
}

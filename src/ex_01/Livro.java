package ex_01;

public class TesteLivro {
    public static void main(String[] args) {
        Livro livro1 = new Livro("Cronicas de gelo e fogo - os ventos do inverno", "George R. R. martin", 1200);

        livro1.numeroDePaginas = 20;

        System.out.println(livro1);
        livro1.abrirLivro();
        livro1.lerPagina();
        System.out.println("Pagina atual: " + livro1.getPaginaAtual());
        ;
        System.out.println(livro1.livroAberto());
    }
}

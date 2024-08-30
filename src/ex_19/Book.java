package ex_19;

public class Testebook {
    public static void main(String[] args) {
        LivroDigital book = new LivroDigital("Cruso de desenvolvimento Indie","Amdré Young",5.80,true);
        book.abrirLivro();
        book.fechar();
    }
}

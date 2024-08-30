package ex_21;

public class Cozinha {
    private Integer qtapessoas;
    private  String cor;

    public Cozinha(Integer qtapessoas, String cor) {
        this.qtapessoas = qtapessoas;
        this.cor = cor;
    }

    public  void cozinhar(){
        System.out.println("Tem gente cozinhando!");
    }
    public  void limpar(){
        System.out.println("Tem gente limpando a cozinha!");
    }

    @Override
    public String toString() {
        return "Cozinha{" +
                "qtapessoas=" + qtapessoas +
                ", cor='" + cor + '\'' +
                '}';
    }
}

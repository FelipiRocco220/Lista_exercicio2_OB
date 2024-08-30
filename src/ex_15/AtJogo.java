package ex_15;

public class Jogo {
    private  String nome;
    private  String genero;
    private Integer preco;



    public Jogo(String nome, String genero, Integer preco) {
        this.nome = nome;
        this.genero = genero;
        this.preco = preco;
    }

    public void iniciar(){
        System.out.println("o jogo está abrindo");
    }
   public  void  pausa(){
       System.out.println("o jogo esta fechando");
   }

    @Override
    public String toString() {
        return "Jogo{" +
                "nome='" + nome + '\'' +
                ", genero='" + genero + '\'' +
                ", preco=" + preco +
                '}';
    }
}

package ex_17;


public class Animal {
    private  String especie;
    private  Integer idade;
    private  Integer peso;

    public Animal(String especie, Integer idade, Integer peso) {
        this.especie = especie;
        this.idade = idade;
        this.peso = peso;
    }

    public  void alimentar(){
        System.out.println(especie  + " Comendo");
    }
    public  void  dormir(){
        System.out.println(especie + " Dormindo");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "especie='" + especie + '\'' +
                ", idade=" + idade +
                ", peso=" + peso +
                '}';
    }
}

package Exercicio3;

public class Pessoa {

    //atributos
    private String nome;
    private String dataNascimento;
    private double altura;

    //construtor
    public Pessoa(String nome, String dataNascimento, double altura){
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.altura = altura;
    }


    //getters e setters
    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getDataNascimento(){
        return  dataNascimento;
    }

    public void setDataNascimento(String dataNascimento){
        this.dataNascimento = dataNascimento;
    }

    public double getAltura(){
        return  altura;
    }

    public void setAltura(double altura){
        this.altura = altura;
    }


    //Método para imprimir dados da pessoa
    public void exibirDados(){
        System.out.println("Nome: " + nome);
        System.out.println("Data de Nascimento: " + dataNascimento);
        System.out.println("Altura: " + altura);
    }

    //Método para calcular idade da pessoa

}

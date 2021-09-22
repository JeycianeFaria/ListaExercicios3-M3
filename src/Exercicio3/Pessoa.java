package Exercicio3;

public class Pessoa {

    //atributos
    private String nome;
    private Data dataNascimento;
    private double altura;

    //construtor
    public Pessoa(){

    }

    public Pessoa(String nome, Data dataNascimento, double altura){
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

    public Data getDataNascimento(){
        return  dataNascimento;
    }

    public void setDataNascimento(Data dataNascimento){
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
        System.out.println("Data de Nascimento: " + dataNascimento.getDia() + "/" + dataNascimento.getMes() + "/" + dataNascimento.getAno());
        System.out.println("Altura: " + altura);
    }

    //Método para calcular idade da pessoa
    public int calcularIdade(int anoAtual){
        int idade = anoAtual - dataNascimento.getAno();
        return idade;
    }

}

package Exercicio3;

public class Main {

    public static void main(String[] args) {

        Pessoa pessoa1 =new Pessoa();

        pessoa1.setNome("Jeyciane");
        pessoa1.setAltura(1.62);
        Data dataDeNascimento = new Data(16,01,1995);
        pessoa1.setDataNascimento(dataDeNascimento);


        pessoa1.exibirDados();



    }

}

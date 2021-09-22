package Exercicio3;

public class Main {

    public static void main(String[] args) {

        Pessoa pessoa1 =new Pessoa("Jeyciane", "16/01/1995", 1.62);

        System.out.println(pessoa1.getNome());
        System.out.println(pessoa1.getDataNascimento());
        System.out.println(pessoa1.getAltura());
        pessoa1.exibirDados();
        pessoa1.setNome("João");
        pessoa1.setDataNascimento("05/06/1998");
        pessoa1.setAltura(1.92);
        pessoa1.exibirDados();

    }

}

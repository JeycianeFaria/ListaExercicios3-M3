package Exercicio2;

public class Main {

    public static void main(String[] args) {

        //instanciando elevador
        Elevador elevador1 = new Elevador(10,8);

        elevador1.exibirElevador();
        elevador1.subirElevador(6);
        elevador1.entrarElevador(5);
        elevador1.descerElevador(3);
        elevador1.sairElevador(2);
        elevador1.descerElevador(1);
        elevador1.setCapacidadeElevador(10);
        elevador1.setTotalAndares(15);
        elevador1.exibirElevador();
        elevador1.setAndarAtual(16);
        elevador1.exibirElevador();
    }

}

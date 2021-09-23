package Exercicio4;

public class Main {

    public static void main(String[] args) {

        //instanciando objetos
        Televisao tv1 = new Televisao(20,7);
        ControleRemoto controle = new ControleRemoto();

        tv1.exibirDados();
        controle.trocarVolume("aumentar");
        tv1.exibirDados();

    }

}

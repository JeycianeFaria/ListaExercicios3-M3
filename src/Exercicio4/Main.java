package Exercicio4;

public class Main {

    public static void main(String[] args) {

        //instanciando objetos
        Televisao tv1 = new Televisao(20,7);
        ControleRemoto controle = new ControleRemoto(tv1);

        tv1.exibirDados();
        controle.aumentarvolume();
        tv1.exibirDados();
        controle.diminuirVolume();
        controle.diminuirVolume();
        tv1.exibirDados();
        controle.passarCanal();
        tv1.exibirDados();
        controle.voltarCanal();
        controle.voltarCanal();
        tv1.exibirDados();
        controle.selecionarCanal(15);
        tv1.exibirDados();


    }

}

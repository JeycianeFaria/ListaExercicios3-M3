package Exercicio4;

public class Televisao {

    private int volume;
    private int canal;


    //construtores
    public Televisao(){

    }

    public Televisao(int volume, int canal){

        this.volume = volume;
        this.canal = canal;

    }


    //getters e setters

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }


    //exibirDadosAtuais
    public void exibirDados(){
        System.out.println("Volume: " + volume);
        System.out.println("Canal: " + canal);
        System.out.println("=================================");
    }

}

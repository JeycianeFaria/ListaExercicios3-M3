package Exercicio4;

public class Televisao {

    private int volume;
    private int canal;


    //construtor
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

    public void setVolume() {
        this.volume += 1;
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }


    //métodos para aumentar volume
    public void aumentarVolume(){
        volume += 1;
    }


    //método para dimunuir volume
    public void diminuirVolume(){
        volume -= 1;
    }


    //método para passar o Canal
     public void passarCanal(){
        canal += 1;
     }


    //método para voltar o Canal
    public void voltarCanal(){
        canal -= 1;
    }


    //método para trocar Canal
    public void trocarCanal(int canal){
        this.canal = canal;
    }


    //exibirDadosAtuais
    public void exibirDados(){
        System.out.println("Volume: " + volume);
        System.out.println("Canal: " + canal);
    }

}

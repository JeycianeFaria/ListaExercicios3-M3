package Exercicio4;

public class ControleRemoto {

    private int aumentarVolume;
    private int diminuirVolume;
    private int passarCanal;
    private int voltarCanal;

    //construtor
    public ControleRemoto(){

    }

    //getters e setters

    public int getAumentarVolume() {
        return aumentarVolume;
    }

    public void setAumentarVolume(int aumentarVolume) {
        this.aumentarVolume++;
    }

    public int getDiminuirVolume() {
        return diminuirVolume;
    }

    public void setDiminuirVolume(int diminuirVolume) {
        this.diminuirVolume--;
    }

    public int getPassarCanal() {
        return passarCanal;
    }

    public void setPassarCanal(int passarCanal) {
        this.passarCanal++;
    }

    public int getVoltarCanal() {
        return voltarCanal;
    }

    public void setVoltarCanal(int voltarCanal) {
        this.voltarCanal--;
    }

}

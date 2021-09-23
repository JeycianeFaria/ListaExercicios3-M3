package Exercicio4;

public class ControleRemoto{

    Televisao tv;

    public ControleRemoto(Televisao tv){
        this.tv = tv;
    }

    public void aumentarvolume(){
        int aumentar = tv.getVolume() + 1 ;
        tv.setVolume(aumentar);
    }

    public void diminuirVolume(){
        int diminuir = tv.getVolume() - 1;
        tv.setVolume(diminuir);
    }

    public void passarCanal(){
        int passar = tv.getCanal() + 1;
        tv.setCanal(passar);
    }

    public void voltarCanal(){
        int voltar = tv.getCanal() - 1;
        tv.setCanal(voltar);
    }

    public void selecionarCanal(int canal){
        tv.setCanal(canal);
    }

}

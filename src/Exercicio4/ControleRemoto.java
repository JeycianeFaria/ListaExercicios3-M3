package Exercicio4;

public class ControleRemoto{

    Televisao tv;

    public ControleRemoto(Televisao tv){
        this.tv = tv;
    }

    public void aumentarvolume(){

        if(tv.getVolume() < 100){
            int aumentar = tv.getVolume() + 1 ;
            tv.setVolume(aumentar);
        }else {
            System.out.println("Volume maximo atingido: " + tv.getVolume());
            System.out.println("Atenção: Volume muito alto pode prejudicar sua audição!");
        }

    }

    public void diminuirVolume(){

        if (tv.getVolume() > 0){
            int diminuir = tv.getVolume() - 1;
            tv.setVolume(diminuir);
        }else{
            System.out.println("A TV já está no mudo");
        }

    }


    public void passarCanal(){

        if(tv.getCanal() > 0){
            int passar = tv.getCanal() + 1;
            tv.setCanal(passar);
        }else {
            System.out.println("Erro!");
        }

    }

    public void voltarCanal(){

        if (tv.getCanal() > 0){
            int voltar = tv.getCanal() - 1;
            tv.setCanal(voltar);
        }else {
            System.out.println("Erro!");
        }

    }

    public void selecionarCanal(int canal){
        tv.setCanal(canal);
    }

}

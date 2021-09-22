package Exercicio2;

public class Elevador {

    private int terreo = 0;
    private int andarAtual = terreo;
    private int totalAndares;
    private int capacidadeElevador;
    private int qtdPessoasDentro;


    //metodo construtor
    public Elevador(int totalAndares, int capacidadeElevador) {
        this.totalAndares = totalAndares;
        this.capacidadeElevador = capacidadeElevador;
    }

    //getters
    public int getTerreo(){
        return terreo;
    }

    public int getAndarAtual(){
        return andarAtual;
    }

    public int getTotalAndares(){
        return  totalAndares;
    }

    public int getCapacidadeElevador(){
        return capacidadeElevador;
    }

    public int getQtdPessoasDentro(){
        return qtdPessoasDentro;
    }

    //setters
    public void setTerreo(int terreo){
        this.terreo = terreo;
    }

    public void setTotalAndares(int totalAndares){
        this.totalAndares = totalAndares;
    }

    public void setCapacidadeElevador(int capacidadeElevador){
        this.capacidadeElevador = capacidadeElevador;
    }

    public void setAndarAtual(int andarAtual){
        if (andarAtual >= terreo && andarAtual <= totalAndares){
            if (andarAtual > this.andarAtual){
                System.out.println("\nSubindo para o  " + andarAtual + "º andar!");
            }else if(andarAtual == terreo){
                System.out.println("\nDescendo para o  Terreo!");
            }
            else{
                System.out.println("\nDescendo para o  " + andarAtual + "º andar!");
            }
            this.andarAtual = andarAtual;

        }else if (andarAtual > totalAndares){
            System.out.println("\nNão é possivel subir além do numero máximo de andares!");
            System.out.println("Número de andares: " + totalAndares);
        }else if (andarAtual < terreo){
            System.out.println("\nNão é possivel descer além do terreo!");
            System.out.println("Terreo : " + terreo);
        }
    }

    //metodo para exibir o elevador
    public void exibirElevador() {
        System.out.println("\nO elevador está no andar : " + andarAtual);
        System.out.println("Quantidade de pessoas dentro:  " + qtdPessoasDentro);
        System.out.println("Número de andares: " + totalAndares);
        System.out.println("Capacidade maxima de pessoas: " + capacidadeElevador);
    }

    //metodo para entrar no elevador
    public void entrarElevador(int qtdEntrar) {

        int totalPessoas = qtdPessoasDentro + qtdEntrar;

        if (totalPessoas <= capacidadeElevador) {
            qtdPessoasDentro = totalPessoas;
            System.out.println("\nAinda há espaço, pode entrar!");

        } else if (totalPessoas > capacidadeElevador) {
            System.out.println("\nO elevador não comporta essa quantidade de pessoas!");
            System.out.println("\nA capacidade maxima de pessoas é de : " + capacidadeElevador);
        } else {
            System.out.println("\nO elevador está lotado, aguarde o proximo!");
            System.out.println("Quantidade de pessoas dentro do elevador = " + qtdPessoasDentro);
        }

    }

    //metodo para sair do Elevador
    public void sairElevador(int qtdSair) {

        if(qtdSair <= qtdPessoasDentro){
            if (qtdSair > 0) {
                qtdPessoasDentro -= qtdSair;
                System.out.println("\nTchau, tchau!");

            } else if (qtdSair < 0) {
                System.out.println("\nErro.");
                System.out.println("Quantidade de pessoas dentro do elevador = " + qtdPessoasDentro);

            } else {
                System.out.println("\nO elevador está vazio!");
            }
        }else {
            System.out.println("\nNão é possivel sair mais pessoas do que as que estão dentro do elevador!");
            System.out.println("Quantidade de pessoas dentro do elevador = " + qtdPessoasDentro);
        }



    }
}

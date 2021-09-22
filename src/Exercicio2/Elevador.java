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


    //metodo para o elevador descer
    public void descerElevador(int andarDesejado) {

        if (andarDesejado < totalAndares && andarAtual > andarDesejado) {

            if (andarDesejado >= terreo ) {

                andarAtual = andarDesejado;
                System.out.println("\nDescendo para o " + andarDesejado + "º andar");

            } else {
                System.out.println("\nO elevador está no térreo");
            }

        } else {
            System.out.println("\nPara descer digite um valor abaixo do andar atual!");
        }

    }

}

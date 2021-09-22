package Exercicio1;

public class ContaBancaria {

    private String nomeCorrentista;
    private String numeroConta;
    private double saldoConta;

    //metodo construtor
    public ContaBancaria(String nomeCorrentista, String numeroConta, double saldoConta){
        this.nomeCorrentista = nomeCorrentista;
        this.numeroConta = numeroConta;
        this.saldoConta = saldoConta;
    }


    //getters
    public String getNomeCorrentista(){
        return nomeCorrentista;
    }

    public String getNumeroConta(){
        return numeroConta;
    }

    public double getSaldoConta(){
        return saldoConta;
    }

    //setters
    public void setNomeCorrentista(String nomeCorrentista){
        this.nomeCorrentista = nomeCorrentista;
    }

    public void setNumeroConta(String numeroConta){
        this.numeroConta = numeroConta;
    }



    //metodo saque
    public void saque(double valorSaque){
        saldoConta -= valorSaque;
    }

    //metodo deposito
    public void deposito(double valorDeposito){
        saldoConta += valorDeposito;
    }


    //metodo exibir o extrato
    public void extrato(){
        System.out.println("\nNome Correntista: " + nomeCorrentista);
        System.out.println("Numero da Conta: " + numeroConta);
        System.out.println("Saldo: " + saldoConta);
    }

}

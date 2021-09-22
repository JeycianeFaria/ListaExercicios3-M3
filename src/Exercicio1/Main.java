package Exercicio1;

import Exercicio1.ContaBancaria;

public class Main {

    public static void main(String[] args) {

        //instanciando contas
        ContaBancaria conta1 = new ContaBancaria("Jeyciane","7777-7",1000);


        conta1.extrato();
        conta1.deposito(500);
        conta1.extrato();
        conta1.saque(50);
        conta1.extrato();
    }

}

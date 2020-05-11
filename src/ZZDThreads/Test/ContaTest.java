/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ZZDThreads.Test;

import ZZDThread.classes.Conta;

/**
 *
 * @author JoãoMarcus
 */
public class ContaTest implements Runnable {
    private Conta conta = new Conta();
    
    public static void main(String[] args) {
        ContaTest contaTest = new ContaTest();
        Thread william = new Thread(contaTest, "Willian");
        Thread ana = new Thread(contaTest, "Ana");
        william.start();
        
        ana.start();
    }
    
    public static void imprime() {
        synchronized(ContaTest.class) {
            System.out.println("isajsaisaj");

        }
    }
    
    private void saque(int valor) {
        synchronized(conta) {
            if(conta.getSaldo() >= valor) {
                System.out.println(Thread.currentThread().getName() +" está indo sacar");
                conta.saque(valor);
                System.out.println(Thread.currentThread().getName() + " completou o saque, seu saldo é "+conta.getSaldo());

            } else {
                System.out.println("Seu saldo é insuficiente "+Thread.currentThread().getName() + " efetuar o saque, saldo: "+conta.getSaldo());
            }
        }
    }
    
    @Override
    public void run() {
        for(int i = 0; i < 5; i++) {
            saque(10);
            if(conta.getSaldo() < 0) {
                System.out.println("Oh meu deus!!");
            }
        }
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import java.util.Scanner;

/**
 *
 * @author 49401027854
 */
public class Programa {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Conta minhaConta = new Conta(); // criando um objeto
        System.out.println("Digite um valor para deposito: ");
        minhaConta.deposita(entrada.nextDouble());
        System.out.println("\nSaldo minha conta: "+minhaConta.saldo);
        
        System.out.println("Digite um valor para sacar: ");
        minhaConta.saca(entrada.nextDouble());
        System.out.println("\nSaldo minha conta: "+minhaConta.saldo);
        //minhaConta.saldo = 1000;
        //minhaConta.deposita(1000);
       
        
          
        
        
        
        
    }
}

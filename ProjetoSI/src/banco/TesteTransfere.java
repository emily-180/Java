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
public class TesteTransfere {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Conta conta1 = new Conta();
        System.out.println("Digite um valor para depositar na conta 1:");
        conta1.deposita(entrada.nextDouble());
        
        Conta conta2 = new Conta();
        System.out.println("Digite um valor para depositar na conta 2:");
        conta2.deposita(entrada.nextDouble());
        
        System.out.println("Digite um valor para transferir:");
        conta1.transfere(conta2, entrada.nextDouble());
        System.out.println("Saldo minha conta1: "+conta1.getSaldo());
        System.out.println("Saldo minha conta2: "+conta2.getSaldo());
    }
    
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import java.util.Scanner;

/**
 *
 * @author tulio
 */
public class Programa {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        /*
        Conta minhaConta = new Conta();
        Conta c1 = new Conta();
                
        System.out.println("Digite um valor para depósito:");
        minhaConta.deposita(entrada.nextDouble());
        
        System.out.println("Digite um valor para saque:");
        if(minhaConta.saca(entrada.nextDouble())==true){
            System.out.println("Saque realizado com sucesso");  
        }   
     
        System.out.println("Digite um valor para transferir:");
        minhaConta.transfere(c1, entrada.nextDouble());;
        */

        // Exercicio 1 e 2
        Funcionario f1 = new Funcionario();
        int valor;
        System.out.println("Digite um nome:");
        f1.setNome(entrada.nextLine());
        System.out.println("Digite um rg:");
        f1.setRg(entrada.nextLine());
        System.out.println("Digite um departamento:");
        f1.setDepartamento(entrada.nextInt());
        System.out.println("Digite um salario:");
        f1.setSalario(entrada.nextDouble());
        clearBuffer(entrada);
        System.out.println("Digite uma data de entrada no serviço:");
        f1.setDataEntrada(entrada.nextLine());
        System.out.println("Ativo? 1-sim | 2-nao:");
        f1.setAtivo(true);  
                    
        System.out.println("Digite um valor para bonificacao:");
        f1.bonifica(entrada.nextDouble());
        System.out.println("Bonificacao: "+f1.getSalario());
        
        System.out.println(" ");
        System.out.println("Dados do funcionario: "+f1.getNome());
        System.out.println("Salario : "+f1.getSalario());
        System.out.println("Ativo? "+f1.isAtivo());
        
        //chamando o metodo demite
        f1.demite();
        System.out.println("Ativo? "+f1.isAtivo());
    }
    
    private static void clearBuffer(Scanner scanner) {
        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }
    }
}

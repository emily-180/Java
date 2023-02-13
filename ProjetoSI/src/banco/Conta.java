/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author 49401027854
 */
public class Conta {
    String cliente;
    double saldo;
    double limite;
    
    public void deposita(double saldo){ //metodo
        this.saldo = this.saldo + saldo;  //this diferencia a variavel local, saldo poderia ter outro nome
        System.out.println("Deposito relizado com sucesso!");
    }
    public void saca(double saldo){ //metodo
        this.saldo = this.saldo - saldo;  //this diferencia a variavel local, saldo poderia ter outro nome
        System.out.println("Saque relizado com sucesso!");
    }
}

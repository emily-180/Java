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
public class TesteReferenciaCliente {
    public static void main(String[] args){
        Conta c1 = new Conta();
        Cliente cliente1 = new Cliente(); //criei um objeto
        c1.titular = cliente1;
        c1.titular.setNome("Emily Linda");
        System.out.println("Nome: "+c1.titular.getNome());
        c1.deposita(5000);
    }
}

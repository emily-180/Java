/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author tulio
 */
public class Conta {

    Cliente titular;// atributos ou variáveis de instância
    Cliente objCliente2 = new Cliente();
    private double saldo;
    private double limite;
    
    public Double getSaldo(){
        return this.saldo;
    }
    
    public void deposita(double saldo){ // método
        this.saldo = this.saldo +saldo;
        System.out.println("Deposito realizado para: "+ objCliente2.getNome());
    }
    
    public boolean saca(double saldo){ // método
        if(this.saldo>=saldo){
            this.saldo = this.saldo -saldo; 
            return true;
        }else{
            System.out.println("Saldo insuficiente");
         return false;   
        }
        
    }
    
    boolean transfere(Conta destino, double valor){
        if(this.saca(valor)==true){
            destino.deposita(valor);
            return true;
        }            
        else{
            System.out.println("Não deu pra sacar!");
            return false;
        }
    }
    
   
}

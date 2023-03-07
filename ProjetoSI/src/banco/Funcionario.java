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
public class Funcionario {
    private String nome;
    private int departamento;
    private double salario;
    private String dataEntrada;
    private String rg;
    private boolean ativo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDepartamento() {
        return departamento;
    }

    public void setDepartamento(int departamento) {
        this.departamento = departamento;
    }

    public String getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(String dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }
    
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
    
    public void bonifica(double valor){ // método
        this.salario += valor;         
        System.out.println("Você recebeu bonificação!");
    }
    
    public void demite(){ // método
        if(ativo != false){
            ativo = false;
            System.out.println("Esse funcionario não está mais empregado!");
        }else
            System.out.println("Esse funcionario já não estava empregado!");
    }
    
    void mostra() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Departamento: " + this.departamento);
        System.out.println("Salario: " + this.salario);
        System.out.println("Data entrada: " + this.dataEntrada);
        System.out.println("Rg: " + this.rg);
        System.out.println("Ativo: " + this.ativo);
    }
}

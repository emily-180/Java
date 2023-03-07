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
public class Cliente {
    private String nome;
    private String sobrenome;
    private String cpf;
    
    public void setNome(String nome){ //envia dado pro atributo
        this.nome=nome;
    }
    
    public String getNome(){  //retorna o valor do atributo
        return this.nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    
}

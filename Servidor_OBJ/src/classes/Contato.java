/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;
import java.io.Serializable;

/**
 *
 * @author Nalberthy-PC
 */
public class Contato implements Serializable{
    private String cpf;
    private String nome;
    private String telefone;

    public Contato() {
    }

    public Contato( String nome, String cpf, String telefone) {
        this.cpf = cpf;
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

   
    @Override
     public String toString() {
        return "contato{" + "cpf=" + cpf + "nome=" + nome + ", telefone=" + telefone +'}';
    }
}

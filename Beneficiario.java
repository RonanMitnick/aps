/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aps;

/**
 *
 * @author Matheus
 */
public abstract class Beneficiario {
    private String nome;
    private String cpf;
    private int nPessoas;
    Double renda;
    
    public Beneficiario(String nome,String cpf, int nPessoas, Double renda){
        this.nome = nome;
        this.cpf = cpf;
        this.nPessoas = nPessoas;
        this.renda = renda;
        
    }
    
    
    
}

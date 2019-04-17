/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.classes;

/**
 *
 * @author FSCHNCA01
 */
public class Aluno extends Pessoa{
    
    private int numeroMatricula;
    private double valorMensalidade;
    
    //Construtor
    public Aluno()
    {
        
    }    
    

    /**
     * @return the numeroMatricula
     */
    public int getNumeroMatricula() {
        return numeroMatricula;
    }

    /**
     * @param numeroMatricula the numeroMatricula to set
     */
    public void setNumeroMatricula(int numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

    /**
     * @return the valorMensalidade
     */
    public double getValorMensalidade() {
        return valorMensalidade;
    }

    /**
     * @param valorMensalidade the valorMensalidade to set
     */
    public void setValorMensalidade(double valorMensalidade) {
        this.valorMensalidade = valorMensalidade;
    }
    
    
}

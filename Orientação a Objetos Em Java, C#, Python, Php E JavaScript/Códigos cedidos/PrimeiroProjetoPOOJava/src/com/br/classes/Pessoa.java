/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.classes;

import java.sql.Date;
import java.util.ArrayList;

/**
 *
 * @author FSCHNCA01
 */
public abstract class Pessoa {
    
    private String nome;
    private String sobrenome;
    private Date dataNascimento;
    private int carteiraTrabalho;
    
    private ArrayList<Endereco> enderecos;
    private ArrayList<Telefone> telefones;
    
    public Pessoa()
    {
        enderecos = new ArrayList<Endereco>();
        telefones = new ArrayList<Telefone>();
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the sobrenome
     */
    public String getSobrenome() {
        return sobrenome;
    }

    /**
     * @param sobrenome the sobrenome to set
     */
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    /**
     * @return the dataNascimento
     */
    public Date getDataNascimento() {
        return dataNascimento;
    }

    /**
     * @param dataNascimento the dataNascimento to set
     */
    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    /**
     * @return the carteiraTrabalho
     */
    public int getCarteiraTrabalho() {
        return carteiraTrabalho;
    }

    /**
     * @param carteiraTrabalho the carteiraTrabalho to set
     */
    public void setCarteiraTrabalho(int carteiraTrabalho) {
        this.carteiraTrabalho = carteiraTrabalho;
    }

    /**
     * @return the enderecos
     */
    public ArrayList<Endereco> getEnderecos() {
        return enderecos;
    }

    /**
     * @param enderecos the enderecos to set
     */
    public void setEnderecos(ArrayList<Endereco> enderecos) {
        this.enderecos = enderecos;
    }

    /**
     * @return the telefones
     */
    public ArrayList<Telefone> getTelefones() {
        return telefones;
    }

    /**
     * @param telefones the telefones to set
     */
    public void setTelefones(ArrayList<Telefone> telefones) {
        this.telefones = telefones;
    }
    
    
    
    
}

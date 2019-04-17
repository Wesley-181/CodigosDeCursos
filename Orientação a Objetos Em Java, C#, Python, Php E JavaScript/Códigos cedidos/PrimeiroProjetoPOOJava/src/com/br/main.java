/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br;

import com.br.classes.Aluno;
import com.br.classes.Endereco;
import com.br.classes.Funcionario;
import com.br.classes.Professor;
import com.br.classes.Telefone;
import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;



/**
 *
 * @author FSCHNCA01
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<Aluno> alunos = new ArrayList<Aluno>();
        ArrayList<Professor> professores = new ArrayList<Professor>();
        ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
        
        Aluno aluno;
        Funcionario funcionario;
        Professor professor;
        Endereco enderecosAlunos;
        Telefone telefonesAlunos;
        
        
        
        //Primeiro cadastro de aluno
        aluno = new Aluno();
        aluno.setNome("Fabiano");
        aluno.setSobrenome("Schincariol");
        aluno.setDataNascimento(Date.valueOf(LocalDate.now()));
        aluno.setCarteiraTrabalho(11000);
        aluno.setNumeroMatricula(14520);
        aluno.setValorMensalidade(1100.00);
        
        //endereco 01
        enderecosAlunos = new Endereco();
        enderecosAlunos.setTipoLogradouro("Rua");
        enderecosAlunos.setLogradouro("Xavier");
        enderecosAlunos.setNumeroLogradouro(145);
        enderecosAlunos.setBairro("Centro");
        enderecosAlunos.setCidade("Capivari");
        enderecosAlunos.setEstado("SP");
        
        //telefone 01
        telefonesAlunos = new Telefone();
        telefonesAlunos.setDdd(19);
        telefonesAlunos.setNumero(99999999);
        telefonesAlunos.setTipoTelefone("Residencial");
        
        //adiconei em Aluno
        aluno.getEnderecos().add(enderecosAlunos);
        aluno.getTelefones().add(telefonesAlunos);
        
        //endereço 02
        enderecosAlunos = new Endereco();
        enderecosAlunos.setTipoLogradouro("Rua");
        enderecosAlunos.setLogradouro("Silva");
        enderecosAlunos.setNumeroLogradouro(250);
        enderecosAlunos.setBairro("Raia");
        enderecosAlunos.setCidade("Capivari");
        enderecosAlunos.setEstado("SP");
        
        //telefone 02
        telefonesAlunos = new Telefone();
        telefonesAlunos.setDdd(19);
        telefonesAlunos.setNumero(55555555);
        telefonesAlunos.setTipoTelefone("Trabalho");
        
        //adicionei outro endereco e telefone no aluno
        aluno.getEnderecos().add(enderecosAlunos);
        aluno.getTelefones().add(telefonesAlunos);
        
        
        alunos.add(aluno);//jogar tudo no ArrayList<Aluno>
        
        ////////////////////////////////////////////////////////////////
        
        //Segundo cadastro de aluno
        aluno = new Aluno();
        aluno.setNome("Claudio");
        aluno.setSobrenome("Silva");
        aluno.setDataNascimento(Date.valueOf(LocalDate.now()));
        aluno.setCarteiraTrabalho(12000);
        aluno.setNumeroMatricula(5202);
        aluno.setValorMensalidade(950.00);
        
        //endereco 01
        enderecosAlunos = new Endereco();
        enderecosAlunos.setTipoLogradouro("Rua");
        enderecosAlunos.setLogradouro("Tambor");
        enderecosAlunos.setNumeroLogradouro(1450);
        enderecosAlunos.setBairro("Centro");
        enderecosAlunos.setCidade("Capivari");
        enderecosAlunos.setEstado("SP");
        
        //telefone 01
        telefonesAlunos = new Telefone();
        telefonesAlunos.setDdd(19);
        telefonesAlunos.setNumero(88888888);
        telefonesAlunos.setTipoTelefone("Residencial");
        
        //adiconei em Aluno
        aluno.getEnderecos().add(enderecosAlunos);
        aluno.getTelefones().add(telefonesAlunos);
        
        //endereço 02
        enderecosAlunos = new Endereco();
        enderecosAlunos.setTipoLogradouro("Rua");
        enderecosAlunos.setLogradouro("Alfredo");
        enderecosAlunos.setNumeroLogradouro(785);
        enderecosAlunos.setBairro("Raia");
        enderecosAlunos.setCidade("Capivari");
        enderecosAlunos.setEstado("SP");
        
        //telefone 02
        telefonesAlunos = new Telefone();
        telefonesAlunos.setDdd(19);
        telefonesAlunos.setNumero(11111111);
        telefonesAlunos.setTipoTelefone("Trabalho");
        
        //adicionei outro endereco e telefone no aluno
        aluno.getEnderecos().add(enderecosAlunos);
        aluno.getTelefones().add(telefonesAlunos);
        
        
        alunos.add(aluno);//jogar tudo no ArrayList<Aluno>
        
        ////////////////////////////////////////////////////////////////
        
        
        //Mostrar dados Alunos
        String msg = "Lista de Alunos com Endereços e Telefones\n\n";

        for (Aluno al : alunos) {
            
            msg += "Aluno\n\n";
            msg += "Nome: " + al.getNome() + "\n";
            msg += "Sobrenome: " + al.getSobrenome() + "\n";
            msg += "Data Nascimento: " + al.getDataNascimento() + "\n";
            msg += "Carteira Trabalho: " + al.getCarteiraTrabalho() + "\n";
            msg += "Numero Matricula: " + al.getNumeroMatricula() + "\n";
            msg += "Valor Mensalidade: " + al.getValorMensalidade() + "\n";
            msg += "--------------------------------------------\n";

            msg += "Endereco(s): \n\n";

            for (Endereco alE : al.getEnderecos()) {
                msg += "Tipo Logradouro: " + alE.getTipoLogradouro() + "\n";
                msg += "Logradouro: " + alE.getLogradouro() + "\n";
                msg += "Número: " + alE.getNumeroLogradouro() + "\n";
                msg += "Bairro: " + alE.getBairro() + "\n";
                msg += "Cidade: " + alE.getCidade() + "\n";
                msg += "Estado: " + alE.getEstado() + "\n";
                msg += "--------------------------------------------\n \n";
            }
            
            msg += "Telefone(s): \n\n";
            
            for (Telefone alT : al.getTelefones())
            {
                msg += "DDD: " + alT.getDdd() + "\n";
                msg += "Número: " + alT.getNumero() + "\n";
                msg += "Tipo Telefone: " + alT.getTipoTelefone() + "\n";
                msg += "--------------------------------------------\n \n";
            }
            
            msg += "--------------------------------------------\n";
        }
        
        System.out.println(msg);
        
    }

}

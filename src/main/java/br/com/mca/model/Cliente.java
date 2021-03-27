
package br.com.mca.model;

import java.sql.Date;

public class Cliente {
    private Integer codigo;
    private String nome;
    private String cpf;
    private Date nascimento;
    private String sexo;
    private String telefone;
    private String endereco;

 
    public Integer getCodigo() {
        return codigo;
    }

    
    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    
    public void setNome(String nome) {
        this.nome = nome;
    }

    
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    
    public Date getNascimento() {
        return nascimento;
    }

    
    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }
    
    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getTelefone() {
        return telefone;
    }

   
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }   

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    
}

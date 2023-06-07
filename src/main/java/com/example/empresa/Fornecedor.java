package com.example.empresa;
import java.util.ArrayList;
import java.util.List;

public class Fornecedor {
    private String cnpj;
    private String telefone;
    private String nome;


    public Fornecedor() {
        super();
    }

    public Fornecedor(String cnpj, String telefone, String nome, Produto produtos){
        super();
        this.cnpj = cnpj;
        this.telefone = telefone;
        this.nome = nome;

    }

    public String getCnpj() {
        return cnpj;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
       return "Fornecedor:" + nome + "| CNPJ: " + cnpj + "\n" + "Telefone:" + telefone;
    }
}

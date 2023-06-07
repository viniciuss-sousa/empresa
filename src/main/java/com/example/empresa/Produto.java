package com.example.empresa;
import java.util.List;


public class Produto {
    private int codigo;
    private String nome;
    private float valorProduto;
    private int aumento;
    private Fornecedor fornecedor;


    public Produto() {
        super();
    }

    public Produto(int codigo, String nome, float valorProduto, int aumento, Fornecedor fornecedor) {
        super();
        this.codigo = codigo;
        this.nome = nome;
        this.valorProduto = valorProduto;
        this.aumento = aumento;
        this.fornecedor = fornecedor;

    }

    public boolean atualizarPreco(float valorProduto) {
        boolean retorno;
        if (this.valorProduto > 0) {
            this.aumento = (int) (this.valorProduto + (float) 1);
            return true;
        } else {
            return false;
        }
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getValor() {
        return valorProduto;
    }

    public void setValorProduto(float valorProduto) {
        this.valorProduto = valorProduto;
    }

    public int getAumento() {
        return aumento;
    }

    public void seAumento(int aumento) {
        this.aumento = aumento;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }


    @Override
    public String toString() {
        return "Produto{" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                ", valor=" + valorProduto +
                ", fornecedor=" + fornecedor +
                '}';
    }
}

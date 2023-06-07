package com.example.empresa;
import java.util.ArrayList;


public class ConjuntoProdutos {
    private Fornecedor fornecedor;
    private Produto prod;
    private ArrayList<Produto>produtos;

    public ConjuntoProdutos(){
            super();
    }

    public ConjuntoProdutos(Fornecedor fornecedor,Produto prod, ArrayList<Produto> produtos){
        super();
        this.fornecedor = fornecedor;
        this.prod = prod;
        this.produtos = produtos;
    }

/*    public boolean inserir(int valor){
        if(!setProdutos(Produto.getcodigo())){

            return true;
        }
    }*/


    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public Produto getProd() {
        return prod;
    }

    public void setProd(Produto prod) {
        this.prod = prod;
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }
}




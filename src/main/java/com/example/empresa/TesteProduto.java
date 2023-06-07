package com.example.empresa;

import com.example.empresa.Fornecedor;
import com.example.empresa.Produto;
import com.example.empresa.ConjuntoProdutos;

public class TesteProduto {
    public static void main(String[] args) {
        Fornecedor forncedorDanilo = new Fornecedor("06.009.760/0001-46", "3530-0255", "Danilo Farias Leite", null);
        Fornecedor fornecedorVini = new Fornecedor("21.061.424/0001-36", "4002-8922", "Vinicius Carlos da Silva", null);

        Produto produto1 = new Produto(03, "LCD", 3500, 0, fornecedorVini);
        Produto produto2 = new Produto(05, "Notebook", 2000, 0, forncedorDanilo);
        Produto produto3 = new Produto(84, "Impressora", 232, 0, forncedorDanilo);

        Fornecedor produtos = new Fornecedor();
        Produto prod = new Produto();

        System.out.println();
    }
}
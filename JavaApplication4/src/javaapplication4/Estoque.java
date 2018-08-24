/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

/**
 *
 * @author ice
 */
public class Estoque {
    public String nome;
    public int quantidadeAtual;
    public int quantidadeMinima;
    Estoque(String nome, int quantidadeAtual, int quantidadeMinima){
        this.nome = nome;
        this.quantidadeAtual = quantidadeAtual;
        this.quantidadeMinima = quantidadeMinima;
    }
    public void modificaNome(String nome){
        this.nome = nome;
    }
    public void repoeEstoque(int quantidadeAtual){
        this.quantidadeAtual = quantidadeAtual + this.quantidadeAtual;
    }
    public void alteraQuantidadeMinima(int quantidadeMinima){
        this.quantidadeMinima = quantidadeMinima;
    }
    public void imprimeDadosProduto(){
        System.out.println("Nome: "+nome+" \nQuantidade Atual: "+quantidadeAtual+" \nQuantidade Minima: "+quantidadeMinima+ "\n");
    }
    public void baixaNoProduto(int baixa){
        quantidadeAtual = quantidadeAtual - baixa;
        verificaProdutos();
    }
    public void verificaProdutos(){
        if (quantidadeAtual<=quantidadeMinima){    
            System.out.println("Quantidade Atual menor ou igual a Quantidade Mínima, reponha o estoque do produto - "+nome+"\n");
        }
        else {
            System.out.println("Quantidade OK - "+nome+"\n");
        }
    }   
}

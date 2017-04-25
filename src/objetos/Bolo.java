/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

import java.util.List;

/**
 *
 * @author lenovo
 */
public class Bolo {
    
    private int id;
    private String tamanho;
    private double preco;
    private String descricao;
    public List<BoloIngredientes> ingredientes;
    
    public Bolo(int id, String tamanho, double preco, String descricao, List<BoloIngredientes> ingredientes)
    {
        this.id = id;
        this.tamanho = tamanho;
        this.preco = preco;
        this.descricao = descricao;
        this.ingredientes = ingredientes;
    }

    public int getId() {
        return id;
    }


    public String getTamanho() {
        return tamanho;
    }


    public double getPreco() {
        return preco;
    }


    public String getDescricao() {
        return descricao;
    }


    public List<BoloIngredientes> getIngredientes() {
        return ingredientes;
    }
}

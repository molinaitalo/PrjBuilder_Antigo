/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Italo
 */
public class BoloDiretor {
    private int id;
    private String tamanho;
    private double preco;
    private String descricao;
    public List<BoloIngredientes> todosIngredientes = new ArrayList<BoloIngredientes>();
    
    public void id(int id)
    {
        this.id = id;
    }
    
    public void tamanho(String tamanho)
    {
        this.tamanho = tamanho;
    }
    
    public void preco(double preco)
    {
        this.preco = preco;
    }
    
    public void descricao(String descricao)
    {
        this.descricao = descricao;
    }
    
    public void ingrediente(BoloIngredientes ingrediente) {
        todosIngredientes.add(ingrediente);
        preco += ingrediente.getValor();
    }
    
    public Bolo constroi()
    {
        return new Bolo(id, tamanho, preco, descricao, todosIngredientes);
    }
}

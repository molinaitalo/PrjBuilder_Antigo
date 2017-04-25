/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

/**
 *
 * @author lenovo
 */
public class BoloIngredientes {
    
    private String ingrediente;
    private double valor;
    
    public BoloIngredientes (String ingrediente, double valor)
    {
        this.ingrediente = ingrediente;
        this.valor = valor;
    }

    public String getIngrediente() {
        return ingrediente;
    }

    public double getValor() {
        return valor;
    }
}

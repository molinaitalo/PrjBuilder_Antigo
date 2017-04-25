/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prjbuilder;

import janelas.home;
import objetos.Bolo;
import objetos.BoloDiretor;
import objetos.BoloIngredientes;

/**
 *
 * @author aluno
 */
public class PrjBuilder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        home home = new home();
        home.setVisible(true);
        
        int i;
        
        BoloDiretor builder = new BoloDiretor();
        builder.id(1);
        builder.descricao("Bolo de Cenoura");
        builder.tamanho("Médio");
        builder.ingrediente(new BoloIngredientes("2 Xíc. de Farinha", 3.00));
        builder.ingrediente(new BoloIngredientes("3 Ovos", 2.00));
        builder.ingrediente(new BoloIngredientes("2 Cenouras", 1.00));
        
        Bolo bolo = builder.constroi();
        
        System.out.println("Id: " + bolo.getId());
        System.out.println("Descrição:" + bolo.getDescricao());
        System.out.println("Tamanho: " + bolo.getTamanho());
        System.out.println("Preço: " + bolo.getPreco());
        System.out.println("Ingredientes: ");
        
        for (i=0; i< bolo.ingredientes.size(); i++) {
            BoloIngredientes ing = bolo.ingredientes.get(i);
            System.out.println(ing.getIngrediente());
	}
    }
    
}

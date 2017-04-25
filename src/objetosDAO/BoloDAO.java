/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetosDAO;

import Utilitarios.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import objetos.Bolo;

/**
 *
 * @author Italo
 */
public class BoloDAO {
    Connection conn;
    
    public BoloDAO()
    {
        conn = new Conexao().conectar(); //Conexão
    }
    
    public void salvar(Bolo bolo)
    {
        try
        {
            PreparedStatement ppStmt = conn.prepareStatement("INSERT INTO bolos(Descricao, Preco, Tamanho) values (?, ?, ?)");
            ppStmt.setString(1, bolo.getDescricao());
            ppStmt.setDouble(2, bolo.getPreco());
            ppStmt.setString(3, bolo.getTamanho());
            ppStmt.execute();
        }
        catch(SQLException ex)
        {
            ex.printStackTrace();
        }
    }
}

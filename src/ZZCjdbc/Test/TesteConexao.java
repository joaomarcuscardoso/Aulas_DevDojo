/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ZZCjdbc.Test;
import ZZCjdbc.Class.Comprador;
import ZZCjdbc.conn.ConexaoFactory;
import ZZCjdbc.db.CompradorOLDDB;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author JoãoMarcus
 */
public class TesteConexao {
    public static void main(String[] args) throws SQLException {
        //inserir();
        //update();
        //deletar();
        //List<Comprador> listaUserComprador = selectId(5);
        // List<Comprador> listaComprador = selectAll();
        //List<Comprador> searchName = searchByName("r");
        //System.out.println(searchName);
        //CompradorDB.updateNamesToLowerCase();
        //List<Comprador> preparestatement = searchByNamePreparedStatement("a");
        //System.out.println(preparestatement);
        //System.out.println(CompradorDB.searchByNameCallatableStatement("a"));

        CompradorOLDDB.saveTransatction();
    }
    
    public static void inserir() {
        Comprador comprador = new Comprador("111.111.111-22", "Maria");
        CompradorOLDDB.save(comprador);
              
    }
    public static void deletar() {
        Comprador comprador = new Comprador();
        comprador.setId(3);
        CompradorOLDDB.delete(comprador); 
        
    }
    
    public static void update() {
        Comprador comprador = new Comprador(6, "121.000.000-22", "MARIA");
        CompradorOLDDB.update(comprador);
    }
    public static List<Comprador> selectAll() {
       return  CompradorOLDDB.selectAll();
        
    }
    public static List<Comprador> selectId(int id) {
        return CompradorOLDDB.selectId(id);
        
    }
    public static List<Comprador> searchByName(String nome) {
        return CompradorOLDDB.searchByName(nome);
        
    } 
    
    public static List<Comprador> searchByNamePreparedStatement(String nome) {
        return CompradorOLDDB.searchByNamePreparedStatement(nome);
    }    
    
    
}

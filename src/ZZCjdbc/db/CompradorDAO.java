/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ZZCjdbc.db;

import ZZCjdbc.Class.Comprador;
import ZZCjdbc.conn.ConexaoFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author JoãoMarcus
 */
public class CompradorDAO {
    public static void save(Comprador comprador) {

        String sql = "INSERT INTO `agencia`.`comprador` (`cpf`, `nome`) VALUES (?, ?)";
       
        try(Connection conn = ConexaoFactory.getConexao();
            PreparedStatement ps = conn.prepareStatement(sql);) {
            ps.setString(1, comprador.getCpf());
            ps.setString(2, comprador.getNome());
            
            ps.executeUpdate();
        System.out.println("Registro Inserido com sucesso!!");
        
        } catch (SQLException ex) {
            Logger.getLogger(CompradorOLDDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
    public static void delete(Comprador comprador) {
        if(comprador.getId() == null || comprador == null) {
            System.out.println("Não foi possivel excluir o registro!!");
            return;
        }
        
        String sql = "DELETE FROM `comprador` WHERE `id` = ? ";
       
        try(Connection conn = ConexaoFactory.getConexao();
            PreparedStatement ps = conn.prepareStatement(sql);) {
            ps.setInt(1, comprador.getId());
            ps.executeUpdate();

            System.out.println("Registro Excluído com sucesso!!");
        } catch (SQLException ex) {
            Logger.getLogger(CompradorOLDDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public static void update(Comprador comprador) {
        if(comprador.getId() == null || comprador == null) {
            System.out.println("Não foi possivel atualizar o registro!!");
            return;
        }

 
        String sql = "UPDATE `agencia`.`comprador` SET `cpf`= ? , `nome`= ? WHERE `id`= ? ";
     
        try(Connection conn = ConexaoFactory.getConexao();
            PreparedStatement ps = conn.prepareStatement(sql);) { 
           
            ps.setString(1, comprador.getCpf());
            ps.setString(2, comprador.getNome());
            ps.setInt(3, comprador.getId());
            
            ps.executeUpdate();
                 
            System.out.println("Registro atualizar com sucesso!!");
        } catch (SQLException ex) {
            Logger.getLogger(CompradorOLDDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }   
    
    public static List<Comprador>  selectAll() {
        String sql = "SELECT * FROM `comprador`";

        List<Comprador> compradorList = new ArrayList<>();
        
        try(Connection conn = ConexaoFactory.getConexao();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery()) { 
            while(rs.next()) {
                compradorList.add(new Comprador(rs.getInt("id"), rs.getString("nome"), rs.getString("cpf")));                

            }
            return compradorList;
        } catch (SQLException ex) {
            Logger.getLogger(CompradorOLDDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }     
    
    
    public static List<Comprador> searchByName(String nome) {
       
        String sql = "SELECT * FROM `comprador` WHERE `nome` LIKE ?";
    
        List<Comprador> compradorList= new ArrayList<>();
        try(Connection conn = ConexaoFactory.getConexao();
            PreparedStatement ps = conn.prepareStatement(sql);) { 
            ps.setString(1, "%"+nome+"%");
            ResultSet rs = ps.executeQuery();           
            
            
            while(rs.next()) {
                compradorList.add(new Comprador(rs.getInt("id"), rs.getString("nome"), rs.getString("cpf")));

            }
            ConexaoFactory.close(conn, ps, rs);
            return compradorList;
        } catch (SQLException ex) {
            Logger.getLogger(CompradorOLDDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }    
    public static Comprador searchById(int id) {  
        String sql = "SELECT * FROM `comprador` WHERE `id`= ?";
        
        Comprador comprador = null;
        try(Connection conn = ConexaoFactory.getConexao();
            PreparedStatement ps = conn.prepareStatement(sql);) {
            
            ps.setInt(1, id);
           
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()) {
                comprador = new Comprador(rs.getInt("id"), rs.getString("cpf"), rs.getString("nome"));

            }
            ConexaoFactory.close(conn, ps, rs);
            return comprador;
        } catch (SQLException ex) {
            Logger.getLogger(CompradorOLDDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ZZCjdbc.db;

import ZZCjdbc.Class.Carro;
import ZZCjdbc.Class.Comprador;
import ZZCjdbc.conn.ConexaoFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author JoãoMarcus
 */
public class CarroDAO {
    public static void save(Carro carro) {

        String sql = "INSERT INTO `agencia`.`carro` (`nome`, `placa`, `id_comprador`) VALUES (?, ?, ?)";
       
        try(Connection conn = ConexaoFactory.getConexao();
            PreparedStatement ps = conn.prepareStatement(sql);) {
            ps.setString(1, carro.getNome());
            ps.setString(2, carro.getPlaca());
            ps.setInt(3, carro.getComprador().getId());
            ps.executeUpdate();
        System.out.println("Registro Inserido com sucesso!!");
        
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    
    }
    
    public static void delete(Carro carro) {
        if(carro.getId() == null || carro == null) {
            System.out.println("Não foi possivel excluir o registro!!");
            return;
        }
        
        String sql = "DELETE FROM `carro` WHERE `id` = ? ";
       
        try(Connection conn = ConexaoFactory.getConexao();
            PreparedStatement ps = conn.prepareStatement(sql);) {
            ps.setInt(1, carro.getId());
            ps.executeUpdate();

            System.out.println("Registro Excluído com sucesso!!");
        } catch (SQLException ex) {
           ex.printStackTrace();
        }
        
    }
    
    public static void update(Carro carro) {
        if(carro.getId() == null || carro == null) {
            System.out.println("Não foi possivel atualizar o registro!!");
            return;
        }

 
        String sql = "UPDATE `agencia`.`carro` SET `nome`= ? , `placa`= ? WHERE `id`= ? ";
     
        try(Connection conn = ConexaoFactory.getConexao();
            PreparedStatement ps = conn.prepareStatement(sql);) { 
           
            ps.setString(1, carro.getNome());
            ps.setString(2, carro.getPlaca());
            ps.setInt(3, carro.getId());
            
            ps.executeUpdate();
                 
            System.out.println("Registro atualizar com sucesso!!");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
    }   
    
    public static List<Carro>  selectAll() {
        String sql = "SELECT * FROM `carro`";

        List<Carro> carroList = new ArrayList<>();
        
        try(Connection conn = ConexaoFactory.getConexao();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery()) { 
            while(rs.next()) {
                Comprador c = CompradorDAO.searchById(rs.getInt("id_comprador"));
                carroList.add(new Carro(rs.getInt("id"), rs.getString("nome"), rs.getString("placa"), c));                

            }
            return carroList;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }     
    
    
    public static List<Carro> searchByName(String nome) {
       
        String sql = "SELECT * FROM `carro` WHERE `nome` LIKE ?";
    
        List<Carro> carroList= new ArrayList<>();
        try(Connection conn = ConexaoFactory.getConexao();
            PreparedStatement ps = conn.prepareStatement(sql);) { 
            ps.setString(1, "%"+nome+"%");
            ResultSet rs = ps.executeQuery();           
            
            
            while(rs.next()) {
                Comprador c = CompradorDAO.searchById(rs.getInt("id_comprador"));
                carroList.add(new Carro(rs.getInt("id"), rs.getString("nome"), rs.getString("placa"), c));                

            }
            ConexaoFactory.close(conn, ps, rs);
            return carroList;
        } catch (SQLException ex) {
            ex.printStackTrace();        
        }
        return null;
    }


    
}

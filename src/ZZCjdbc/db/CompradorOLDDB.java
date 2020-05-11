/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ZZCjdbc.db;

import ZZCjdbc.Class.Comprador;
import ZZCjdbc.conn.ConexaoFactory;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.JdbcRowSet;

/**
 *
 * @author JoãoMarcus
 */
public class CompradorOLDDB {
    public static void save(Comprador comprador) {

        String sql = "INSERT INTO `agencia`.`comprador` (`cpf`, `nome`) VALUES ('"+comprador.getCpf()+"', '"+comprador.getNome()+"')";
        Connection conn = ConexaoFactory.getConexao();
        try {
            Statement stmt = conn.createStatement();
            stmt.executeUpdate(sql);
            ConexaoFactory.close(conn, stmt);
            System.out.println("Registro Inserido com sucesso!!");
        
        } catch (SQLException ex) {
            Logger.getLogger(CompradorOLDDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    } 
    public static void saveTransatction() throws SQLException {

        String sql = "INSERT INTO `agencia`.`comprador` (`cpf`, `nome`) VALUES  ('Teste1', 'Teste1')";
        String sql2 = "INSERT INTO `agencia`.`comprador` (`cpf`, `nome`) VALUES  ('Teste2', 'Teste2')";
        String sql3 = "INSERT INTO `agencia`.`comprador` (`cpf`, `nome`) VALUES  ('Teste3', 'Teste3')";
        Connection conn = ConexaoFactory.getConexao();
        Savepoint savepoint = null;
        try {
            conn.setAutoCommit(false);
            
            Statement stmt = conn.createStatement();
            stmt.executeUpdate(sql);

            savepoint = conn.setSavepoint("One");
            stmt.executeUpdate(sql2);
            if(true)
                throw new SQLException();
            stmt.executeUpdate(sql3);
            
            conn.commit();
            
            ConexaoFactory.close(conn, stmt);
            System.out.println("Registro Inserido com sucesso!!");
        
        } catch (SQLException ex) {
            ex.printStackTrace();
            conn.rollback(savepoint);
            conn.commit();
        }
    
    } 
    
    public static void delete(Comprador comprador) {
        if(comprador.getId() == null || comprador == null) {
            System.out.println("Não foi possivel excluir o registro!!");
            return;
        }
        
        String sql = "DELETE FROM `comprador` WHERE `id` = '"+comprador.getId()+"' ";
        Connection conn = ConexaoFactory.getConexao();
        try {
            Statement stmt = conn.createStatement();
            stmt.executeUpdate(sql);
            ConexaoFactory.close(conn, stmt);
            
            System.out.println("Registro Excluído com sucesso!!");
        } catch (SQLException ex) {
            Logger.getLogger(CompradorOLDDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
   
    public static List<Comprador>  selectAll() {
        String sql = "SELECT * FROM `comprador`";
        Connection conn = ConexaoFactory.getConexao();
        List<Comprador> compradorList = new ArrayList<>();
        
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            
            while(rs.next()) {
                compradorList.add(new Comprador(rs.getInt("id"), rs.getString("nome"), rs.getString("cpf")));

            }
            ConexaoFactory.close(conn, stmt, rs);
            return compradorList;
        } catch (SQLException ex) {
            Logger.getLogger(CompradorOLDDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }     
    
    
   
    public static List<Comprador> selectId(int id) {  
        String sql = "SELECT * FROM `comprador` WHERE `id`= '"+id+"'";
        Connection conn = ConexaoFactory.getConexao();
        List<Comprador> compradorList= new ArrayList<>();
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()) {
                compradorList.add(new Comprador(rs.getInt("id"), rs.getString("nome"), rs.getString("cpf")));

            }
            ConexaoFactory.close(conn, stmt, rs);
            return compradorList;
        } catch (SQLException ex) {
            Logger.getLogger(CompradorOLDDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public static List<Comprador> searchByName(String nome) {
       
        String sql = "SELECT * FROM `comprador` WHERE `nome` LIKE '%"+nome+"%'";
        Connection conn = ConexaoFactory.getConexao();
        List<Comprador> compradorList= new ArrayList<>();
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()) {
                compradorList.add(new Comprador(rs.getInt("id"), rs.getString("nome"), rs.getString("cpf")));

            }
            ConexaoFactory.close(conn, stmt, rs);
            return compradorList;
        } catch (SQLException ex) {
            Logger.getLogger(CompradorOLDDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    } 
    

    
    

    public static List<Comprador> searchByNamePreparedStatement(String nome) {
       
        String sql = "SELECT * FROM `comprador` WHERE `nome` LIKE ?";
        Connection conn = ConexaoFactory.getConexao();
        List<Comprador> compradorList= new ArrayList<>();
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
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
    public static List<Comprador> searchByNameRowSet(String nome) {
       
        String sql = "SELECT * FROM `agencia`.`comprador` WHERE `nome` LIKE ?";
  
        JdbcRowSet jrs = ConexaoFactory.getRowSetConnection();
        List<Comprador> compradorList= new ArrayList<>();
        try {
            jrs.setCommand(sql);
            //PreparedStatement ps = conn.prepareStatement(sql);
            jrs.setString(1, "%"+nome+"%");
            
            jrs.execute();
            while(jrs.next()) {
                compradorList.add(new Comprador(jrs.getInt("id"), jrs.getString("nome"), jrs.getString("cpf")));

            }
            ConexaoFactory.close(jrs);
            return compradorList;
        } catch (SQLException ex) {
            Logger.getLogger(CompradorOLDDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    } 
    
    public static List<Comprador> searchByNameCallatableStatement(String nome) {
       
        String sql = "CALL `agencia`.`SP_GetCompradoresPorNome`(?)";        
        Connection conn = ConexaoFactory.getConexao();
        List<Comprador> compradorList= new ArrayList<>();
        try {
            CallableStatement cs = conn.prepareCall(sql);
            cs.setString(1, '%'+nome+'%');
            
            ResultSet rs = cs.executeQuery();
            while(rs.next()) {
                compradorList.add(new Comprador(rs.getInt("id"), rs.getString("nome"), rs.getString("cpf")));

            }
            ConexaoFactory.close(conn, cs, rs);
            return compradorList;
        } catch (SQLException ex) {
            Logger.getLogger(CompradorOLDDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    } 
    
 

    
    
    
    public static void selectMetaData() {
        String sql = "SELECT * FROM agencia.comprador";
        Connection conn = ConexaoFactory.getConexao();
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            ResultSetMetaData rsmd = rs.getMetaData();
            rs.next();
            int qtdColunas = rsmd.getColumnCount();
            for(int i= 1;i <=qtdColunas;i++) {
                System.out.println("tabelas: "+rsmd.getTableName(i));
                System.out.println("Nome coluna: "+rsmd.getColumnName(i));
                System.out.println("Tamanho coluna: "+ rsmd.getColumnDisplaySize(i));
                
            }   
            
            ConexaoFactory.close(conn, stmt, rs);
           
        } catch (SQLException ex) {
            Logger.getLogger(CompradorOLDDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }


   


    
    public static void checkDriverStatus() {
        Connection conn = ConexaoFactory.getConexao();
        
        DatabaseMetaData dbmd;
        try {
            dbmd = conn.getMetaData();
         
            if(dbmd.supportsResultSetType(ResultSet.TYPE_FORWARD_ONLY)) {             
                System.out.println("Suporte Type_forward_only"); 

                if(dbmd.supportsResultSetConcurrency(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE)) {
                    System.out.println("suporta Concur_update");
                }
            }

             if(dbmd.supportsResultSetType(ResultSet.TYPE_SCROLL_INSENSITIVE)) {                
                System.out.println("Suporte TYPE_SCROLL_INSENSITIVE"); 

                if(dbmd.supportsResultSetConcurrency(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE)) {
                    System.out.println("suporta Concur_update");
                }
            }           

            if(dbmd.supportsResultSetType(ResultSet.TYPE_SCROLL_SENSITIVE)) {                
                System.out.println("Suporte TYPE_SCROLL_INSENSITIVE"); 

                if(dbmd.supportsResultSetConcurrency(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE)) {
                    System.out.println("suporta Concur_update");
                }
            }           
            
            ConexaoFactory.close(conn);

        } catch (SQLException ex) {
            Logger.getLogger(CompradorOLDDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void TestTypeScroll() {
        String sql = "SELECT * FROM `comprador`";
        Connection conn = ConexaoFactory.getConexao();

        try {
            Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = stmt.executeQuery(sql);
            
            if(rs.last()) {
                System.out.println("Ultima linha: "+new Comprador(rs.getInt("id"), rs.getString("nome"), rs.getString("cpf")));
                System.out.println("Numero da ultima linha: "+rs.getRow());
            
            }
            System.out.println("Retornou para primeira linha: "+rs.first());
            System.out.println("Primeira linha: "+rs.getRow());
            rs.absolute(3);
            System.out.println("Linha 3: "+new Comprador(rs.getInt("id"), rs.getString("nome"), rs.getString("cpf")));
            rs.relative(-1);
            System.out.println("Linha 3: "+new Comprador(rs.getInt("id"), rs.getString("nome"), rs.getString("cpf")));
            
            System.out.println("Ultima linha: "+rs.isLast());
            rs.afterLast();
            // ler linhas ao contrario         
            while(rs.previous()) {
                System.out.println("Linhas: "+new Comprador(rs.getInt("id"), rs.getString("nome"), rs.getString("cpf")));
             
            }
            
            
            ConexaoFactory.close(conn, stmt, rs);
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
        Connection conn = ConexaoFactory.getConexao();
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, comprador.getCpf());
            ps.setString(2, comprador.getNome());
            ps.setInt(3, comprador.getId());
            
            ps.executeUpdate();
            ConexaoFactory.close(conn, ps);
            
            System.out.println("Registro atualizar com sucesso!!");
        } catch (SQLException ex) {
            Logger.getLogger(CompradorOLDDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }     
    public static void updateRowSet(Comprador comprador) {
        if(comprador.getId() == null || comprador == null) {
            System.out.println("Não foi possivel atualizar o registro!!");
            return;
        }
        
        String sql = "SELECT * FROM `agencia`.`comprador` WHERE `id` = ?";
        
        JdbcRowSet jrs = ConexaoFactory.getRowSetConnection();
        try {
            jrs.setCommand(sql);
          
            jrs.setInt(1, comprador.getId());
            jrs.execute();
            jrs.next();
            jrs.updateString("nome", "Willian");
           
            jrs.execute();
            ConexaoFactory.close(jrs);
            
            System.out.println("Registro atualizar com sucesso!!");
        } catch (SQLException ex) {
            Logger.getLogger(CompradorOLDDB.class.getName()).log(Level.SEVERE, null, ex);
        }
      
        
    }     
    
    public static JdbcRowSet updateRowSetCached(Comprador comprador) {
        if(comprador.getId() == null || comprador == null) {
            System.out.println("Não foi possivel atualizar o registro!!");
            return null;
        }
        
        String sql = "SELECT * FROM `agencia`.`comprador` WHERE `id` = ? ";
        
        CachedRowSet crs = ConexaoFactory.getRowSetConnectionCached();
      
        try {
            crs.setCommand(sql);
            
            crs.setInt(1, comprador.getId());
            
            crs.execute();
            crs.next();
            crs.updateString("nome", "www"); 
            crs.updateRow();
           
            crs.acceptChanges();
            
            System.out.println("Registro atualizar com sucesso!!");
        } catch (SQLException ex) {
            Logger.getLogger(CompradorOLDDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
        
    }    
    
    
    
    public static void updateNamesToLowerCase() {
         String sql = "SELECT * FROM `comprador`";
        Connection conn = ConexaoFactory.getConexao();

        try {
            Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = stmt.executeQuery(sql);
            
            while(rs.next()) {
                rs.updateString("nome", rs.getString("nome").toLowerCase());
                rs.updateRow();
            }
            rs.beforeFirst();
            
            while(rs.next()) {
                System.out.println(rs.getString("nome"));
            }
            rs.absolute(2);
            String nome = rs.getString("nome");
            rs.moveToInsertRow();
            System.out.println(nome);
            System.out.println(rs.getString("nome"));
            rs.updateString("nome", nome.toUpperCase());
            rs.updateString("cpf", "999.999.999-99");
            rs.insertRow();
            rs.moveToCurrentRow();
            System.out.println(rs.getString("nome")+" row: "+rs.getRow());
            
            
            
            ConexaoFactory.close(conn, stmt, rs);
        
        
        } catch (SQLException ex) {
            Logger.getLogger(CompradorOLDDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    } 
}

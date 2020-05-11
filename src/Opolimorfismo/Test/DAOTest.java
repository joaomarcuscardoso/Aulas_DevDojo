/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Opolimorfismo.Test;

import Opolimorfismo.Classes.ArquivoDAOImpl;
import Opolimorfismo.Classes.DatabaseDAOImpl;
import Opolimorfismo.Classes.GenericDAO;


/**
 *
 * @author User
 */
public class DAOTest {
    public static void main(String[] args) {
        GenericDAO arquivoDAO = new DatabaseDAOImpl();
        arquivoDAO.save();
        
        
    }
    
}

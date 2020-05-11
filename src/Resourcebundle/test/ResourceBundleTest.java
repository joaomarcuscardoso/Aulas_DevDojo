/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Resourcebundle.test;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 *
 * @author JoãoMarcus
 */
public class ResourceBundleTest {
    public static void main(String[] args) {
      System.out.println(Locale.getDefault());
      ResourceBundle rb = ResourceBundle.getBundle("Resourcebundle.test/messages_pt_BR", new Locale("pt","BR"));
      System.out.println(rb.getString("bom.dia"));
      System.out.println(rb.getString("ola"));
      rb = ResourceBundle.getBundle("Resourcebundle.test/messages_en_US", new Locale("en","US"));
      System.out.println(rb.getString("bom.dia"));
      System.out.println(rb.getString("ola"));
      rb = ResourceBundle.getBundle("Resourcebundle.test/messages");
      System.out.println(rb.getString("show"));
    }
}

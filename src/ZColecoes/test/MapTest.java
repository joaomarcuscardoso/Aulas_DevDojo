/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ZColecoes.test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 *
 * @author JoãoMarcus
 */
public class MapTest {
    public static void main(String[] args) {
        Map<String, String> map = new LinkedHashMap<>();
        map.put("teklado", "teclado");
        map.put("vc", "você");
        map.put("nouse", "mouse");
        //map.put("vc", "voce");
    
        for(String key : map.values()) {
            System.out.println(key);
        }
        
        for(Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey()+ " "+entry.getValue());
        }
        
        
    }
}

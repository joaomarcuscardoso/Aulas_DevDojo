/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ZZEConcorrencia.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 *
 * @author JoãoMarcus
 */
public class ConcorrenciaDeColecoesTest {
    public static void main(String[] args) {
        //  ConcurrentHashMap
        // ConcurrentLinkedDeque
        // ConcurrentSkipListMap
        // ConcurrentSkipListSet
        ConcurrentMap<String, String> map = new ConcurrentHashMap<>();
        map.put("1", "1");
        map.putIfAbsent("1", "2");
        System.out.println(map.get("1"));
    }
}

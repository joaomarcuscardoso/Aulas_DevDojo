/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datas.test;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author JoãoMarcus
 */
public class ManipulacaoDeDataTest {
    public static void main(String[] args) {
        Date date = new Date(1_000_2000);
        System.out.println(date);
        
        Calendar g = Calendar.getInstance();
        System.out.print(g);
        
        if(Calendar.SUNDAY == g.getFirstDayOfWeek()) {
            System.out.println("Domingo é o primeiro dia da semana");
        } else {
            System.out.println("Domingo não é o primeiro dia da semana");
        }
        
        g.add(Calendar.HOUR, 24);
        Date c = g.getTime();
        
        System.out.println(c);
        
    }
}

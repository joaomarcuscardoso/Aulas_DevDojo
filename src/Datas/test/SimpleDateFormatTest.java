/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datas.test;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author JoãoMarcus
 */
public class SimpleDateFormatTest {
    public static void main(String[] args) {
        Calendar g = Calendar.getInstance();
        String mask = "'Atlanta,' dd 'de' MMMM 'de' YYYY";
        SimpleDateFormat formatador = new SimpleDateFormat(mask);
        System.out.println(formatador.format(g.getTime()));
        
    }
}

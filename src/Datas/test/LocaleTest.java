/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datas.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

/**
 *
 * @author JoãoMarcus
 */
public class LocaleTest {
    public static void main(String[] args) {
        Locale locale = new Locale("it", "IT");
        //Locale locale2 = new Locale("it", "CH");
        Calendar c = Calendar.getInstance();
        c.set(2015, Calendar.DECEMBER, 20);
        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, locale);
        System.out.println(locale.getDisplayLanguage());
        System.out.println(df.format(c.getTime()));
        
    }
}

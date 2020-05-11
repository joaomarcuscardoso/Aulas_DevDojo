/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datas.test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author JoãoMarcus
 */
public class NumberFormatTest {
    public static void main(String[] args) {
        float valor = 212.4567f;
        Locale locIT = new  Locale("it");
        NumberFormat[] nfn = new NumberFormat[4];
        nfn[0] = NumberFormat.getInstance(locIT);
        nfn[1] = NumberFormat.getInstance();
        nfn[2] = NumberFormat.getCurrencyInstance();
        nfn[3] = NumberFormat.getCurrencyInstance(locIT);
        for(NumberFormat nf : nfn) {
            System.out.println(nf.format(valor));
        }
        
        NumberFormat nf = NumberFormat.getInstance();
        System.out.println(nf.getMaximumFractionDigits());
        nf.setMaximumFractionDigits(2);
        System.out.println(nf.format(valor));
        String valorString = "212,4567";
        try {
            System.out.println(nf.parse(valorString));
            nf.setParseIntegerOnly(true);
            System.out.println(nf.parse(valorString));
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
    }
}

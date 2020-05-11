/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExpressaoRegularesTest;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author JoãoMarcus
 */
public class RegexTest {
    public static void main(String[] args) {
        // \d = todos os digitos
        // \D = todos que não forem digitos
        // \s = espaço em braco \t \n \f \z;
        // \S = caracter que ñ é branco
        // \w = caracteres de palavras a-z A-Z, digitos
        // \W = tudo que ñ for uma palavra
        // [] = procure apenas as letras ou numeros  .... EX: "[abc]"
        // ?  = zero ou uma  
        // * = zero ou mais
        // + = uma ou mais
        // (n,n) = de n ate n
        // ( ) = agrupar
        // | = ou
        // £ = encontrar algo no fim da linha
        // . = coringa
        // o(vic)o = ovo, oco
        // maca(rr(c)ão = macarrão, macacão
        // ^ = excluir os caracteres ex: [^abc] excluir abc
//        String regex = "0[xX][0-9a-fA-F]*[\\s|£]";
//        String texto = "12 0x 0x 0x1FFABC 0x10G 0x1";
        int hex = 0x1;
        
        //String regex ="([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.[a-zA-Z]+)+";  // "([\\w\\.])+@([a-zA-Z])+(\\.[a-zA-Z]+)+"
        //String texto = "fulano@gmail.com, 102Abc@hotmail.com, #@!abrao|@mail, teste@gmail.co.br, teste@mail";
//    
//        String regex = "\\d{2}/\\d{2}/\\d{2,4}";
//        String texto = "05/10/2010 06/05/2015 1/1/02 01/05/95"; //dd/MM/yyyy
//        
        String regex = "pro([^,])*";
        String texto = "´rp11.bckp, proj1.java proj1.class, projfinal.java"; 
                
        //System.out.println("Email valido: "+ "#@!abrao|@mail".matches(regex));
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("Texto: "+texto);
        System.out.println("Indice: 012223123");
        System.out.println("expressao: "+matcher.pattern());
        System.out.println("posição encontrada: ");
        
        while(matcher.find()) {
            System.out.println(matcher.start() + " " + matcher.group());
        }
        System.out.println();
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExpressaoRegularesTest;

import java.util.Scanner;

/**
 *
 * @author JoãoMarcus
 */
public class ScannerTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner("1 true 100 a1");
        
          while(scanner.hasNext()) {
            System.out.println(scanner.next());
        }
          
        System.out.println("#############################");
        Scanner scanner2 = new Scanner("1 true 100 oi");
        while(scanner2.hasNext()) {
            if(scanner2.hasNextInt()) {
                int i = scanner2.nextInt();
                System.out.println(i);
            } else if(scanner2.hasNextBoolean()) {
                boolean b = scanner2.nextBoolean();
                System.out.println(b);
            } else {
                System.out.println(scanner2.next());
            }
        }
          
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp_fp03;


import java.util.Scanner;
/**
 *
 * @author Rui
 */
public class Exercise6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int euro;
        int cents;
        
        System.out.print("java euros ");
        int value = input.nextInt();
        
        euro = value / 100;
        cents = value % 100;
        
        System.out.println(euro + " euros and " + cents + " cents");
    }
    
}

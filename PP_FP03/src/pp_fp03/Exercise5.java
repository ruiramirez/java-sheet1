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
public class Exercise5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        double conversion = 0;
        
        System.out.print("java convertsCoin ");
        double value = input.nextDouble();
        
        //.charAt(0) to store exactly the first char
        char currency = input.next().charAt(0);
        
        switch(currency){
            case 'e':
            case 'E': 
        conversion = value * 1.23144;
        break;
            case 'd':
            case 'D':
        conversion = value * 0.812057429;
        break;
            default : System.out.println("Invalid currency");
        }
        
        System.out.println(conversion + "$");
        
    }
    
}

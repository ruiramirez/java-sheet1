/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp_fp03;

import java.util.Scanner;
        
public class Exercise7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        
        int counter = 0;
        int result;
        
        System.out.print("Input first number of operation :");
        int numb1 = input.nextInt();
        System.out.print("Input second number of operation :");
        int numb2 = input.nextInt();
        
        result = numb1;
        
        while(result >= numb2){
            
            result = result - numb2;
            counter++;
        }
        
        
        System.out.print("The result is ");
        System.out.println(counter + " the rest is " + result);
    }
    
}

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
public class Exercise4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

//  Write a program that reads a value in degrees and converts it to radians.  

    Scanner input = new Scanner (System.in);
    double radians;
    
    System.out.print("Input value in degrees : ");
    double degrees = input.nextDouble();
    
    radians = (degrees * Math.PI) / 180;
    
    System.out.println(degrees + " degrees is equivalent to : " + radians + " radians.");
    }
    
}

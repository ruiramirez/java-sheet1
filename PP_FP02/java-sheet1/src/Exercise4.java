/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rui
 */

import java.util.Scanner;
public class Exercise4 {

    /*run a program from cmd that asks user to input first and last name an prints it in the form of "last name, first name" 
    cmd commands:
    C:\Users\ruida>cd "Documents"
    C:\Users\ruida\Documents>cd "NetBeansProjects"
    C:\Users\ruida\Documents\NetBeansProjects>cd "PP_FP02"
    C:\Users\ruida\Documents\NetBeansProjects\PP_FP02>cd "src"
    
    The following command tells the system where to find JDK programs:
    C:\Users\ruida\Documents\NetBeansProjects\PP_FP02\src> set path=%path%;C:\Program Files\Java\jdk1.8.0_141\bin
    
    The following command runs javac.exe, the compiler:
    C:\Users\ruida\Documents\NetBeansProjects\PP_FP02\src>javac Exercise4.java
    
    This runs the Java interpreter, followed by the output:
    C:\Users\ruida\Documents\NetBeansProjects\PP_FP02\src>java Exercise4
    */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Input first name : ");
        String firstName = input.next();
        System.out.println();
        System.out.print("Input last name : ");
        String lastName = input.next();
        
        System.out.println(lastName + ", " + firstName);
        
        }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp_fp03;

/**
 *
 * @author Rui
 */
public class Exercise2 {

    
    public static void main(String[] args) {
        
//        Exercise 2
//        Initialize an array with numbers of your choice then write a program that prints their respective prime and perfect numbers

        int[] theArray = {28, 41, 21, 87, 59, 39, 11, 60, 55, 97};
        int counterPrime = 0;
        int counterPerfect = 0;

//        Finding Prime Numbers
        System.out.print("Prime Numbers : ");
        for (int i = 0; i < theArray.length; i++) {
            for (int j = 1; j <= theArray[i]; j++) {
                if (theArray[i] % j == 0) {
                    counterPrime++;
                }
            }
            if (counterPrime == 2) {
                System.out.print(theArray[i] + " ");
            }
            counterPrime = 0;
        }
        
        System.out.println("");
//        Finding Perfect Numbers        
        System.out.print("Perfect Numbers : ");
        for (int k = 0; k < theArray.length; k++) {
            for (int x = 1; x < theArray[k]; x++) {
                if (theArray[k] % x == 0) {
                    counterPerfect += x;
                }
            }
            if (counterPerfect == theArray[k]) {
                System.out.print(theArray[k] + " ");
            }
            counterPerfect = 0;
        }
        
        
    }
}

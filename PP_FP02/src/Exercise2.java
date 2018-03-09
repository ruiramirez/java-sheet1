/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rui
 */
public class Exercise2 {

    /*Exercise 2
    Write a program that calculates the sum and average of given elements from array
    */
    public static void main(String[] args) {
        
        int sum = 0;
        int forEachSum = 0;
        double avg = 0.0;
        int [][] twoDimArray = { {11, 7, 333}, {-20, -23, 63}, {-22, 501, 10000} };
    
        //for loop to go trough array and add each element to calculate sum
        for (int i = 0; i < twoDimArray.length; i++){
            for (int j = 0; j < twoDimArray.length; j++){
                sum += twoDimArray[i][j];
            }
        } 
        System.out.println("Sum of elements is : " + sum);
        //calculate average
        avg = sum / (twoDimArray.length * twoDimArray.length);
        
        System.out.println("Average of elements is : " + avg);
    
    //using "foreach" loop in 2D array
       /*first you go trough each element of twoDimArray using 'int[] x' 
         because each individual element is of type 'int []' (An 2D Array is basically an "array of an array"*/  
        for(int[] x : twoDimArray){
        /*Then you go trough each element of x trough y that share the same type (int) incrementing the sum*/    
           for(int y : x){
            forEachSum += y;    
            }
        }
        System.out.println("Sum of elements using 'foreach' loop : " + forEachSum);
    }
    
}

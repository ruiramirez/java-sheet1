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
public class Exercise3 {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Initialize a [4] by [3] 2D Array with values and write a program that prints the most repeated value 
//        and the greater and lesser number of each row.
//        I'm assuming there are no numbers below zeroand greater than 100 int the 2D Array.
    int [][] matrix = { {13, 26, 4}, {54, 89, 13}, {12, 13, 7}, {99, 1, 35} };
    int repeatedValue = -1;
    int value = 0;
    int counter = 0;
    int timesRepeated = 0;
    int biggestValue = -1;
    int smallestValue = 100;
    
//      Finding the most repeated value

    for(int i = 0; i < matrix.length; i++){
       for(int j = 0; j < matrix[0].length; j++){
           for(int[] x : matrix){
               for(int y : x){
                   if (matrix[i][j] == y){
                       counter++;
                   } 
               }
           }
           
       if(counter > timesRepeated){
           repeatedValue = matrix[i][j];
           timesRepeated = counter;
       }
       counter = 0;
       }
      
    }
    
    System.out.print("The most repeated value is : " + repeatedValue); 
    
    System.out.println("");
    System.out.println("");

//     Finding the the greater and lesser value in each row

System.out.print("The greater and lesser value for each row is (in order) : ");
        for (int[] x : matrix) {
            for (int y : x) {
                if (y > biggestValue) {
                    biggestValue = y;
                }
                if (y < smallestValue) {
                    smallestValue = y;
                }
            }
            System.out.print(biggestValue + "," + smallestValue + " ");
            biggestValue = -1;
            smallestValue = 100;
        }

    }
}

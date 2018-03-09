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
public class Exercise1 {

    
    public static void main(String[] args) {
        
//     Exercise 1
//     Write a program that given an 2D Array with 'N' dimension, stores and writes its transposed 2D Array.
//     Note: the tranposed of a 2D Array A[N][N] it's a 2D Array B[N][N] where B[i][j]=A[j][i] for i, j=0...N-1.
//     The 2D Array must be previously intialized

    int[][] matrixA = { {1, 2 ,3}, {4, 5, 6} };
    int[][] matrixB = new int[matrixA[0].length][matrixA.length];
    
    for(int i = 0; i < matrixA[0].length; i++){
        for(int j = 0; j < matrixA.length; j++){
            matrixB[i][j] = matrixA[j][i];
              
        }
    }
    for (int i = 0; i < matrixB.length; i++){
        for (int j = 0; j < matrixB[0].length; j++){
            System.out.print(matrixB[i][j] + " ");
        }
    }
    System.out.println();
    for(int[] x: matrixB){
        for(int y: x){
           System.out.print(y + " "); 
        }
    }
    
    }
}

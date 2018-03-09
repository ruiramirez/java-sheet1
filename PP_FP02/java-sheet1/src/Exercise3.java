/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rui
 */
public class Exercise3 {

    /*Exercise 3
    a) calculate the multiplication of all positive elements of given array;
    b) identify how many elements are negative;
    c) identify which number is the greatest;
    */
    public static void main(String[] args) {
        //a)
        int multi = 1;
        int result = 0;
        int forEachResult = 0;
        int forEachMulti = 1;
        //b)
        int count = 0;
        int forEachCount = 0;
        //c)
        int biggest = 0;
        int biggestForEach = 0;
        
        int[] list = {12, 5, -21, 10, -345, 22, 50, -125, 80, -1};
        
        //a)
        //using 'for' loop and 'if' condition
        for(int i = 0; i < list.length; i++){
            if(list[i] >= 0){
            
            result = multi * list[i];
            multi = result;
            }
        }
        
        System.out.println("The multiplication of all positive elements is : " + multi);
        
        //using 'foreach' loop and if condition
        for(int x : list){
            if(x >= 0){
                forEachResult = forEachMulti * x;
                forEachMulti = forEachResult;
            }
        }
        System.out.println("The multiplication of all positive elements is(foreach) : " + forEachMulti);
        
        //b)
        //using 'for' loop and 'if' condition
        for(int i = 0; i < list.length; i++){
            if(list[i] < 0){
               count++;
            }
        }
        System.out.println("Number of negative elements(foreach) : " + count);
        
        //using 'foreach' loop and if condition
        for(int x : list){
            if(x < 0){
                forEachCount++;
            }
        }
        System.out.println("Number of negatives elements(foreach) : " + forEachCount);
        
        //c)
        //using 'for' loop and 'if' condition
        biggest = list[0];
        for(int i = 0; i < list.length; i++){
            if(biggest < list[i]){
                biggest = list[i];
            }
        }
        System.out.println("The biggest element is : " + biggest);
        
        //using 'foreach' loop and if condition
        biggestForEach = list[0];
        for(int x : list){
            if(x > biggestForEach){
                biggestForEach = x;
            }
        }
        System.out.println("The biggest element is(foreach) : " + biggestForEach);
        
    }
}

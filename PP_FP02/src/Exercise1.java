/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rui
 */
public class Exercise1 {

    /*Exercise 1
    Store a sentence in array and print it.
    */
    
    public static void main(String[] args) {
        //Array of char type to store characters    
        char[] sentence = {'I', ' ',
                            'a', 'm', ' ',
                             'a', ' ',
                              's', 't', 'u', 'd', 'e', 'n', 't', ' ',
                               'f', 'r', 'o', 'm', ' ',
                                'E', 'S', 'T', 'G', '.', '\n'};
        
        //for loop to print array
        for (int i = 0; i < sentence.length; i++){
            System.out.print(sentence[i]);
        }
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rui
 */
public class Exercise5 {

    
    public static void main(String[] args) {
        
        int[] listA = {2, -5, -121, 102, -35, -2, 0, -125, 802, -10};
        int[] listB = {6, 99, -1, 12, 1, -2};
 
        int listC[] = new int[listA.length + listB.length];

        int counter = 0;
       
       
//        a)
//        System.arraycopy(listA, 0, listC, 0, listA.length); *** VER NA NET EM CASA ***
//        arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
//
//    Parameters:
//    src - the source array.
//    srcPos - starting position in the source array.
//    dest - the destination array.
//    destPos - starting position in the destination data.
//    length - the number of array elements to be copied.

        
        for(int i = 0; i < listA.length; i++){
           listC[i] = listA[i];
        }
        for(int i = 0; i < listB.length; i++){
           listC[i + listA.length] = listB[i];
        }
        
//        foreach loop to print array
        System.out.print("New Array : ");
        for(int x : listC){
           System.out.print(x + " "); 
        }
        System.out.println();
        
//        b) 
        for(int i = 0; i < listC.length; i++){
            for(int j = i + 1; j < listC.length; j++){
                if(listC[i] == listC[j]){
                    counter++;
                }
            }
        }
        System.out.println("Repeated elements : " + counter);
        
//        c)

//      array of flags indicating which elements of listA to copy, in other words, the ideia is, 
//      (i.e) if listA[i] == 1, the element of listA form position i is unique.
        int listX[] = new int[listA.length];
//      counter of unique elements from listA 
        int counterA = 0;
        
        for (int i = 0; i < listA.length; i++){
            boolean contains = false;
            for (int y: listB){
                if(listA[i] == y){
                    contains = true;
                    break;
                }
            }
            if (!contains){
                counterA++;
//      setting listX[i] to 1 if listA[i] is not present in listB         
                listX[i] = 1;
            }
        }
//      declaring array with specified size
        int[] listD = new int [counterA];
        counterA = 0;
//      iterating trough array listX to copy the unique elements
        for (int i = 0; i < listX.length; i++){
            if(listX[i] == 1){
                listD[counterA++] = listA[i];
            }
    }
       
        System.out.print("All elements of listA that are unique of listB : ");
        for(int x : listD){
           System.out.print(x + " "); 
        }
        
//      d)



}
}
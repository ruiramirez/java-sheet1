/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp_fp03;

import java.util.Scanner;

public class Exercise8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int euros, cents;
        int euroCounter = 0, centsCounter = 0;
        double value;
        
        System.out.print("java conveuros ");
        double amount = input.nextDouble();
        
        value = amount;
        
        
        if (value >= 2) {
            for (int i = 2; i <= value; i += 2) {
                euroCounter++;
            }
            System.out.println(euroCounter + " coin(s) of 2 euros.");
            value = value - (euroCounter * 2);
            euroCounter = 0;
        }
            if (value < 2 && value >= 1) {
                for (int i = 1; i <= value; i++) {
                    euroCounter++;
                }
                System.out.println(euroCounter + " coin(s) of 1 euro.");
                value = value - euroCounter;
            }
            if (value < 1 && value >= 0.50) {
                for (double i = 0.50; i <= value; i += 0.50) {
                    centsCounter++;
                }
                System.out.println(centsCounter + " coin(s) of 50 cents.");
                value = value - (centsCounter * 0.50);
                centsCounter = 0;
            }
            if (value < 0.50 && value >= 0.20) {
                for (double i = 0.20; i <= value; i += 0.20) {
                    centsCounter++;
                }
                System.out.println(centsCounter + " coin(s) of 20 cents.");
                value = value - (centsCounter * 0.20);
                centsCounter = 0;
            }
            if (value < 0.20 && value >= 0.10) {
                for (double i = 0.10; i <= value; i += 0.10) {
                    centsCounter++;
                }
                System.out.println(centsCounter + " coin(s) of 10 cents.");
                value = value - (centsCounter * 0.10);
                centsCounter = 0;
            }
            if (value < 0.10 && value >= 0.05) {
                for (double i = 0.05; i <= value; i += 0.05) {
                    centsCounter++;
                }
                System.out.println(centsCounter + " coin(s) of 5 cents.");
                value = value - (centsCounter * 0.05);
                centsCounter = 0;
            }
            if (value < 0.05 && value >= 0.02) {
                for (double i = 0.02; i <= value; i += 0.02) {
                    centsCounter++;
                }
                System.out.println(centsCounter + " coin(s) of 2 cents.");
                value = value - (centsCounter * 0.02);
                centsCounter = 0;
            }
            if (value < 0.02) {
                for (double i = 0; i <= value; i += 0.01) {
                    centsCounter++;
                }
                System.out.println(centsCounter + " coin(s) of 1 cent.");
            }
}
}
    


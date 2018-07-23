/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java13;

import java.util.Scanner;

/**
 *
 * @author Bhavana
 */
public class Java13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
   
  System.out.print("Input first number: ");
  int num1 = in.nextInt();
   
  System.out.print("Input second number: ");
  int num2 = in.nextInt();
   
  System.out.print("Input third number: ");
  int num3 = in.nextInt();
   
  System.out.print("Input fourth number: ");
  int num4 = in.nextInt();
  
  System.out.print("Enter fifth number: ");
  int num5 = in.nextInt();
   
   
  System.out.println("Average of five numbers is: " + 
   (num1 + num2 + num3 + num4 + num5) / 5);
 }
}
        // TODO code application logic here
    }
    
}

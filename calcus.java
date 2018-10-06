/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class JavaApplication2{

    /**
    * m
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        System.out.println("Enter three numbers");
        Scanner scanner = new  Scanner(System.in);
        Scanner sec = new  Scanner(System.in);
        Scanner third = new Scanner(System.in);

        int a = scanner.nextInt();
         int b = scanner.nextInt();
         int c = scanner.nextInt();
         
        int sum;
        
        sum = a + b + c;
        
        System.out.println("The sum " + sum);
    }
    
}

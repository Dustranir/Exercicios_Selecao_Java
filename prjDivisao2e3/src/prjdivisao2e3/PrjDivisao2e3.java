/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prjdivisao2e3;

import java.util.Scanner;

/**
 *
 * @author jorge.tavares
 */
public class PrjDivisao2e3 {

    /*
     * @param args
     */
    public static void main(String[] args) {
        
       /*Criar um programa que efetue a leitura de quatro números inteiros e 
       apresentar os números que são divisíveis por 2 e 3.
       */
       
        int n1,n2,n3,n4;
        
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("Digite o primeiro que deseja verificar: ");
        n1 = scanner.nextInt();
        System.out.println("Digite o segundo que deseja verificar: ");
        n2 = scanner.nextInt();
        System.out.println("Digite o terceiro que deseja verificar: ");
        n3 = scanner.nextInt();
        System.out.println("Digite o quarto que deseja verificar: ");
        n4 = scanner.nextInt();       
              
        if (n1 % 2 == 0 && n1 % 3 == 0 ){
            System.out.println(n1);
        }
        if (n2 % 2 == 0 && n2 % 3 == 0 ){
            System.out.println(n2);
        }
        if (n3 % 2 == 0 && n3 % 3 == 0 ){
            System.out.println(n3);
        }
        if (n4 % 2 == 0 && n4 % 3 == 0 ){
            System.out.println(n4);
        }
        
        scanner.close();
    }
    
}

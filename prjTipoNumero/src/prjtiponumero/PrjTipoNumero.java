/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prjtiponumero;

/**
 *
 * @author jorge.tavares
 */
import java.util.Scanner;

public class PrjTipoNumero {

    public static void main(String[] args) {
        int valorNumero;
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual número deseja consultar? ");
        valorNumero = scanner.nextInt();
        
        if (valorNumero > 0) {
            System.out.println("O número é positivo.");
        } else if (valorNumero < 0) {
            System.out.println("O número é negativo.");
        } else {
            System.out.println("O número é igual a zero.");
        }

        scanner.close();
    }
}

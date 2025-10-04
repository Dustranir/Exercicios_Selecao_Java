/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prjquantidadedolar;

import java.util.Scanner;

/**
 *
 * @author jorge.tavares
 */
public class PrjQuantidadeDolar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double qtdDolares = 0.0d;
        double cotacaoDolar = 0.0d;
        double valorReais = 0.0d;
        
        // Entrada de dados:
        Scanner scanner = new Scanner (System.in);
        System.out.println("Informe a quantidade de US$ no cofre: ");
        qtdDolares = scanner.nextDouble();
        System.out.println("Informe a cotação do US$ no dia: ");
        cotacaoDolar = scanner.nextDouble();
        
        valorReais = qtdDolares * cotacaoDolar;
        
        System.out.println("O valor em R$ é de: " + valorReais);

    }
    
}

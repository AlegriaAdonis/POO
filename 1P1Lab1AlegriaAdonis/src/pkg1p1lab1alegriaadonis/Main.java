/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg1p1lab1alegriaadonis;

import java.util.Scanner;

/**
 *
 * @author ESPE
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner ( System.in);
        System.out.println("---------------------------- ");
        System.out.println("           ESPE ");
        System.out.println("    Alegria Valle Adonis ");
        System.out.println("           ITIN ");
        System.out.println(" Programacion Orientada a Objetos ");
        System.out.println("   Ing. Veronica Martinez ");
        System.out.println("---------------------------- ");
        System.out.println("Ingrese 2 numeros para realizar operaciones basica ");
        System.out.println("---------------------------- ");
        System.out.println("Ingrese el primer numero: ");
        double N1 = scanner.nextDouble();
        System.out.println("Ingrese el segundo numero: ");
        double N2 = scanner.nextDouble();
        double suma = N1 + N2;
        double rest = N1 - N2;
        double multi = N1 * N2;
        double div = N1 / N2;
        System.out.println("La suma es: " + suma);
        System.out.println("La resta es: " + rest);
        System.out.println("La multiplicacion es: " + multi);
        System.out.println("La divicion es: " + div);
        
        scanner.close();
    }
    
}

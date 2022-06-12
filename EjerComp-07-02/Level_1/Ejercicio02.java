/* Level 1 Ejercicio02
Realizar un programa que solicite por consola 2 números enteros. Para luego
imprimir el resultado de la suma, resta, multiplicación, división y módulo (resto
de la división) de ambos números. */

import java.util.Scanner;

public class Ejercicio02 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in);
    double numero1, numero2;
    
// Introducción de los números
 /* System.out.println("Escribe dos números para obtener el " 
						+ "resultado de su suma, resta, multiplicación,"
						+ " división y resto"); */
    System.out.print("Ingrese el primer número: ");
      numero1 = scanner.nextDouble();
    System.out.print("Ingrese el segundo número: ");
      numero2 = scanner.nextDouble();
// Realizamos Cálculos y mostramos en pantalla
	System.out.println("");
    System.out.println(numero1 + " + " + numero2 + " = " 
						+ (numero1 + numero2));
    System.out.println(numero1 + " - " + numero2 + " = "  
						+ (numero1 - numero2));
    System.out.println(numero1 + " * " + numero2 + " = " 
						+ (numero1 * numero2));
    System.out.println(numero1 + " / " + numero2 + " = " 
						+ (numero1 / numero2));
    System.out.print(numero1 + " % " + numero2 + " = " 
						+ (numero1 % numero2));
  }
}


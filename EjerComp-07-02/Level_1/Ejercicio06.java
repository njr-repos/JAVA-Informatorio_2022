// Level_1 Ejercicio06

import java.util.Scanner;

 public class Ejercicio06 {

    public static void main(String[] args){

        //declaración de variables
        int n1, n2; 
        double potencia;
        Scanner sc = new Scanner(System.in);

        //leer el primer número
        System.out.println("Introduce un número entero: ");
        n1 = sc.nextInt();      //lee un entero por teclado

        //leer el segundo número
        System.out.println("Introduce otro número entero: ");
        n2 = sc.nextInt();      //lee un entero por teclado
        potencia = n1;
        
        //Cálculo de la multiplicación
        for(int i = 1; i < n2 ; i++){
			
			potencia = potencia * n1;
            }
           
            //
        
        //mostrar resultado
        System.out.println(n1+ " elevado a la " + n2 + " = " +  potencia);

    }
}

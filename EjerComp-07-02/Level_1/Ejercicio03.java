// Level_1 Ejercicio03

import java.util.Scanner;

public class Ejercicio03 {

    public static void main(String[] args) {
        int numero;
        String cadena = "";
        Scanner sc = new Scanner(System.in);
       
        System.out.println("Para generar la secuencia de números");
        System.out.print("Introduce un número: ");
        numero = sc.nextInt();

        for (int i = 1; i < numero+1; i++){
            cadena = cadena +" "+ i;
            System.out.println(cadena);
        }                
    }
   
}


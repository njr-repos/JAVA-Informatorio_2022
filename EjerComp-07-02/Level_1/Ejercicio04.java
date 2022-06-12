// Level_1 Ejercicio04

import java.util.Scanner;

public class Ejercicio04 {

    public static void main(String[] args) {
        int numero;
        double factorial = 1;
        Scanner sc = new Scanner(System.in);
       
        //Leer un número entero >= 0
        do{
            System.out.print("Introduce un número > 0: ");
            numero = sc.nextInt();
        }while (numero < 0);

        for(int i = 0; i <= numero ; i++){ //para cada número desde 1 hasta N                                               
           
            //se calcula su factorial
            factorial = 1;
            for(int j = 1; j <= i; j++){
                factorial = factorial * j;
            }

            //se muestra el factorial
            //System.out.printf("%2d! = %.0f %n",
			//					i, factorial);

        }
        // 
         System.out.printf("El factorial de %d! es: %.0f %n", 
								numero, factorial);
    }
   
}

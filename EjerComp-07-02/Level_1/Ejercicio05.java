// Level_1 Ejercicio05

import java.util.Scanner;

 public class Ejercicio05 {

    public static void main(String[] args){

        //declaración de variables
        int n1, n2, multiplica = 0;
        Scanner sc = new Scanner(System.in);

        //leer el primer número
        System.out.println("Introduce un número entero: ");
        n1 = sc.nextInt();      //lee un entero por teclado

        //leer el segundo número
        System.out.println("Introduce otro número entero: ");
        n2 = sc.nextInt();      //lee un entero por teclado
        
        //Cálculo de la multiplicación
        for(int i = 1; i <= n2 ; i++){
			
			multiplica = multiplica + n1;
            }
           
            //
        
        //mostrar resultado
        System.out.println(n1+ " x " + n2 + " = " +  multiplica);

    }
}

package ejercicio22tema3;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author javie
 */
public class Ejercicio22Tema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num1, num2, resultado;
        
        try {
             System.out.print("Introduce el dividendo: ");
             num1 = entrada.nextInt();
             
             System.out.print("Introduce el divisor: ");
             num2 = entrada.nextInt();
             
             resultado = num1 + num2;
             System.out.println("El resultado de la division es: " + resultado);
            } catch (InputMismatchException e){
                System.out.println("Debes introducir un numero");
            }
            
         
    }
    
}

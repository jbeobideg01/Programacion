package ejercicio21tema3;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author javie
 */
public class Ejercicio21Tema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);
         double dividendo, divisor, resultado;
         
         try {
             System.out.print("Introduce el dividendo: ");
             dividendo = entrada.nextDouble();
             
             System.out.print("Introduce el divisor: ");
             divisor = entrada.nextDouble();
             
             if (divisor == 0){
                 System.out.println("El divisor no puede ser 0");
             } else {
                 resultado = dividendo / divisor;
             System.out.println("El resultado de la division es: " + resultado);
             }

         } catch (ArithmeticException e){
             System.out.println("El divisor no puede ser 0");
             
         } catch (InputMismatchException e){
             System.out.println("Debes introducir un numero");
         }
         
    }
    
}

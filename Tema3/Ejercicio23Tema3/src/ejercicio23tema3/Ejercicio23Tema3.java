package ejercicio23tema3;

import java.util.Scanner;

/**
 *
 * @author javie
 */
public class Ejercicio23Tema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num1, num2;
        
        do {
            System.out.println("Introduce un numero: ");
            num2 = entrada.nextInt();
            
            if (num2 <= 1){
                System.out.println("El numero introducido debe ser mayor que 1");
            }
        } while (num2 <= 1);
        
        for (num1 = 1; num1 <= num2; num1++){
            System.out.println(num1);
        }
    }
    
}

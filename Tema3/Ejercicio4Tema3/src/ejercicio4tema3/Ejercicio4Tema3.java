package ejercicio4tema3;

import java.util.Scanner;

/**
 *
 * @author javie
 */
public class Ejercicio4Tema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); //pongo el escaner
        int num1, num2, num3;//declaro las variables
        
        System.out.println("Introduce el primer numero: ");
        num1 = entrada.nextInt();
        System.out.println("Introduce el segundo numero: ");
        num2 = entrada.nextInt();
        System.out.println("Introduce el tercer numero: ");
        num3 = entrada.nextInt();
        
        if (num1 < num2 && num1 < num3) {
            System.out.println("El numero menor de los introducidos es el " + num1);
        }
        else if (num2 < num1 && num2 < num3) {
            System.out.println("El numero menor de los introducidos es el " + num2);
        }
        else {
            System.out.println("El numero menor de los introducidos es el " + num3);
        }
    }
    
}

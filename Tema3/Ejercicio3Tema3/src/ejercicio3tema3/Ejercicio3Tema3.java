package ejercicio3tema3;

import java.util.Scanner;

/**
 *
 * @author javie
 */
public class Ejercicio3Tema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); //pongo el escaner
        int num1, num2, num3;//declaro las variables
        
        System.out.println("Introduce el primer numero: ");//solicito los numeros
        num1 = entrada.nextInt();//guardo los numeros
        System.out.println("Introduce el segundo numero: ");
        num2 = entrada.nextInt();
        System.out.println("Introduce el tercer numero: ");
        num3 = entrada.nextInt();
        
        if (num1 > num2 && num1 > num3) {//si num1 es mayor que num2 y num3...
            System.out.println("El numero mayor de los introducidos es el " + num1);
        }
        else if (num2 > num1 && num2 > num3) {//sino, si num2 es mayor que num1 y num3...
            System.out.println("El numero mayor de los introducidos es el " + num2);
        }
        else {
            System.out.println("El numero mayor de los introducidos es el " + num3);
        }
    }
    
}

package ejercicio5tema3;

import java.util.Scanner;

/**
 *
 * @author javie
 */
public class Ejercicio5Tema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); //pongo el escaner
        int numero, calculo;//declaro la variable
        
        System.out.println("Introduzca un numero: ");//solicito un numero
        numero = entrada.nextInt();
        calculo = numero % 2;
        
        if (calculo == 0) {
            System.out.println("El numero introducido es par");
        }
        else {
            System.out.println("El numero introducido es impar");
        }
    }
    
}

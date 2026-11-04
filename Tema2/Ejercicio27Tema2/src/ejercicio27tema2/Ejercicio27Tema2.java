package ejercicio27tema2;

import java.util.Scanner;

/**
 *
 * @author javie
 */
public class Ejercicio27Tema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, doble, cubo;
        
        System.out.println("Por favor, introduzca un numero: ");
        numero = entrada.nextInt();
        doble = numero * numero;
        cubo = numero * numero * numero;
        
        System.out.println("El doble de " + numero + " es: " + doble);
        System.out.println("El cubo de " + numero + " es: " + cubo);
    }
    
}

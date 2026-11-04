package ejercicio2tema3;

import java.util.Scanner;

/**
 *
 * @author javie
 */
public class Ejercicio2Tema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); //pongo el escaner
        int num1, num2, suma, multiplicacion;//declaro las variables
        
        System.out.println("Introduzca un numero: ");//solicito un numero
        num1 = entrada.nextInt();//guardo el numero
        System.out.println("Introduzca otro numero: ");
        num2 = entrada.nextInt();
        
        suma = num1 + num2;//calculo ambos resultados
        multiplicacion = num1 * num2;
        
        if (num1 > 10) {//si num1 es mayor que 10...
            System.out.println("La opereacion que se realizo es producto y el resultado es " + multiplicacion);
        }
        else {
            System.out.println("La opereacion que se realizo es suma y el resultado es " + suma);
        }
    }
    
}

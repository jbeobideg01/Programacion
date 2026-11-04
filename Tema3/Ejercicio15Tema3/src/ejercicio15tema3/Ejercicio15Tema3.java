package ejercicio15tema3;

import java.util.Scanner;

/**
 *
 * @author javie
 */
public class Ejercicio15Tema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, multiplicar;

        System.out.print("Introduzca un numero para calcular su tabla de multiplicar: ");
        numero = entrada.nextInt();

        for (multiplicar = 0; multiplicar <= 10; multiplicar++) {
            System.out.println(numero + " x " + multiplicar + " = " + (numero * multiplicar));
                        
            }
        }
    }
    


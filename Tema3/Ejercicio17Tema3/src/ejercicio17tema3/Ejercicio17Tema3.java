package ejercicio17tema3;

import java.util.Scanner;

/**
 *
 * @author javie
 */
public class Ejercicio17Tema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        
        do {
            System.out.println("Introduce un numero para calcular su raiz cuadrada: ");
            numero = entrada.nextInt();
            
            if (numero < 0){
                System.out.println("No se puede calclar la raiz de un numero negativo, introduzca otro numero");
            }
        }while (numero < 0);
        
        double resultado = Math.sqrt(numero);
        System.out.println("la raiz cuadrada de "+ numero + " es: " + resultado);
    }
    
}

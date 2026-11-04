package ejercicio25tema2;

import java.util.Scanner;

/**
 *
 * @author javie
 */
public class Ejercicio25Tema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num1, num2, num3, suma, multiplicacion;
        
        System.out.println("Por favor, introduzca el primer numero: ");
        num1 = entrada.nextInt();
        
        System.out.println("Por favor, introduzca el segundo numero: ");
        num2 = entrada.nextInt();
        
        System.out.println("Por favor, introduzca el tercer numero: ");
        num3 = entrada.nextInt();
        
        suma = num1 + num2 + num3;
        System.out.println("La suma de los numeros introducidos es: " + suma);
        
        multiplicacion = num1 * num2 * num3;
        System.out.println("El producto de los numeros introducidos es: " + multiplicacion);
    }
    
}

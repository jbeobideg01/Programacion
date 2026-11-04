package ejercicio22tema2;

import java.util.Scanner;

/**
 *
 * @author javie
 */
public class Ejercicio22Tema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double lado, perimetro, area;
        
        System.out.println("Por favor, introduzca la medida de un lado: ");
        lado = entrada.nextDouble();
        perimetro = 3 * lado;
        area = (Math.sqrt(3) / 4) * lado * lado;
        
         System.out.println("El area de un triangulo de lado: " + lado + " es: " + area);
         System.out.println("El perimetro de un triangulo de lado: " + lado + " es: " + perimetro);
        
    }
    
}

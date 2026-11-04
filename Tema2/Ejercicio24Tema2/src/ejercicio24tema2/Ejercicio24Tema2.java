package ejercicio24tema2;

import java.util.Scanner;

/**
 *
 * @author javie
 */
public class Ejercicio24Tema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double notaProgramacion, notaLenguajes, notaBasesDatos, notaEntornos, notaSistemas, notaFol, media;
        
        System.out.println("Por favor, introduzca la nota de Programacion: ");
        notaProgramacion = entrada.nextDouble();
        
        System.out.println("Introduzca la nota de Lenguajes de Marcas: ");
        notaLenguajes = entrada.nextDouble();
        
        System.out.println("Introduzca la nota de Bases de Datos: ");
        notaBasesDatos = entrada.nextDouble();
        
        System.out.println("Introduzca la nota de Entornos de Desarrollo: ");
        notaEntornos = entrada.nextDouble();
        
        System.out.println("Introduzca la nota de Sistemas Informaticos: ");
        notaSistemas = entrada.nextDouble();
                
        System.out.println("Por ultimo, introduzca la nota de Formacion y Orientacion Laboral: ");
        notaFol = entrada.nextDouble();
        
        
        media = (notaProgramacion + notaLenguajes + notaBasesDatos + notaEntornos + notaSistemas + notaFol) / 6;
        System.out.println("Su nota media del curso es de: " + media);
    }
    
}

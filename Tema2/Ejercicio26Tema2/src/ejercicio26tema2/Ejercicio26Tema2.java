package ejercicio26tema2;

import java.util.Scanner;

/**
 *
 * @author javie
 */
public class Ejercicio26Tema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, primeraCifra, segundaCifra, terceraCifra, cuartaCifra;
        
        System.out.println("Por favor, introduzca un numero de 4 cifras: ");
        numero = entrada.nextInt();
        primeraCifra = numero / 1000;
        segundaCifra = (numero / 100) % 10;
        terceraCifra = (numero / 10) % 10;
        cuartaCifra = numero % 10;
        
        System.out.println("La primera cifra es: " + primeraCifra);
        System.out.println("La segunda cifra es: " + segundaCifra);
        System.out.println("La tercera cifra es: "+ terceraCifra);
        System.out.println("La cuarta cifra es: " + cuartaCifra);
    }
    
}

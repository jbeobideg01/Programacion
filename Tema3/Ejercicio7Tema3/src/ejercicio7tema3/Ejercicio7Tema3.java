package ejercicio7tema3;

import java.util.Scanner;

/**
 *
 * @author javie
 */
public class Ejercicio7Tema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int diasemana;
        boolean laborable = false;
        
        System.out.println("Introduzca un numero del dia de la semana: ");
        diasemana = entrada.nextInt();
        
        switch (diasemana) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                laborable=true;
                break;

            case 6:
            case 7:
                laborable=false;
        }
        if (laborable == true) {
            System.out.println("El dia " + diasemana + " es un dia laborable");
        }
        else {
            System.out.println("El dia " + diasemana + " no es un dia laborable");
        }
    }
    
}

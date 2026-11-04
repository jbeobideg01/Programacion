package ejercicio1tema3;

import java.util.Scanner;

/**
 *
 * @author javie
 */
public class Ejercicio1Tema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); //pongo el escaner
        int numero; //declaro la variable
        
        System.out.println("Por favor, introduzca un numero positivo o negativo: ");//solicito un numero al usuario
        numero = entrada.nextInt();//guardo el numero introducido en la variable
        
        if (numero > 0) {//si el numero es mayor que cero...
            System.out.println("El numero introducido es positivo");
        }
        else if (numero == 0){//si el numero es igual a cero...
            System.out.println("El numero introducido es neutro");
        }
        else {
            System.out.println("El numero introducido es negativo");
        }
    }
    
}

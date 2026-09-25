package ejercicio23tema2;

import java.util.Scanner;

/**
 *
 * @author javie
 */
public class Ejercicio23Tema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);//Creo el objeto de entrada
        double precio, total;//Declaro las variables
        int unidades;
        System.out.println("Por favor, introduzca el precio del modelo de ordenador que desea comprar: ");//pongo la primera peticion
        precio = entrada.nextDouble();//guardo el valor introducido
        
        System.out.println("Cuantas unidades quiere llevarse? ");
        unidades = entrada.nextInt();
        
        total = precio * unidades;//aplico la formula
        System.out.println("El precio total de su compra es de: " + total + " Euros");//muestro el resultado final
    }
    
}

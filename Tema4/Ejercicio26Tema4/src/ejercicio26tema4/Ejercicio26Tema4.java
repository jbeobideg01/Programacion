package ejercicio26tema4;

import java.util.Scanner;

/**
 *
 * @author javie
 */
public class Ejercicio26Tema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero;//Declaro la variable numero
        boolean primo;//Declaro el boolean primo
        numero = pedirNumero();//Numero es igual a lo que me devuelva el metodo pedirNumero
        primo = esPrimo(numero);//primo es igual a lo que me devuelva el metodo esPrimo
        if (primo) { //si primo es true...
            System.out.println("El numero " + numero + " es primo");//muestro el mesaje con el numero introducido
        } 
        else {//si primo es false...
            System.out.println("El numero " + numero + " no es primo");//muestro el mensaje con el numero introducido
        }
    }
    public static int pedirNumero() { //creo el metodo pedirNumero
        Scanner entrada = new Scanner(System.in);//pongo el scanner
        int dato;//declaro la varible dato
        System.out.println("Introduzca un numero: ");//solicito un numero
        dato = entrada.nextInt();//guardo el numero
        return dato;//devuelvo el valor de dato al main
    }
    public static boolean esPrimo(int numero) {//creo el metodo esPrimo con el valor de numero
        boolean primo = true;//declaro el boolean primo
        int calculo;//declaro la variable calculo
        for (calculo = 2; calculo < numero; calculo++) {//creo el bucle para comprobar si es primo
            if (numero % calculo == 0) {//si el numero no es primo...
                primo = false;//primo es igual a false
            }
        }
        return primo;//devuelvo el valor de primo al main
    }
}

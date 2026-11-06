package ejercicio17tema4;

import java.util.Scanner;

/**
 *
 * @author javie
 */
public class Ejercicio17Tema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int letra;//declaro la variable letra
        int letraAleatoria = letraAleatoria();//declaro la variable letraAleatoria y le doy el valor que me devuelva el metodo letraAleatoria
        int contador = 0;//creo la variable contador
        
        do {
            letra = pedirLetra();//a la variable letra le doy el valor que me devuleva el metodo pedirLetra
            
            if (letra < letraAleatoria){//si la letra introducida es menor que la letra aleatoria...
                System.out.println("La letra esta despues en el abecedario");//muestro el mensaje
                contador++;//y sumo 1 al contador
            }
            else if (letra > letraAleatoria){//si la letra introducida es mayor que a letra aleatoria...
                System.out.println("La letra esta antes en el abecedario");//muestro el mensaje
                contador++;//y sumo 1 al contador
            }
            else{//si ninguna de las anteriores pasa
                contador++;//sumo 1 al contador
                System.out.println("Correcto, la has acertado en " + contador + " intentos");//muestro el mensaje y los intentos que ha tardado
            }
        }
        while (letra != letraAleatoria);//se hace lo anterior mientras letra no sea igual a letraAleatoria
    }
    public static char letraAleatoria(){//creo el metodo letraAleatoria
        char letraAleatoria;//creo la variable letraAleatoria
        letraAleatoria = (char) ((Math.random() * 26) + 97);//le doy un valor aleatorio del abecedario
        return letraAleatoria;//devuelvo el valor
    }
    public static char pedirLetra(){//creo el metodo pedirLetra
        Scanner entrada = new Scanner(System.in);//pongo el scanner
        System.out.println("Introduzca una letra: ");//solicito una letra
        char letra = entrada.nextLine().charAt(0);//guardo la letra
        return letra;//devuelvo el valor introducido
    }
    
}

package ejercicio14tema4;

import java.util.Scanner;

/**
 *
 * @author javie
 */
public class Ejercicio14Tema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero = 0;//declaro la variable numero
        boolean comprobar = false;//declaro el boolean comprobar
        while(!comprobar){//mientras que comprobar sea falso...
            numero = pedirNumero();//numero es igual a lo que devuelva el metodo pedirNumero
            comprobar = comprobarNumero(numero);//comprobar es igual a lo que devuelva el metodo comprobarNumero
        }
        calcularMostrar(numero);//mando al metodo calcularMostrar con la variable numero
    }
    public static int pedirNumero(){//creo el metodo pedirNumero
        Scanner entrada = new Scanner(System.in);//pongo el scanner
        int dato1;//declaro la variable dato1
        System.out.println("Introduzca un numero: ");//solicito un numero
        dato1 = entrada.nextInt();//guardo el numero
        return dato1;//devuelvo el numero al main
    }
    public static boolean comprobarNumero(int numero){//creo el metodo comprobarNumero con el valor de numero
        boolean dato2;//creo el boolean dato2
        if (numero > 0){//si numero es mayor que 0...
            dato2 = true;//dato2 es true
        }
        else{//sino es mayor que 0
            dato2 = false;//dato2 es false
            System.out.println("Error, el numero introducido debe ser mayor que 0");//muestro el error por pantalla
        }
        return dato2;//devuelvo el valor de dato2 al main
    }
    public static void calcularMostrar(int numero){//creo el metodo calcularMostrar con el valor de numero
        int inicio, contador = 0;//creo las variables inicio y contador
        System.out.println("Los multiplos de 3 existentes entre el 1 y el " + numero + " son: ");//muestro el mensaje por pantalla
        for (inicio = 1 ; inicio <= numero ; inicio++){//creo un bucle para mostrar todos los numeros
            if (inicio % 3 == 0){//si el valor de inicio es multiplo de 3...
                System.out.println(inicio);//muestro el valor por pantalla
                contador++;//y sumo 1 al contador
            }
        }
        System.out.println("Se han mostrado un total de  " + contador + " numeros");//muestro el total de numeros que se han mostrado
    }
    
}

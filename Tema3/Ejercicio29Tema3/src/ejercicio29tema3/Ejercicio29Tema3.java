package ejercicio29tema3;

import java.util.Scanner;

/**
 *
 * @author javie
 */
public class Ejercicio29Tema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);//pongo el escaner
        int numeroAleatorio, numeroIntroducido, intentos = 0;//declaro las variables
        numeroAleatorio = (int) (Math.random() * 100 + 1);//genero el numero aleatorio
        
        do {//mientras que el numero introducido no sea igual al numero aleatorio...
            System.out.println("Adivina un numero aleatorio entre el 1 y el 100: ");//solicito un numero al usuario
            numeroIntroducido = entrada.nextInt();//guardo el numero
            intentos++;//sumo un intento
            
            if (numeroIntroducido > numeroAleatorio){//si el numero introducido es mayor que el numero aleatorio...
                System.out.println("El numero que has introducido es mayor que el numero aleatorio");//muestro el mesaje por pantalla
            }
            else if (numeroIntroducido < numeroAleatorio){//si el numero introducido es menor que el numero aleatorio...
               System.out.println("El numero que has introducido es menor que el numero aleatorio");//muestro el mesaje por pantalla
            }
            
        }while(numeroIntroducido != numeroAleatorio);// hago lo anterior mientras que el numero introducido no sea igual al numero aleatorio
        System.out.println("Enhorabuena, has acertado el numero aleatorio en " + intentos + " intentos");//muestro por pantalla que ha acertado el numero y la cantidad de intentos que ha necesitado
        
    }
    
}

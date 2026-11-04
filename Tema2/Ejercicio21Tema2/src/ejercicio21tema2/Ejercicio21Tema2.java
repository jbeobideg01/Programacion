package ejercicio21tema2;

import java.util.Scanner;

/**
 *
 * @author javie
 */
public class Ejercicio21Tema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       long tiempo, horas, dias, minutos, segundos;
       
       System.out.println("Por favor, introduzca un numero de segundos: ");
       tiempo = entrada.nextLong();
       
       dias = tiempo / 86400;
       horas = (tiempo % 86400) / 3600;
       minutos = (tiempo % 3600) / 60;
       segundos = tiempo % 60;
       System.out.println(tiempo + " segundos hacen un total de : " + dias + " dias, " + horas + " horas," + minutos + " minutos y " + segundos + " segundos");
    }
    
}

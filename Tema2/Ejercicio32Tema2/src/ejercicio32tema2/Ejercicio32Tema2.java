package ejercicio32tema2;

import java.util.Scanner;

/**
 *
 * @author javie
 */
public class Ejercicio32Tema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);//creo el escaner
        int importe, billetes50, billetes20, billetes10, billetes5, monedas2, monedas1;//declaro las variables
        
        System.out.println("Por favor, indique una cantidad de dinero: ");//solicito una cantidad
        importe = entrada.nextInt();//guardo la cantidad
        
        billetes50 = importe / 50;//aplico todas las formulas
        billetes20 = (importe % 50) / 20;
        billetes10 = ((importe % 50) % 20) / 10;
        billetes5 = (((importe % 50) % 20) % 10) / 5;
        monedas2 = ((((importe % 50) % 20) % 10) % 5) / 2;
        monedas1 = ((((importe % 50) % 20) % 10) % 5) % 2;
        
        System.out.println(importe + " Euros se descomponen en " + billetes50 + " billetes de 50, " + billetes20 + " billetes de 20, " + 
                billetes10 + " billetes de 10, " + billetes5 + " billetes de 5, " + monedas2 + " monedas de 2 euros y " + monedas1 + " monedas de 1 euro");//muestro el resultado
    }
    
}

package ejercicio8tema3;

import java.util.Scanner;

/**
 *
 * @author javie
 */
public class Ejercicio8Tema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int importe, billetes50, billetes20, billetes10, billetes5, monedas2, monedas1;
        
        System.out.println("Introduzca un importe de euros: ");
        importe = entrada.nextInt();
        
        System.out.println(importe + " euros se descomponen en: ");
        
        billetes50 = importe / 50;
        billetes20 = (importe % 50) / 20;
        billetes10 = ((importe % 50) % 20) / 10;
        billetes5 = (((importe % 50) % 20) % 10) / 5;
        monedas2 = ((((importe % 50) % 20) % 10) % 5) / 2;
        monedas1 = ((((importe % 50) % 20) % 10) % 5) % 2;
        
        if (billetes50 > 0) {
            System.out.println("billetes de 50: " + billetes50);
        }
        else{
            
        }
        if (billetes20 > 0) {
            System.out.println("billetes de 20: " + billetes20);
        }
        else{
            
        }
        if (billetes10 > 0) {
            System.out.println("billetes de 10: " + billetes10);
        }
        else{
            
        }
        if (billetes5 > 0) {
            System.out.println("billetes de 5: " + billetes5);
        }
        else{
            
        }
        if (monedas2 > 0) {
            System.out.println("monedas de 2: " + monedas2);
        }
        else{
            
        }
        if (monedas1 > 0) {
            System.out.println("monedas de 1: " + monedas1);
        }
        else{
            
        }
    }
    
}

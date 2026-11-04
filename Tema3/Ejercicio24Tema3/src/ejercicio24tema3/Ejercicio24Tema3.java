package ejercicio24tema3;

import java.util.Scanner;

/**
 *
 * @author javie
 */
public class Ejercicio24Tema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num1, num2, contador = 0;
        
        do {
            System.out.println("Introduce un numero: ");
            num2 = entrada.nextInt();
            
            if (num2 <= 0){
                System.out.println("Introduce un numero mayor que 0");
            }
        }while (num2 <= 0);
        
        System.out.println("Los numero multiplos de 3 entre el 1 y el " + num2 + " son : ");
        
        for(num1 = 1; num1 <= num2; num1++){
            if (num1 % 3 == 0){
                System.out.println(num1);
                contador++;
            }
        }
        System.out.println("Se han mostrado un total de " + contador + " numeros");
    }
    
}

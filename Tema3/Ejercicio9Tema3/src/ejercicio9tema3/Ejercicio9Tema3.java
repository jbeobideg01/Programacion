package ejercicio9tema3;

import java.util.Scanner;

/**
 *
 * @author javie
 */
public class Ejercicio9Tema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);//pongo el escaner
        int num1, num2, num3, num4, num5;//declaro las variables
        
        System.out.println("Introduzca el primer numero: ");//solicito los 4 primeros numeros
        num1 = entrada.nextInt();
        System.out.println("Introduzca el segundo numero: ");
        num2 = entrada.nextInt();
        System.out.println("Introduzca el tercer numero: ");
        num3 = entrada.nextInt();
        System.out.println("Introduzca el cuarto numero: ");
        num4 = entrada.nextInt();
        
        if (num1 > num2) {//voy viendo que numeros son mayores que otros y los reordeno de menor a mayor
            num5 = num1;
            num1 = num2;
            num2 = num5;
        }
        else {
            
        }  
        if (num2 > num3){
            num5 = num2;
            num2 = num3;
            num3 = num5;
        }
        else {
            
        }
        if (num3 > num4){
            num5 = num3;
            num3 = num4;
            num4 = num5;
        }
        else {
            
        }
        if (num1 > num2) {
            num5 = num1;
            num1 = num2;
            num2 = num5;
        }
        else {
            
        }  
        if (num2 > num3){
            num5 = num2;
            num2 = num3;
            num3 = num5;
        }
        else {
            
        }
        if (num3 > num4){
            num5 = num3;
            num3 = num4;
            num4 = num5;
        }
        else {
            
        }
        if (num1 > num2) {
            num5 = num1;
            num1 = num2;
            num2 = num5;
        }
        else {
            
        }  
        if (num2 > num3){
            num5 = num2;
            num2 = num3;
            num3 = num5;
        }
        else {
            
        }
        if (num3 > num4){
            num5 = num3;
            num3 = num4;
            num4 = num5;
        }
        else {
            
        }
        
        System.out.println("el orden de los numeros introducidos es el " + num1 + num2 + num3 + num4);//muestro el orden de los numeros
    }
    
}

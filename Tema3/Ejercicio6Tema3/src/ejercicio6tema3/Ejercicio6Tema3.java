package ejercicio6tema3;

import java.util.Scanner;

/**
 *
 * @author javie
 */
public class Ejercicio6Tema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);//pongo el escaner
        int nota;//declaro la variable nota
        
        System.out.println("Introduzca la nota del alumno: ");//solicito al usuario una nota
        nota = entrada.nextInt();//guardo la nota
        
        switch(nota){
            case 0:
            case 1:
            case 2:
            case 3:
            case 4: 
                System.out.println("Suspenso");
                break;//en caso de que nota sea del 0 al 4 mostrar suspenso 
            
            case 5:
            case 6: 
                System.out.println("Bien");
                break;//en caso de que nota sea 5 o 6 mostrar bien
            
            case 7:
            case 8: 
                System.out.println("Notable");
                break;//en caso de que nota sea 7 o 8 mostrar notable
            
            case 9:
            case 10: 
                System.out.println("Sobresaliente");
                break;//en caso de que nota sea 9 o 10 mostrar sobresaliente
            
            default: {
                System.out.println("El numero introducido no esta entre 0 y 10");//en caso de que nota no este entre el 0 y el 10 mostrar un aviso 
            }
        }
    }
    
}

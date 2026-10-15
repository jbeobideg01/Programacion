package ejercicio27tema3;

import java.util.Scanner;

/**
 *
 * @author javie
 */
public class Ejercicio27Tema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);//pongo el escaner
        int num1, num2, resultado, eleccion;//declaro las variables

        System.out.println("Introduzca el primer numero: ");//solicito al usuario los numeros
        num1 = entrada.nextInt();//guardo los numeros
        System.out.println("Introduzca el segundo numero: ");
        num2 = entrada.nextInt();
        
        do {//mientras que eleccion no sea 5...
            System.out.println("1 - Sumar los numeros");//muestro las acciones que se pueden hacer
            System.out.println("2 - Restar los numeros");
            System.out.println("3 - Multiplicar los numeros");
            System.out.println("4 - Dividir los numeros");
            System.out.println("5 - Salir del programa");
            System.out.println("Selecciona que accion de las anteriores desea hacer:");//solicito que accion desea hacer el usuario
            eleccion = entrada.nextInt();//guardo la accion deseada

            switch (eleccion) {
                case 1://en caso de que la accion sea la numero 1, calculo la suma de los numeros
                    resultado = num1 + num2;
                    System.out.println("El resultado de sumar " + num1 + " + " + num2 + " es: " + resultado);
                    break;
                case 2://en caso de que la accion sea la numero 2, calculo la resta de los numeros
                    resultado = num1 - num2;
                    System.out.println("El resultado de restar " + num1 + " - " + num2 + " es: " + resultado);
                    break;
                case 3://en caso de que la accion sea la numero 3, calculo la multiplicacion de los numeros
                    resultado = num1 * num2;
                    System.out.println("El resultado de multiplicar " + num1 + " * " + num2 + " es: " + resultado);
                    break;
                case 4://en caso de que la accion sea la numero 4, calculo la division de los numeros
                    try {
                        resultado = num1 / num2;
                        System.out.println("El resultado de dividir " + num1 + " / " + num2 + " es: " + resultado);
                    }
                    catch(ArithmeticException e){//si el divisor es 0 mostrara un error
                        System.out.println("Error, no se puede dividir entre 0");
                    }
                    break;
                case 5://en caso de que la accion sea la numero 5, se cerrara el programa
                    break;
                default://si la accion deseada no esta entre la 1 y la 5, mostrara un error
                    System.out.println("Error, esa opcion no esta disponible, selecciona otra");
                    break;
            }
        }while (eleccion != 5);//hace todo lo anterior mientras que la eleccion no sea 5
        
    }
    
}

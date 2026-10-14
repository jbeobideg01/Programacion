package ejercicio16tema3;

/**
 *
 * @author javie
 */
public class Ejercicio16Tema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero, contador;//declaro las variables
        contador = 0;//le doy valor 0 a la variable contador
        System.out.println("los numeros impares existentes entre el numero 20 y el 160 son:  ");//muestro ese mensaje por pantalla
        for(numero = 20 ; numero <= 160 ; numero++){//repito el bucle hasta que la variable numero sea menor o igual a 160
            if (numero % 2 != 0){//si al calcular numero % 2 no da 0
                System.out.println(numero + " -");//imprimo el numero
                contador++;//sumo 1 al contador
            }
        }
        System.out.println("la cantidad de numeros impares impresos han sido: " + contador);//muestro la cantidad de numeros impresos
    }
    
}

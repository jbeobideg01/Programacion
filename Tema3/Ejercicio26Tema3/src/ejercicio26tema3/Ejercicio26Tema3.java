package ejercicio26tema3;

/**
 *
 * @author javie
 */
public class Ejercicio26Tema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero, resultado = 0;
        
        for (numero = 111; numero <= 222; numero++){
            if (numero % 2 != 0){
                resultado = resultado + numero;
            }
        }
        System.out.println("El resultado de la suma de todos los numeros impares entre el 111 y el 222 es " + resultado);
    }
    
}

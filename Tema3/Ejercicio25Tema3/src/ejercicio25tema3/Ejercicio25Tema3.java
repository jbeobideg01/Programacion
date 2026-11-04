package ejercicio25tema3;

/**
 *
 * @author javie
 */
public class Ejercicio25Tema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero, resultado = 0;
        
        for (numero = 17; numero <= 139; numero++){
            if (numero % 2 == 0){
                resultado = resultado + numero;
            }
        }
        System.out.println("El resultado de la suma de todos los numeros pares entre el 17 y el 139 es " + resultado);
    }
    
}

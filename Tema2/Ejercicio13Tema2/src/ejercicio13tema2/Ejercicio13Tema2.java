package ejercicio13tema2;

/**
 *
 * @author javie
 */
public class Ejercicio13Tema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 2;
        int num3;
        
        System.out.println("La variable num1 contiene el valor " + num1 + 
                " y la variable num2 contiene el valor " + num2);
        
        num3 = num1;
        num1 = num2;
        num2 = num3;
        
        System.out.println("El valor de num1 es igual a " + num1 + 
                " el valor de num2 es igual a " + num2);
    }
    
}

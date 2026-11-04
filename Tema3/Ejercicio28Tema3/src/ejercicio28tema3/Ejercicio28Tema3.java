package ejercicio28tema3;

/**
 *
 * @author javie
 */
public class Ejercicio28Tema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero;
        numero = (int) (Math.random()*100 + 1);
        
        if (numero % 2 == 0){
            System.out.println("El numero " + numero + " es par");
        }
        else {
            System.out.println("El numero " + numero + " es impar");
        }
    }
    
}

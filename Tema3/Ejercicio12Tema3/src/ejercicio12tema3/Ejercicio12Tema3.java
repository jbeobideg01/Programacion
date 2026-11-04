package ejercicio12tema3;

/**
 *
 * @author javie
 */
public class Ejercicio12Tema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero = 11;
        do {
            if (numero % 2 == 0){
                System.out.println(numero);
            }
            numero ++;
        }
        while (numero <= 133);
    }
    
}

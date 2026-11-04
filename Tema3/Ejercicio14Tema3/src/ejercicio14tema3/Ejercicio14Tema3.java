package ejercicio14tema3;

/**
 *
 * @author javie
 */
public class Ejercicio14Tema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero = 1;
        do {
            if (numero % 2 == 0){
                System.out.println(numero);
            }
            numero ++;
        }
        while (numero <= 100);
    }
    
}

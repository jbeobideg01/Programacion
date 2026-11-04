package ejercicio16tema2;

/**
 *
 * @author javie
 */
public class Ejercicio16Tema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cantidad = 130;
        int billetes50;
        int billetes10;
        
        billetes50 = cantidad / 50;
        billetes10 = (cantidad % 50) / 10;
        
        System.out.println("130 euros hacen un total de: " + billetes50 + 
                " billetes de 50 euros y " + billetes10 + " billetes de 10 euros");
        
    }
    
}

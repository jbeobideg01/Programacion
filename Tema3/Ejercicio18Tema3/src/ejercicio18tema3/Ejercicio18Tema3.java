package ejercicio18tema3;

import java.util.Scanner;

/**
 *
 * @author javie
 */
public class Ejercicio18Tema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int intentos, contrasena;
        intentos = 0;
        boolean accesoConcedido = false;

        do {
            System.out.print("Introduce la contraseña: ");
            contrasena = entrada.nextInt();
            intentos++;

            if (contrasena == 1234) {
                accesoConcedido = true;
            } else if (intentos < 3) {
                System.out.println("Contraseña incorrecta, prueba otra vez");
            }

        } while (accesoConcedido == false && intentos < 3);

        if (accesoConcedido == true) {
            System.out.println("Has accedido correctamente");
        } else {
            System.out.println("Error de acceso: Has agotado los 3 intentos");
        }
    }
    
}

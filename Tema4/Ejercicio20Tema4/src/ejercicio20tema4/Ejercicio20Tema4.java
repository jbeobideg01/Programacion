package ejercicio20tema4;

import java.util.Scanner;

/**
 *
 * @author javie
 */
public class Ejercicio20Tema4 {
    public final static String RESPUESTA1 = "Madrid";//creo la constante  RESPUESTA1 con el valor Madrid
    public final static String RESPUESTA2 = "Colón";//creo la constante  RESPUESTA2 con el valor Colón

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nota;//Declaro la variable nota
        System.out.println("EXAMEN DE CULTURA GENERAL");//muestro el titulo del examen
        nota = pregunta1();//nota es igual a lo que me devuelva el metodo pregunta1
        nota = nota + pregunta2();//sumo a nota lo que me devuelva el metodo pregunta2
        mostrarNota(nota);//mando al metodo mostrarNota pasandole la nota
    }
    public static int pregunta1() {//creo el metodo pregunta1
        Scanner entrada = new Scanner(System.in);//pongo el scanner
        int puntos;//declaro la variable puntos
        System.out.print("1ª PREGUNTA: ¿Cual es la capital de España?: ");//muestro la pregunta por pantalla
        String respuesta = entrada.nextLine();//declaro y guardo la respuesta introducida
        if (respuesta.equalsIgnoreCase(RESPUESTA1)) {//si la respuesta es igual a RESPUESTA1, ignorando mayusculas...
            System.out.println("Muy bien, respuesta correcta.");//muestro el mensaje de acierto
            puntos = 5;//puntos es igual a 5
        } else {//si no es correcta...
            System.out.println("No es correcto. La respuesta correcta es " + RESPUESTA1);//muestro el mensaje de fallo y la respuesta correcta
            puntos = 0;//puntos es igual a 0    
        }
        return puntos;//devuelvo el valor de puntos al main
    }
    public static int pregunta2() {//creo el metodo pregunta2
        Scanner entrada = new Scanner(System.in);//pongo el scanner
        int puntos;//declaro la variable puntos
        System.out.print("2ª PREGUNTA: ¿Quien descubrio America?: ");//muestro la pregunta por pantalla
        String respuesta = entrada.nextLine();//declaro y guardo la respuesta introducida
        if (respuesta.equalsIgnoreCase(RESPUESTA2)) {//si la respuesta es igual a RESPUESTA2, ignorando mayusculas...
            System.out.println("Muy bien, respuesta correcta.");//muestro el mensaje de acierto
            puntos = 5;//puntos es igual a 5
        } else {//si no es correcta...
            System.out.println("No es correcto. La respuesta correcta sería " + RESPUESTA2);//muestro el mensaje de fallo y la respuesta correcta
            puntos = 0;//puntos es igual a 0
        }
        return puntos;//devuelvo el valor de puntos al main
    }    
    public static void mostrarNota(int nota) {//creo el metodo mostrarNota con el valor de nota
        System.out.println("NOTA DEL EXAMEN: " + nota);//muestro la nota final por pantalla
    }
    
}

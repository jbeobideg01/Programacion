package ejercicio15tema2;

/**
 *
 * @author javie
 */
public class Ejercicio15Tema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int tiempo = 10000;
        
        int horas;
        int minutos;
        int segundos;
        
        horas = tiempo / 3600;
        minutos = (tiempo % 3600) / 60;
        segundos = tiempo % 60;
        
        System.out.println("10000 segundos hacen un total de: " + horas + " horas, " + 
                minutos + " minutos, " + segundos + " segundos");
    }
    
}

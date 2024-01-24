
package calificaciones;
import java.util.Scanner;

/**
 *
 * @author JUAN
 */
public class Calificaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double calificacion1,calificacion2,calificacion3,promedio;
         
         Scanner teclado = new Scanner(System.in); 
         String Alumno;
         
         System.out.println("Nombre del alumno: ");
         Alumno= teclado.nextLine();
         
         System.out.println("Digita la calificacion 1 para calcular el promedio final :");
         calificacion1=teclado.nextDouble();
         
         System.out.println("Digita la calificacion 2 para calcular el promedio final :");
         calificacion2=teclado.nextDouble();
         
         System.out.println("Digita la calificacion 3 para calcular el promedio final :");
         calificacion3=teclado.nextDouble();
         
         promedio=(calificacion1+calificacion2+calificacion3)/3;
         System.out.println("El alumno: "+Alumno+" Obtuvo un promedio de : "+promedio);

        
        
    }
    
}

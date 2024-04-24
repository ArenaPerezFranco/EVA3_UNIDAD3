
package eva_3_4_captura_datos;

import java.util.Scanner;

/**
 *
 * @author leaha
 */
public class EVA_3_4_CAPTURA_DATOS {

  
    public static void main(String[] args) {
       int cant;
       Scanner captu = new Scanner(System.in);
        System.out.println("¿Cuantos nombres vas a capturar?");
        cant = captu.nextInt();
        
        String[] listaNombre = new String[cant];
        captu.nextLine();
        
        //Asugnar un tamaño
        //HAY QUE PREGUNTAR CADA NOMBRE:
        for (int i = 0; i < listaNombre.length; i++) {
            System.out.println("Nombre #" + (i+1) + ": ");
            listaNombre[i] = captu.nextLine();
        }
        for (int i = 0; i < listaNombre.length; i++) {
            System.out.println(listaNombre[i]);
          
    }
    
}
}

package eva3_1_arreglos;

/**
 *
 * @author leaha
 */
public class EVA3_1_ARREGLOS {

    
    public static void main(String[] args) {
        // LOS ARREGLOS EN JAVA SOB OBJETOS.
        //TENEMOS QUE CREARLOS ANTES DE USARLOS.
        
        //[] --> MANEJAR los indices: arreglo[3] acceso a la posición.
        //declaración = creación (new) [Tamaño del arreglo]
        int arreglo[] = new int[10]; //Un arreglo de 10 enteros
        
        //ACCEDER A LOS DATOS
        //A traves de indices
        //Conocer las posiciones de los valores :
        //PRIMEA POSICION EN UN ARREGLO ES CERO --> 0
        //ULTIMA POSICIÓN EN UNA ARREGLO ES --> N-1, DONDE
        //N es el tamaño del arreglo
        
        arreglo[1] = 100;
        System.out.println("Valor de arreglo[1] = "+ arreglo[1]);
        System.out.println(arreglo);
        System.out.println(arreglo.length); //En el arreglo: Cuanto puede almacenar el arreglo
    }
    
}

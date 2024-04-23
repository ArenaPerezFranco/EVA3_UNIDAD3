
package eva3_3_indice_erroneo;

/**
 *
 * @author leaha
 */
public class EVA3_3_INDICE_ERRONEO {

    
    public static void main(String[] args) {
        int datos[] = new int[10];
        datos[10] = 100;//Index 10 out of bounds for length 10 --> Posicion 10 no existe
         //ERROR EN TIEMPO DE EJECUCIÓN
        System.out.println("El valor en datos[10] = "+ datos[10]);
        
    }
    
}

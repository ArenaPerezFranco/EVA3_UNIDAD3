
package eva3_5_propiedades_arreglos;

/**
 *
 * @author leaha
 */
public class EVA3_5_PROPIEDADES_ARREGLOS {

    
    public static void main(String[] args) {
        int arreglo[] = new int[3];
        arreglo[0] = 100;
        arreglo[1] = 200;
        arreglo[2] = 300;
        System.out.println(arreglo);
        
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("[" + arreglo[i] + "]");
        }
        //------------
        arreglo = new int[5];
        arreglo[0] = 100;
        arreglo[1] = 200;
        arreglo[2] = 300;
        
        System.out.println("");
        System.out.println(arreglo);
        System.out.println("DESPUES DEL CAMBIO DE TAMAÑO");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("[" + arreglo[i] + "]");
         
    }
    
}
}

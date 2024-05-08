
package eva3_16_metodos_arreglos;

/**
 *
 * @author leaha
 */
public class EVA3_16_METODOS_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { //ARREGLOS
        
        int[] datos = new int[10];
        datos = llenar(datos); //Aquiere los valores de datos
        imprimir(datos);
        
        System.out.println("");
        
        int[] datos2 = new int[15];       
        datos2 = llenar(datos2);
        imprimir(datos2); //Imprime valores del arreglo Datos2
    }
    
    public static void imprimir(int[] arreglo){ //Imprime los arreglos
        
        for (int i = 0; i < arreglo.length; i++) { 
            System.out.print("[" + arreglo[i] + "]");
            
        }
        System.out.println("");
    }
    public static int[] llenar(int[] arreglo){ //Da valores distintos
        
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = (int)(Math.random () * 100);
    
        }
        return arreglo;
        
}
}
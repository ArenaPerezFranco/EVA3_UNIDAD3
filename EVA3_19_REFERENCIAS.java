
package eva3_19_referencias;

/**
 *
 * @author leaha
 */
public class EVA3_19_REFERENCIAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arreglo = new int[5];
        int x = 100;
        System.out.println("Antes de llamr al método. x = " + x);
        //---------------------------------
        sumarUno(x);
        System.out.println("Después de llamar al método. x = " + x); //..Pero no cambia al original
        System.out.println("---------------------");
        
        //DE TENER 0..
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("["+ arreglo[i]+"]");
        }
        System.out.println("");
        //A TENER NUMEROS ALEATORIOS
        modificarArreglo(arreglo); //Llamada al método
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("["+ arreglo[i]+"]");
        }
    }
    public static void sumarUno(int valor ){  //MODIFICA LA COPIA QUE RECIBIO..
        System.out.println("Antes de la operación. valor: " + valor);
        valor ++;
        System.out.println("Después de la operación. Valor: " + valor);
    
    }
    public static void modificarArreglo(int[] arreglo){//Recibe la dirección de la variable
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = (int)(Math.random() * 100);
        }
    
    }
}


package eva3_2_arreglos_2;

/**
 *
 * @author leaha
 */
public class EVA3_2_ARREGLOS_2 {

    
    public static void main(String[] args) {
        
        //JAVA: 0 primer elemento
        //         N - 1 Último elemento
        //N --> TOTAL DE ELEMENTOS ALMACENADOS EN EL ARREGLO
        //Segun su lenguaje cambia de arreglo
        
        //Crear un arreglo y llenarlo de valores aleatorios
        // int datos[], x, y; --> SOLO datos ES UN ARREGLO por los []
        //int [] datos, x, y; --> Todas las variables son un ARREGLO
        int datos[] = new int[10];
        
        //Asignar valores aleatorios entre 0 y 99, (1 - 100)
        //datos.lenght --> Automaticamente el datos del arreglo
        for (int i = 0; i < datos.length; i++) { //diseñada para moverse en un arreglo, i--> INDICE
            datos[i] = (int)(Math.random() * 100); //Para que lleguen a numeros entre 0 a 99
            //El int le quita lo decimal, convirtiendola en entero
            
        }
        //Imprimir los elementos del arreglo:
         for (int i = 0; i < datos.length; i++) { //diseñada para moverse en un arreglo, i--> INDICE
            datos[i] = (int)(Math.random() * 100);
            System.out.print("[" + datos[i] + "]");
         }
    }
}


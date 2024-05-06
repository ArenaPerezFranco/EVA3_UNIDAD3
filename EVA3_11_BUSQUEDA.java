
package eva3_11_busqueda;

import java.util.Scanner;

/**
 *
 * @author leaha
 */
public class EVA3_11_BUSQUEDA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Crear un arreglo
        //Llenarlo con valores aleatorios
        //Imprimirlo
        //Preguntar al usuario el valor que busca
        
        int pos = -1; //UNA POSICIÓN que no existe
        int val;
        int num[] = new int[10];
        Scanner captu = new Scanner(System.in);
        
        
        for (int i = 0; i < num.length; i++) {
            num[i] = (int)(Math.random() * 100);
            System.out.print(i + "-");
        }
        System.out.println();
        
        System.out.println("¿Cuál es el valor que buscas?");
        val = captu.nextInt();
        
        //BUSQUEDA
        //Recorrer el arreglo (ciclo for)
        //COMPARAR el valor que busco con el valor en el arreglo (IF)
        //DETENERME si lo encuentro, SI NO, seguir buscando
        //Regresar el resultado: Puede ser las posición o verdadero (SI lo encuentra) o falso (NO lo encuentran)
        
        for (int i = 0; i == num.length; i++) {
            if (val == num[i] ) { //I == posiciones --> num == Numeros que se encunetran en el arreglo
                pos = i; //Almaceno la posición donde esta el valor
                
                break;
      
            }
        }
        
        System.out.println("Posición = " + pos);
    }
    
}

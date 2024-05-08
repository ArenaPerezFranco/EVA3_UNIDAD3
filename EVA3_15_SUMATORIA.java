
package eva3_15_.sumatoria;

import java.util.Scanner;

/**
 *
 * @author leaha
 */
public class EVA3_15_SUMATORIA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner captu = new Scanner(System.in);
        System.out.println("num: ");
        int num = captu.nextInt();
        
        int suma = calcularSuma(num);
        System.out.println("El resultado es = " + suma);
    }
    public static int calcularSuma(int num) {
    
        //Acumulador
        int suma = 0;
        for (int i = 1; i <= num; i++) {
            
            suma = suma + i;
        }
        return suma;
    }
}


package eva3_14_return_2;

import java.util.Scanner;

/**
 *
 * @author leaha
 */
public class EVA3_14_RETURN_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner captu = new Scanner(System.in);
        System.out.println("Base: ");
        int base = captu.nextInt();
         System.out.println("Potencia: ");
        int pot = captu.nextInt();
        
        //CALCULAR POTENCIA
        int resu = calcularPot(base,pot);
        System.out.println("El resultado es = " + resu);
    }
    //Crear una función que calculoe la potencia de un valor entero
    public static int calcularPot(int base, int potencia){
        //Se necesita un ACUMULADOR
        // i = suma * valor;
        //suma *= valor;
        int resu = 1;
        //Muy similar a una sumatoria
        for (int i = 0; i < potencia; i++) {
            
            resu = resu * base;
        }
    return resu;
    }
    
}

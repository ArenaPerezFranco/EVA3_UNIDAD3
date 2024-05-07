
package eva3_13_return;

import java.util.Scanner;

/**
 *
 * @author leaha
 */
public class EVA3_13_RETURN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner captu = new Scanner(System.in);
        System.out.println("Valor 1: ");
        int val1 = captu.nextInt();
         System.out.println("Valor 2: ");
        int val2 = captu.nextInt();
        
        //LLAMAR A LA FUNCIÓN
        
        //1. Guardar el resultado: Conveniente si usamos el resultado muchas veces
        int resu = sumar(val1, val2);
        System.out.println("la suma = " + resu);
        
        //2.Usar directamente el resultado de la función: Cuando solo usan el resultado una vez
        System.out.println("La suma = " + sumar(val1,val2));
        
        //3. Ignorar el resultado: 
        sumar(val1,val2);
    }
    //Metodos regresen a un valor
    public static int sumar(int num1, int num2){
    int resu = num1 + num2;
    return resu; //Es como un break
                 //Ultima instrucción del metodo
    
    }
}

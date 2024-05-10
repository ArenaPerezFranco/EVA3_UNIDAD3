
package eva3_17_bisiesto;

import java.util.Scanner;

/**
 *
 * @author leaha
 */
public class EVA3_17_BISIESTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int año;
        
        Scanner captu = new Scanner (System.in);
        System.out.println("Introduce el año: ");
        año = captu.nextInt();
        
        boolean resu = Bisiesto(año);
        
        if (resu)
            System.out.println("El año " + año + " es bisiesto : " + resu);
        else
            System.out.println("El año " + año + " no es bisiesto : " + resu);
        
    }
    public static boolean Bisiesto(int año){
        boolean bis = false;
        
        if (año %100 !=0){
            if(año %4 ==0)
               bis = true;
        
        }else if (año % 400 == 0){
            bis = true;
        } 
    
    return bis;
    
    }
}

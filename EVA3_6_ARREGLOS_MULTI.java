
package eva3_5_arreglos_.multi;

/**
 *
 * @author leaha
 */
public class EVA3_5_ARREGLOS_MULTI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int matriz [][]= new int[3][2];
        matriz[0][0] = 100;
        matriz[0][1] = 400;
        matriz[1][0] = 200;
        matriz[1][1] = 500;
        matriz[2][0] = 300;
        matriz[2][1] = 600;
        //--------------------
        System.out.println("matriz.length = " + matriz.length);
        
        //Voy a recorrer la primera dimensión
        for (int i = 0; i < matriz.length; i++) { //Controla las filas, i 0,1,2
            for (int j = 0; j <matriz[i].length; j++) { //Controla las columnas
                System.out.println("Matriz[" + i + "][" + j + "]" + matriz[i][j]);
                
            }
        }
    }
    
}

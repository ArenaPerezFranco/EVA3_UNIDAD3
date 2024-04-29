
package eva3_8_5d;

/**
 *
 * @author leaha
 */
public class EVA3_8_5D {

    
    public static void main(String[] args) {
        int cincoD [][][][][] = new int[3][5][20][15][25]; 
        
        //DIMENSIONES []--> Primera dimension
        //DIMENSICONES [][] --> Segunda dimesion   
        //Mientras mas dimensiones, mas corchetes
        
        for (int i = 0; i < cincoD.length; i++) {
            for (int j = 0; j < cincoD[i].length; j++) {
                for (int k = 0; k < cincoD[i][j].length; k++) { 
                    for (int l = 0; l < cincoD[i][j][k].length; l++) {
                        for (int m = 0; m <cincoD[i][j][k][l].length; m++) {
                            cincoD[i][j][k][l][m] = (int) (Math.random() * 100);
                                
                        }
                        
                    }
                }
                
            }
            
        }
     for (int i = 0; i < cincoD.length; i++) {
            for (int j = 0; j < cincoD[i].length; j++) {
                for (int k = 0; k < cincoD[i][j].length; k++) { 
                    for (int l = 0; l < cincoD[i][j][k].length; l++) {
                        for (int m = 0; m <cincoD[i][j][k][l].length; m++) {
                            System.out.println("[" + cincoD[i][j][k][l][m] + "]");
            }
            
        }
                }
            }
     }
    }
}


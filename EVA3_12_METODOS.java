
package eva3_12_metodos;

/**
 *
 * @author leaha
 */
public class EVA3_12_METODOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { //Main es un metodo
        //Invocar método --> llamada --> call
        mostrarMensaje("Hola mundo!!");
        System.out.println("");
        mostrarMuchosMensajes("Hola!!", 5);
    }
    // public static --> para la materia de POO
    //void --> (Tipo de dato) valor que regresa el método
    //void --> no regresa nada
    //nombre del metodo -> identificador válido
    //                     empezar en minúsculas, DEBE SER UN VERBO.
    //()<-- Parámetros  del método (argumentos) --> valores que necesita para funcionar. (args) = Arreglo String
    
    public static void mostrarMensaje(String abba) {//Encabezado(nombre del método)
    //CUERPO DEL MÉTODO: Aqui va el código
        System.out.println(abba);
        
    }
    
    public static void mostrarMuchosMensajes(String mensaje, int veces){
        
        for (int i = 0; i < veces; i++) {
            System.out.println(mensaje);
            
        }
    
    
    }
}
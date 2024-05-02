
package eva3_9_arreglos;

/**
 *
 * @author leaha
 */
public class EVA3_9_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                            //    0         1       2          3           4         5         6 
        String diaSemana[] = {"Domingo", "Lunes","Martes", "Miercoles", "Jueves","Viernes", "Sabado"};
        char vocales[] = {'a','e','i','o','u'};
        
        
        System.out.println("Tamaño del arreglo dias Semana = " + diaSemana.length);
        System.out.println("Tamaño del arreglo vocales = " + vocales.length);
        System.out.println();
        
        for (int i = 0; i < diaSemana.length; i++) {
            System.out.println(diaSemana[i]);
        }
        System.out.println();
        for (int i = 0; i < vocales.length; i++) {
            System.out.print(vocales[i]);
        }
        String menu[] = {"Archivo", "Nueva Factura", "Modificar", "Salir"};
        for (int i = 0; i < menu.length; i++) {
            System.out.println(i+" - " + menu[i]);
        }
         
    }
    
}

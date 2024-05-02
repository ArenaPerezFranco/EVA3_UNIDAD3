
package eva3_10foreach;

/**
 *
 * @author leaha
 */
public class EVA3_10ForEach {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String diasSemana[] = {"Donmigo","Lunes","Martes","Miercoles", "Jueves", "Viernes", "Sabado"};
        
        //Mas facil, pero no hay posiciones en el FOR EACH
        
        for (String dia : diasSemana) {
            System.out.println(dia);
        }
        System.out.println();
        
        int salario[] = {50, 10, 234, 1234, 11111, 345, 267};
        
        for (int cant : salario) {
            System.out.println("$" + cant);
        }
        System.out.println();
        
        //MESES DEL AÑO. IMPRIMIR CON FOR EACH
        String meses[] = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre","Octubre","Noviembre","Diciembre"};
                 
               //Variable
        for (String mes : meses) {
            System.out.println(mes);
        }
    }
    
}

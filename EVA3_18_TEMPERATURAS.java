
package eva3_18_temperaturas;

import java.util.Scanner;

/**
 *
 * @author leaha
 */
public class EVA3_18_TEMPERATURAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //CONVERTIR GRADOS A OTROS GRADOS
        //C -->F     C --> K      F --> C    K --> F   F --> K 
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Qué tipo de conversión deseas realizar?");
        
        System.out.println("1. Celsius a Fahrenheit");
        System.out.println("2. Celsius a Kelvin");
        System.out.println("3. Fahrenheit a Celsius");
        System.out.println("4. Kelvin a Fahrenheit");
        System.out.println("5. Fahrenheit a Kelvin");
        
        int opcion = scanner.nextInt();
        double temperatura;
        
        switch (opcion) {
            case 1:
                System.out.println("Ingresa la temperatura en grados Celsius:");
                temperatura = scanner.nextDouble();
                System.out.println(temperatura + " grados Celsius son " + CelsiusFahrenheit(temperatura) + " grados Fahrenheit.");
                break;
            case 2:
                System.out.println("Ingresa la temperatura en grados Celsius:");
                temperatura = scanner.nextDouble();
                System.out.println(temperatura + " grados Celsius son " + celsiusKelvin(temperatura) + " grados Kelvin.");
                break;
            case 3:
                System.out.println("Ingresa la temperatura en grados Fahrenheit:");
                temperatura = scanner.nextDouble();
                System.out.println(temperatura + " grados Fahrenheit son " + fahrenheitCelsius(temperatura) + " grados Celsius.");
                break;
            case 4:
                System.out.println("Ingresa la temperatura en grados Fahrenheit:");
                temperatura = scanner.nextDouble();
                System.out.println(temperatura + " grados Kelvin son " + kelvinFahrenheit(temperatura) + " grados Fahrenheit.");
                break;
            case 5:
                System.out.println("Ingresa la temperatura en grados Fahrenheit:");
                temperatura = scanner.nextDouble();
                System.out.println(temperatura + " grados Fahreheit son " + fahrenheitKelvin(temperatura) + " grados Kelvin.");
                break;
     
            default:
                System.out.println("Opción no válida.");
        }
                
    }
    public static double CelsiusFahrenheit (double temp) { //Centigrados a Fahrenheit
            double resu;
            
            resu = (temp *1.8) + 32;
            return resu;
        
        }
    public static double celsiusKelvin(double temp) {
        double resu;
        
        resu = temp + 273.15;
        return resu;
    }

    public static double fahrenheitCelsius(double temp) {
        double resu;
        
        resu = (temp - 32) * 5;
        return resu;
    }
    public static double kelvinFahrenheit(double temp) {
        double resu;
        resu = (temp - 273.15) * 9 / 5 + 32;
        
        return resu;
    }
    public static double fahrenheitKelvin(double temp) {
        double resu;
        resu = (temp - 32) * 5 / 9 + 273.15;
        
        return resu;
    }
}

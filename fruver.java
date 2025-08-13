// ANALISIS
/*
* Descripcion: 
* Entradas: 
* Salidas: 
* Ejemplo: 
*/
import java.util.Scanner;

public class fruver {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); 


        Double cant_bananos, cant_manzanas, valor_bananos, valor_manzanas;

        System.out.println ("Por favor ingrese la cantidad de bananos: ");
        cant_bananos = entrada.nextDouble();
        entrada.nextLine();

        System.out.println("Ingrese el precio por unidad de banano: ");
        valor_bananos = entrada.nextDouble(); 

        System.out.println("El valor de compra de bananos es: " + multiplicarbananos(cant_bananos,valor_bananos));  
    


        System.out.println ("Por ingrese la cantidad de manzanas: ");
        cant_manzanas = entrada.nextDouble();
        entrada.nextLine();

        System.out.println("Ingrese el precio por unidad de manzana: ");
        valor_manzanas = entrada.nextDouble();

        System.out.println("El valor de compra de manzanas es:" + multiplicarmanzanas(cant_manzanas,valor_manzanas)); 
       

       double multiplicar_1 = multiplicarbananos(cant_bananos, valor_bananos);
       double multiplicar_2 = multiplicarmanzanas(cant_manzanas, valor_manzanas);  
    
        System.out.println("El valor total de la compra es: " + sumartodo(multiplicar_1, multiplicar_2));

        System.out.println("Aplicando el descuento del 10% tu valor es: " + sumartodo(multiplicar_1, multiplicar_2)*0.9);

        


      }
    
 
        public static double multiplicarbananos(double cant_bananos, double valor_bananos) {
        double multiplicar_1 = cant_bananos * valor_bananos;
        return multiplicar_1; 
        }
        

        public static double multiplicarmanzanas( double cant_manzanas, double valor_manzanas) {
        double multiplicar_2 = cant_manzanas * valor_manzanas;
        return multiplicar_2; 
        }
        

        public static double sumartodo( double multiplicar_1, double multiplicar_2) {
        double sumartodo = multiplicar_1 + multiplicar_2;
        return sumartodo; 
        }
        




          }




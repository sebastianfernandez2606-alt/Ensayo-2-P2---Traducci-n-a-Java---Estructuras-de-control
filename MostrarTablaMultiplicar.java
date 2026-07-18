package mostrartablamultiplicar;

import java.util.Scanner;


 // @author Jefferson Sebastian Fernandez Criollo

public class MostrarTablaMultiplicar {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int numero; 
       int resultado; 
       
        System.out.println("Ingrese un numero entero: ");
        numero = sc.nextInt();
        
        System.out.println();
        
        for (int i = 1 ; i <= 12; i++){
            resultado = numero * i;
            System.out.println(numero + "x" + i + "=" + resultado);
        }
    }
}

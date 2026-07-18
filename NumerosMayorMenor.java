package numerosmayormenor;

import java.util.Scanner;


 // @author Jefferson Sebastian Fernandez Criollo

public class NumerosMayorMenor {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int numero;
        int mayor;
        int menor;
        
        System.out.println("Ingrese el numero 1: ");
        numero = sc.nextInt();
        
        mayor = numero;
        menor = numero;
        
        for (int i = 2; i <= 10; i++) {
            System.out.println("Ingrese el numero " + i + ": ");
            numero = sc.nextInt();
            
            if (numero > mayor) {
                mayor = numero;
            }
            
            if (numero < menor) {
                menor = numero;
            }
        }
        
        System.out.println();
        System.out.println("Numero mayor: " + mayor);
        System.out.println("Numero menor: " + menor);
    }
}

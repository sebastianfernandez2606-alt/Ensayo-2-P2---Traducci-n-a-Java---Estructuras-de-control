package operacionescalculadora;

import java.util.Scanner;


 // @author Jefferson Sebastian Fernandez Criollo

public class OperacionesCalculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1;
        int num2;
        int suma;
        int resta;
        int multiplicacion;
        double division; 
        int residuo;
        
        System.out.println("Ingrese el primer numero entero: ");
        num1 = sc.nextInt();
        System.out.println("Ingrese el segundo numero entero: ");
        num2 = sc.nextInt();
        
        suma = num1 + num2;
        resta = num1 - num2;
        multiplicacion = num1 * num2;
        division = (double) num1 / num2;
        residuo = num1 % num2;
        
        System.out.println();
        System.out.println("La suma es: " + suma);
        System.out.println("La resta es: " + resta);
        System.out.println("La multiplicacion es: " + multiplicacion);
        System.out.println("La division es: " + division);
        System.out.println("El residuo es: " + residuo);
    }
}
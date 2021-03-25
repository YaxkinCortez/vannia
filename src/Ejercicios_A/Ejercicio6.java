package Ejercicios_A;

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int a, b;
        char c;
        System.out.print("Dame un numero: ");
        a = leer.nextInt();
        System.out.print("Dame un caracter: ");
        c = leer.next().charAt(0);
        System.out.print("Dame un numero: ");
        b = leer.nextInt();

        switch (c) {
            case '+':
                System.out.println("La suma es: " + (a + b));
                break;
            case '-':
                System.out.println("La resta es: " + (a - b));
                break;
            case '*':
                System.out.println("La multiplicacion es: " + (a * b));
                break;
            case '/':
                System.out.println("La division es: " + (a / b));
                break;
        }
    }

}

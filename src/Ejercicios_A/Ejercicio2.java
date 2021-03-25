package Ejercicios_A;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numero, base = 100;
        System.out.print("Dame la cifra de 4 digitos: ");
        numero = leer.nextInt();

        float nd = numero;
        numero /= base;
        nd /= base;
        if (nd - numero > .5) {
            numero++;
            numero *= base;
            System.out.println("el resultado es: " + numero);
        } else if (nd - numero < .5) {
            System.out.println((Math.floor(numero * 100) / 100) * 100);
        }
    }

}

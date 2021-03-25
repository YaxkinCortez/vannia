package Ejercicios_A;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int a, b, c, d, r;
        System.out.print("Dame la primera nota: ");
        a = leer.nextInt();
        System.out.print("Dame la segunda nota: ");
        b = leer.nextInt();
        System.out.print("Dame la tercera nota: ");
        c = leer.nextInt();
        System.out.print("Dame la cuarta nota: ");
        d = leer.nextInt();

        r = (a + b + c + d) / 4;

        if (r >= 90) {
            System.out.println("Su puntuacion A con una media de: " + r);
        } else if (r >= 80) {
            System.out.println("Su puntuacion B con una media de: " + r);
        } else if (r >= 70) {
            System.out.println("Su puntuacion C con una media de: " + r);
        } else if (r >= 60) {
            System.out.println("Su puntuacion D con una media de: " + r);
        } else {
            System.out.println("Su puntuacion E con una media de: " + r);
        }
    }
}

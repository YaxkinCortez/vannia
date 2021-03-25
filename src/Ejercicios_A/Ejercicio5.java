package Ejercicios_A;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double precio, salario, x;
        int horas, extras;
        System.out.print("Cuantas horas trabajo: ");
        horas = leer.nextInt();
        System.out.print("Costo de las horas: ");
        precio = leer.nextDouble();

        if (horas <= 38) {
            salario = precio * horas;
            if (salario <= 10000) {
                System.out.println("el salario es: " + salario);
            } else if (salario > 50000) {
                salario = salario - (salario * 0.10);
                System.out.println("el salario aplicando el impuesto es de: " + salario);
            }
        } else {
            extras = horas - 38;
            x = ((precio * .5) + precio) * extras;
            salario = (precio * 38) + x;
            if (salario <= 10000) {
                System.out.println("el salario es: " + salario);
            } else if (salario > 50000) {
                salario = salario - (salario * 0.10);
                System.out.println("el salario aplicando el impuesto es de: " + salario);
            }
        }
    }

}

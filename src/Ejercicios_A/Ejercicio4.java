package Ejercicios_A;

import java.util.Scanner;

public class Ejercicio4 {

    //meses con 31 dias= enero(1),marzo(3),mayo(5),julio(7),agosto(8),octubre(10),diciembre(12)
    //meses con 30 dias = abril(4),junio(6),septiembre(9),noviembre(11)
    //mes con 28 o 29 dias = febrero(2)
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int mes, a;
        System.out.print("Dame el mes: ");
        mes = leer.nextInt();
        System.out.println("Dame el año: ");
        a = leer.nextInt();

        //comprobamos si es año bisiesto para sumar un dia a febrero 
        if (a % 4 == 0 && a % 100 == 0 && a % 400 == 0) {
            switch (mes) {
                case 1:
                    System.out.println("ENERO 31 DIAS");
                    break;
                case 2:
                    System.out.println("FEBRERO 29 DIAS");
                    break;
                case 3:
                    System.out.println("MARZO 31 DIAS");
                    break;
                case 4:
                    System.out.println("ABRIL 30 DIAS");
                    break;
                case 5:
                    System.out.println("MAYO 31 DIAS");
                    break;
                case 6:
                    System.out.println("JUNIO 30 DIAS");
                    break;
                case 7:
                    System.out.println("JULIO 31 DIAS");
                    break;
                case 8:
                    System.out.println("AGOSTO 31 DIAS");
                    break;
                case 9:
                    System.out.println("SEPTIEMBRE 30 DIAS");
                    break;
                case 10:
                    System.out.println("OCTUBRE 31 DIAS");
                    break;
                case 11:
                    System.out.println("NOVIEMBRE 30 DIAS");
                    break;
                case 12:
                    System.out.println("DICIEMBRE 31 DIAS");
            }
        } else {
            switch (mes) {
                case 1:
                    System.out.println("ENERO 31 DIAS");
                    break;
                case 2:
                    System.out.println("FEBRERO 28 DIAS");
                    break;
                case 3:
                    System.out.println("MARZO 31 DIAS");
                    break;
                case 4:
                    System.out.println("ABRIL 30 DIAS");
                    break;
                case 5:
                    System.out.println("MAYO 31 DIAS");
                    break;
                case 6:
                    System.out.println("JUNIO 30 DIAS");
                    break;
                case 7:
                    System.out.println("JULIO 31 DIAS");
                    break;
                case 8:
                    System.out.println("AGOSTO 31 DIAS");
                    break;
                case 9:
                    System.out.println("SEPTIEMBRE 30 DIAS");
                    break;
                case 10:
                    System.out.println("OCTUBRE 31 DIAS");
                    break;
                case 11:
                    System.out.println("NOVIEMBRE 30 DIAS");
                    break;
                case 12:
                    System.out.println("DICIEMBRE 31 DIAS");
            }
        }
    }

}

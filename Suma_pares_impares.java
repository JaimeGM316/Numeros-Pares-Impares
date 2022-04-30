package Numeros_pares_impares;

import java.util.Scanner;

public class Suma_pares_impares {

    public static void main(String[] args) {

        int cantidad, num, pares = 0, impares = 0;
        System.out.print("Numeros a introducir: ");
        Scanner sc = new Scanner(System.in);
        cantidad = sc.nextInt();

        for (int i = 1; i <= cantidad; i++) {
            System.out.print("Introduce un numero: ");
            num = (new Scanner(System.in)).nextInt();
            if (num % 2 == 0) {
                pares = pares + num;
            } else {
                impares = impares + num;
            }
        }

        System.out.println("Suma pares: " + pares);
        System.out.println("Suma impares: " + impares);
    }
}

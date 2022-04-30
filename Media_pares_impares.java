package Numeros_pares_impares;

import java.util.Scanner;

public class Media_pares_impares {

    public static void main(String[] args) {

        int cantidad, num, pares = 0, impares = 0,cPar = 0, cImpar = 0, mPar = 0, mImpar = 0;
        System.out.print("Numeros a introducir: ");
        Scanner sc = new Scanner(System.in);
        cantidad = sc.nextInt();

        for (int i = 1; i <= cantidad; i++) {
            System.out.print("Introduce un numero: ");
            num = (new Scanner(System.in)).nextInt();
            if (num % 2 == 0) {
                pares = pares + num;
                cPar++;
            } else {
                impares = impares + num;
                cImpar++;
            }
        }
        
        mPar = pares / cPar;
        mImpar = impares / cImpar;

        System.out.println("Suma pares: " + mPar);
        System.out.println("Suma impares: " + mImpar);
    }
}

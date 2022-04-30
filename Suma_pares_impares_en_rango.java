package Numeros_pares_impares;

import java.util.Scanner;

public class Suma_pares_impares_en_rango {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        int par = 0;
        int impar = 0;
        //Se sumarán los números hasta el introducido
        System.out.print("Introduce un numero: ");
        numero = teclado.nextInt();
        
        for (int ind = 1; ind <= numero; ind++) {
            if (ind % 2 == 0) {
                par += ind;
            } else {
                impar += ind;
            }
        }
        
        
        
        System.out.println("Suma pares: " + par);
        System.out.println("Suma impares: " + impar);
    }
}

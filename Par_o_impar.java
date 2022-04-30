package Numeros_pares_impares;

import java.util.Scanner;

public class Par_o_impar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Numero: ");
        int n = Integer.parseInt(sc.nextLine());
        if (n % 2 == 0) {
            System.out.println("Es par");
        } else {
            System.out.println("Es impar");
        }
    }

}

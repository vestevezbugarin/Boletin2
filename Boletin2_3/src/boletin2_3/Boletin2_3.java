package boletin2_3;

import java.util.*;

public class Boletin2_3 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("*******************************************************\n"
                + "|      Contador de billetes e suma de cantidades      |\n"
                + "*******************************************************\n"
                + "|Só billetes de 200, 100, 50, 20 ,10, 5 e moedas de 1€|\n"
                + "*******************************************************");

        System.out.print("\nBilletes insertados de 200: ");
        byte b200 = teclado.nextByte();
        System.out.print("Billetes insertados de 100: ");
        byte b100 = teclado.nextByte();
        System.out.print("Billetes insertados de  50: ");
        byte b50 = teclado.nextByte();
        System.out.print("Billetes insertados de  20: ");
        byte b20 = teclado.nextByte();
        System.out.print("Billetes insertados de  10: ");
        byte b10 = teclado.nextByte();
        System.out.print("Billetes insertados de   5: ");
        byte b5 = teclado.nextByte();
        System.out.print("\nMoedas insertadas de    1€: ");
        byte m1 = teclado.nextByte();

        int total = (b200 * 200) + (b100 * 100) + (b50 * 50) + (b20 * 20) + (b10 * 10) + (b5 * 5) + (m1 * 1);

        System.out.println("\n******************************************************************\n"
                + "* Introducironse " + (b200 + b100 + b50 + b20 + b10 + b5) + " billetes e " + m1 + " moedas."
                + "\n* Cantidade total:  " + total + "€"
                + "\n******************************************************************");

    }

}

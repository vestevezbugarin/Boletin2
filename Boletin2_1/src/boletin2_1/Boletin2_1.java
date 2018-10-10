package boletin2_1;

import java.util.*;

public class Boletin2_1 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        boolean validar;
        float pvpPagado, pvpReal;

        System.out.println("****************************************************\n"
                + "|           Calcular desconto aplicado             |\n"
                + "****************************************************");
        do {
            System.out.print("Introduza o prezo que pagou pola compra: ");
            pvpPagado = teclado.nextFloat();
            if (pvpPagado < 0) {
                System.out.println("A cantidade pagada non pode ser negativa.");
                validar = false;
            } else {
                validar = true;
            }

        } while (validar == false);

        do {
            System.out.print("\nIntroduza o prezo real do computo: ");
            pvpReal = teclado.nextFloat();

            if (pvpPagado <= 0) {
                System.out.println("O prezo non pode ser negativo ou cero.");
                validar = false;
            } else {
                validar = true;
            }

        } while (validar == false);

        System.out.println("****************************************************\n"
                         + "A sua compra aplicouselle un desconto do: " + (pvpReal - pvpPagado)/pvpReal *100 + " %.");

    }

}

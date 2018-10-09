package boletin2_5;

import java.util.*;

public class Boletin2_5 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        float soldo, ventas, km, bruto, liquido;
        byte dias;

        System.out.print("\n**************************************************"
                + "\n|               Calculadora de soldo             |"
                + "\n**************************************************");
        System.out.print("\n| Introduce o teu soldo fixo                     |\n|");
        soldo = teclado.nextFloat();

        System.out.print("**************************************************"
                + "\n| Introduce importe total de ventas              |\n|");
        ventas = teclado.nextFloat();
        System.out.print("**************************************************"
                + "\n| Introduce os Km percorridos                    |\n|");
        km = teclado.nextFloat();
        System.out.print("**************************************************"
                + "\n| Introduce os días que te desprazaches          |\n|");
        dias = teclado.nextByte();

        bruto = soldo + (0.5f * ventas) + (2 * km) + (30 * dias);
        liquido = bruto - (0.18f * bruto) - 36;

        System.out.print("\n**************************************************"
                + "\n**************************************************"
                + "\n|               Soldo Total                      |"
                + "\n**************************************************"
                + "\n| Soldo Total   Bruto :" + bruto
                + "\n**************************************************"
                + "\n| Soldo Total Líquido :" + liquido
                + "\n**************************************************\n");

    }

}

package boletin2_4;

import java.util.*;

public class Boletin2_4 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        byte b500 = 0, b200 = 0, b100 = 0, b50 = 0, b20 = 0, b10 = 0, b5 = 0;

        System.out.println("*******************************************************\n"
                + "|               Desglosador de cantidades             |\n"
                + "*******************************************************\n"
                + "|      Só billetes de  100, 20, 5 e moedas de 1€      |\n"
                + "*******************************************************");

        System.out.println("Inserte a cantidade que desexe desglosar en billetes: ");
        int cantidade = teclado.nextInt();
        int x = cantidade;

        while (x > 500) {
            x -= 500;
            b500++;
        }
        while (x > 200) {
            x -= 200;
            b200++;
        }
        while (x > 100) {
            x -= 100;
            b100++;
        }
        while (x > 50) {
            x -= 50;
            b50++;
        }
        while (x > 20) {
            x -= 20;
            b20++;
        }
        while (x > 10) {
            x -= 10;
            b10++;
        }
        while (x > 5) {
            x -= 5;
            b5++;
        }

        System.out.println("\n****************************************************"
                + "\n*      Cantidade introducida: " + cantidade + "€                *"
                + "\n****************************************************"
                + "\n* Billetes de 500€ = " + b500
                + "\n* Billetes de 200€ = " + b200
                + "\n* Billetes de 100€ = " + b100
                + "\n* Billetes de  20€ = " + b20
                + "\n* Billetes de  10€ = " + b10
                + "\n* Billetes de   5€ = " + b5
                + "\n* Moedas de     1€ = " + x
                + "\n****************************************************");

    }

}

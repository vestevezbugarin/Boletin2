package boletin2_2;

import java.util.*;

public class Boletin2_2 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        float celsius, kelvin, fahre;

        System.out.println("****************************************************\n"
                + "|      Calculo de Temperaturas: ºC - ºK - ºF       |\n"
                + "****************************************************\n"
                + "|             1ºC = 274,15 ºK = 33,8ºF             |\n"
                + "****************************************************");

        System.out.print("Introduce a temperatura a converten en ºC: ");
        celsius = teclado.nextInt();

        kelvin = celsius + 273.15f;

        fahre = (celsius * 9f / 5f) + 32f;

        System.out.println("****************************************************\n"
                + "*   " + celsius + "   ºC    |   " + kelvin + " ºK    |   " + fahre + "   ºF     *\n"
                + "****************************************************\n");
    }

}

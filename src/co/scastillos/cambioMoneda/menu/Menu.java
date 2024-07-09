package co.scastillos.cambioMoneda.menu;

import co.scastillos.cambioMoneda.conversor.Conversor;

import java.io.IOException;
import java.util.Scanner;

public class Menu {

    public static void menu() throws IOException, InterruptedException {

        Scanner teclado = new Scanner(System.in);

        int opcion;

        double cantidad;

        while(true){

            System.out.println("Conversor de Divisas escoja una opcion");

            System.out.println("""
                    1. Dolar =>> Peso Argentino
                    2. Peso Atgentino =>> Dolar
                    3. Dolar =>> Real Brasileño
                    4. Real Brasileño =>> Dolar
                    5. Dolar =>> Peso Colombiano
                    6. Peso Colombiano =>> Dolar
                    7. Salir.
                    """);

            opcion = teclado.nextInt();

            switch (opcion){

                case 1:
                    System.out.println("cuanto desea convertir");
                    cantidad = teclado.nextInt();
                    System.out.println(Conversor.convertir("USD","ARS",cantidad));
                    break;

                case 2:
                    System.out.println("cuanto desea convertir");
                    cantidad = teclado.nextInt();
                    System.out.println(Conversor.convertir("ARS","USD",cantidad));
                    break;

                case 3:
                    System.out.println("cuanto desea convertir");
                    cantidad = teclado.nextInt();
                    System.out.println(Conversor.convertir("USD","BRL",cantidad));
                    break;

                case 4:
                    System.out.println("cuanto desea convertir");
                    cantidad = teclado.nextInt();
                    System.out.println(Conversor.convertir("BRL","USD",cantidad));
                    break;

                case 5:
                    System.out.println("cuanto desea convertir");
                    cantidad = teclado.nextInt();
                    System.out.println(Conversor.convertir("USD","COP",cantidad));
                    break;
                case 6:
                    System.out.println("cuanto desea convertir");
                    cantidad = teclado.nextInt();
                    System.out.println(Conversor.convertir("COP","USD",cantidad));
                    break;
                case 7:
                    System.out.println("Saliendo.......");
                    return;


            }

        }

    }

}

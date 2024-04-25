package aplicaciones;

import Modelo.Moneda;
import texto.Texto;

import java.io.IOException;
import java.util.Scanner;

public class Menu {
    Texto texto = new Texto();
    Scanner scanner = new Scanner(System.in);

    public void menu() throws IOException, InterruptedException {
        String monedaInicial;
        Moneda moneda;
        int cambioMoneda;
        ConexionAPI conexionAPI = new ConexionAPI();
        int seleccion;

        do {
            seleccion = texto.monedaOrigen();

            switch (seleccion) {
                case 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 -> {
                    monedaInicial = obtenerMonedaInicial(seleccion);
                    moneda = conexionAPI.conexion(monedaInicial);
                    cambioMoneda = texto.monedaCambio();
                    menuCambioMoneda(cambioMoneda, moneda, monedaInicial);
                }
                case 0 -> System.out.println("Gracias por usar la app");
                default -> System.out.println("Opción no válida");
            }
        } while (seleccion != 0);
    }

    private String obtenerMonedaInicial(int seleccion) {
        switch (seleccion) {
            case 1 -> {
                return "MXN";
            }
            case 2 -> {
                return "USD";
            }
            case 3 -> {
                return "BWP";
            }
            case 4 -> {
                return "DOP";
            }
            case 5 -> {
                return "IQD";
            }
            case 6 -> {
                return "UZS";
            }
            case 7 -> {
                return "SOS";
            }
            case 8 -> {
                return "RWF";
            }
            case 9 -> {
                return "JPY";
            }
            case 10 -> {
                return "BHD";
            }
            default -> throw new IllegalArgumentException("Moneda no válida");
        }
    }

    private void menuCambioMoneda(int cambioMoneda, Moneda moneda, String monedaInicial) {
        double total;
        double cantidad;
        switch (cambioMoneda) {
            case 1 -> {
                cantidad = texto.cantidadParaCambiar();
                total = cantidad * moneda.getMxn();
                System.out.println("Su cantidad de " + cantidad + " " + monedaInicial + " es de >>>>>>" + total + " MXN Peso Mexicano ");
            }
            case 2 -> {
                cantidad = texto.cantidadParaCambiar();
                total = cantidad * moneda.getUsd();
                System.out.println("Su cantidad de " + cantidad + " " + monedaInicial + " es de >>>>>>" + total + " USD Dolar Estadounidense");
            }
            case 3 -> {
                cantidad = texto.cantidadParaCambiar();
                total = cantidad * moneda.getBwp();
                System.out.println("Su cantidad de " + cantidad + " " + monedaInicial + " es de >>>>>>" + total + " BWP Paula ");
            }
            case 4 -> {
                cantidad = texto.cantidadParaCambiar();
                total = cantidad * moneda.getDop();
                System.out.println("Su cantidad de " + cantidad + " " + monedaInicial + " es de >>>>>>" + total + " DOP Peso Dominicano ");
            }
            case 5 -> {
                cantidad = texto.cantidadParaCambiar();
                total = cantidad * moneda.getIqd();
                System.out.println("Su cantidad de " + cantidad + " " + monedaInicial + " es de >>>>>>" + total + " IQD Dinar Iraqui ");
            }
            case 6 -> {
                cantidad = texto.cantidadParaCambiar();
                total = cantidad * moneda.getUzs();
                System.out.println("Su cantidad de " + cantidad + " " + monedaInicial + " es de >>>>>>" + total + " UZS Som Uzbeko ");
            }
            case 7 -> {
                cantidad = texto.cantidadParaCambiar();
                total = cantidad * moneda.getSos();
                System.out.println("Su cantidad de " + cantidad + " " + monedaInicial + " es de >>>>>>" + total + " SOS Chelin Somali ");
            }
            case 8 -> {
                cantidad = texto.cantidadParaCambiar();
                total = cantidad * moneda.getRwf();
                System.out.println("Su cantidad de " + cantidad + " " + monedaInicial + " es de >>>>>>" + total + " RWF Franco Ruandes ");
            }
            case 9 -> {
                cantidad = texto.cantidadParaCambiar();
                total = cantidad * moneda.getJpy();
                System.out.println("Su cantidad de " + cantidad + " " + monedaInicial + " es de >>>>>>" + total + " JPY Yen Japones ");
            }
            case 10 -> {
                cantidad = texto.cantidadParaCambiar();
                total = cantidad * moneda.getBhd();
                System.out.println("Su cantidad de " + cantidad + " " + monedaInicial + " es de >>>>>>" + total + " BHD Dinar Bareini ");
            }
            default -> System.out.println("Opción no válida");
        }
        System.out.println("Presiona enter para continuar...");
        scanner.nextLine();
    }
}

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

            switch (seleccion){
                case 1:
                    monedaInicial = "MXN";
                    moneda = conexionAPI.conexion(monedaInicial);
                    cambioMoneda = texto.monedaCambio();
                    menuCambioMoneda(cambioMoneda, moneda, monedaInicial);
                    break;
                case 2:
                    monedaInicial = "USD";
                    moneda = conexionAPI.conexion(monedaInicial);
                    cambioMoneda = texto.monedaCambio();
                    menuCambioMoneda(cambioMoneda, moneda, monedaInicial);
                    break;
                case 3:
                    monedaInicial = "BWP";
                    moneda = conexionAPI.conexion(monedaInicial);
                    cambioMoneda = texto.monedaCambio();
                    menuCambioMoneda(cambioMoneda, moneda, monedaInicial);
                    break;
                case 4:
                    monedaInicial = "DOP";
                    moneda = conexionAPI.conexion(monedaInicial);
                    cambioMoneda = texto.monedaCambio();
                    menuCambioMoneda(cambioMoneda, moneda, monedaInicial);
                    break;
                case 5:
                    monedaInicial = "IQD";
                    moneda = conexionAPI.conexion(monedaInicial);
                    cambioMoneda = texto.monedaCambio();
                    menuCambioMoneda(cambioMoneda, moneda, monedaInicial);
                    break;
                case 6:
                    monedaInicial = "UZS";
                    moneda = conexionAPI.conexion(monedaInicial);
                    cambioMoneda = texto.monedaCambio();
                    menuCambioMoneda(cambioMoneda, moneda, monedaInicial);
                    break;
                case 7:
                    monedaInicial = "SOS";
                    moneda = conexionAPI.conexion(monedaInicial);
                    cambioMoneda = texto.monedaCambio();
                    menuCambioMoneda(cambioMoneda, moneda, monedaInicial);
                    break;
                case 8:
                    monedaInicial = "RWF";
                    moneda = conexionAPI.conexion(monedaInicial);
                    cambioMoneda = texto.monedaCambio();
                    menuCambioMoneda(cambioMoneda, moneda, monedaInicial);
                    break;
                case 9:
                    monedaInicial = "JPY";
                    moneda = conexionAPI.conexion(monedaInicial);
                    cambioMoneda = texto.monedaCambio();
                    menuCambioMoneda(cambioMoneda, moneda, monedaInicial);
                    break;
                case 10:
                    monedaInicial = "BHD";
                    moneda = conexionAPI.conexion(monedaInicial);
                    cambioMoneda = texto.monedaCambio();
                    menuCambioMoneda(cambioMoneda, moneda, monedaInicial);
                    break;
                case 0:
                    System.out.println("Gracias por usar la app");
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        }while (seleccion != 0);



    }

    private void menuCambioMoneda (int cambioMoneda, Moneda moneda, String monedaInicial){
        double total;
        double cantidad;
        switch (cambioMoneda){
            case 1:
                cantidad = texto.cantidadParaCambiar();
                total = cantidad * moneda.getMxn();
                System.out.println("Su cantidad de "+ cantidad + " " + monedaInicial + " es de >>>>>>" + total + " MXN Peso Mexicano ");
                break;
            case 2:
                cantidad = texto.cantidadParaCambiar();
                total = cantidad * moneda.getUsd();
                System.out.println("Su cantidad de "+ cantidad + " " + monedaInicial + " es de >>>>>>" + total + " USD Dolar Estadounidense");
                break;
            case 3:
                cantidad = texto.cantidadParaCambiar();
                total = cantidad * moneda.getBwp();
                System.out.println("Su cantidad de "+ cantidad + " " + monedaInicial + " es de >>>>>>" + total + " BWP Paula ");
                break;
            case 4:
                cantidad = texto.cantidadParaCambiar();
                total = cantidad * moneda.getDop();
                System.out.println("Su cantidad de "+ cantidad + " " + monedaInicial + " es de >>>>>>" + total + " DOP Peso Dominicano ");
                break;
            case 5:
                cantidad = texto.cantidadParaCambiar();
                total = cantidad * moneda.getIqd();
                System.out.println("Su cantidad de "+ cantidad + " " + monedaInicial + " es de >>>>>>" + total + " IQD Dinar Iraqui ");
                break;
            case 6:
                cantidad = texto.cantidadParaCambiar();
                total = cantidad * moneda.getUzs();
                System.out.println("Su cantidad de "+ cantidad + " " + monedaInicial + " es de >>>>>>" + total + " UZS Som Uzbeko ");
                break;
            case 7:
                cantidad = texto.cantidadParaCambiar();
                total = cantidad * moneda.getSos();
                System.out.println("Su cantidad de "+ cantidad + " " + monedaInicial + " es de >>>>>>" + total + " SOS Chelin Somali ");
                break;
            case 8:
                cantidad = texto.cantidadParaCambiar();
                total = cantidad * moneda.getRwf();
                System.out.println("Su cantidad de "+ cantidad + " " + monedaInicial + " es de >>>>>>" + total + " RWF Franco Ruandes ");
                break;
            case 9:
                cantidad = texto.cantidadParaCambiar();
                total = cantidad * moneda.getJpy();
                System.out.println("Su cantidad de "+ cantidad + " " + monedaInicial + " es de >>>>>>" + total + " JPY Yen Japones ");
                break;
            case 10:
                cantidad = texto.cantidadParaCambiar();
                total = cantidad * moneda.getBhd();
                System.out.println("Su cantidad de "+ cantidad + " " + monedaInicial + " es de >>>>>>" + total + " BHD Dinar Bareini ");
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }
        System.out.println("Presiona enter para continuar...");
        scanner.nextLine();
    }
}

import java.util.Scanner;

public class Texto {

    Scanner src = new Scanner(System.in);
    private int eleccion;
    private double cnatidad;
    public int monedaOrigen(){
        System.out.println("""
                ********************************************************
                Sea bienvenido/a al conversor de moneda
                Eliga la moneda de origen:
                
                1) "MXN" Peso Mexicano
                2) "USD" Dolar Estadounidense
                3) "BWP" Paula
                4) "DOP" Peso Dominicano
                5) "IQD" Dinar Iraqui
                6) "UZS" Som Uzbeko
                7) "SOS" Chelin Somali
                8) "RWF" Franco Ruandes
                9) "JPY" Yen Japones
                10) "BHD" Dinar Bareini
                0) Salir
                ********************************************************""");

        return eleccion = src.nextInt();
    }

    public int monedaCambio(){
        System.out.println("""
                ********************************************************
                Eliga la moneda de cambio:
                
                1) "MXN" Peso Mexicano
                2) "USD" Dolar Estadounidense
                3) "BWP" Paula
                4) "DOP" Peso Dominicano
                5) "IQD" Dinar Iraqui
                6) "UZS" Som Uzbeko
                7) "SOS" Chelin Somali
                8) "RWF" Franco Ruandes
                9) "JPY" Yen Japones
                10) "BHD" Dinar Bareini
                ********************************************************""");
        return eleccion = src.nextInt();
    }

    public double cantidadParaCambiar(){
        System.out.println("""
                Ingresa la cantidad que deseas cambiar""");
        return cnatidad = src.nextDouble();
    }
}

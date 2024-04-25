import java.util.Scanner;

public class Texto {

    Scanner src = new Scanner(System.in);
    private int eleccion;
    public int monedaOrigen(){
        System.out.println("""
                ********************************************************
                Sea bienvenido/a al conversor de moneda
                Eliga la moneda de origen:
                
                1) Peso Mexicano
                2) Dolar Estadounidense
                3) Paula
                4) Peso Dominicano
                5) Dinar Iraqui
                6) Som Uzbeko
                7) Chelin Somali
                8) Franco Ruandes
                9) Yen Japones
                10) Dinar Bareini
                0) Salir
                ********************************************************""");

        return eleccion = src.nextInt();
    }

    public int monedaCambio(){
        System.out.println("""
                ********************************************************
                Eliga la moneda de cambio:
                
                1) Peso Mexicano
                2) Dolar Estadounidense
                3) Paula
                4) Peso Dominicano
                5) Dinar Iraqui
                6) Som Uzbeko
                7) Chelin Somali
                8) Franco Ruandes
                9) Yen Japones
                10) Dinar Bareini
                ********************************************************""");
        return eleccion = src.nextInt();
    }

    public int getEleccion() {
        return eleccion;
    }
}

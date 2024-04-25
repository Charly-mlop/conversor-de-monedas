package Modelo;

import DTO.ConversionRatesDTO;

public class Moneda {
    private final double mxn; //Peso Mexicano
    private final double usd; //Dolar Estadounidense
    private final double bwp; // Paula
    private final double dop; //Peso Dominicano
    private final double iqd; //Dinar Iraqui
    private final double uzs; //Som Uzbeko
    private final double sos; // Chelin Somali
    private final double rwf; //Franco Ruandes
    private final double jpy; //Yen Japones
    private final double bhd; //Dinar Bareini

    public Moneda(ConversionRatesDTO conversionRatesDTO) {
        this.mxn = conversionRatesDTO.MXN();
        this.usd = conversionRatesDTO.USD();
        this.bwp = conversionRatesDTO.BWP();
        this.dop = conversionRatesDTO.DOP();
        this.iqd = conversionRatesDTO.IQD();
        this.uzs = conversionRatesDTO.UZS();
        this.sos = conversionRatesDTO.SOS();
        this.rwf = conversionRatesDTO.RWF();
        this.jpy = conversionRatesDTO.JPY();
        this.bhd = conversionRatesDTO.BHD();
    }

    public double getMxn() {
        return mxn;
    }

    public double getUsd() {
        return usd;
    }

    public double getBwp() {
        return bwp;
    }

    public double getDop() {
        return dop;
    }

    public double getIqd() {
        return iqd;
    }

    public double getUzs() {
        return uzs;
    }

    public double getSos() {
        return sos;
    }

    public double getRwf() {
        return rwf;
    }

    public double getJpy() {
        return jpy;
    }

    public double getBhd() {
        return bhd;
    }
}

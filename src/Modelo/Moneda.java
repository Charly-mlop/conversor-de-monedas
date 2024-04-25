package Modelo;

public class Moneda {
    private double mxn; //Peso Mexicano
    private double usd; //Dolar Estadounidense
    private double bwp; // Paula
    private double dop; //Peso Dominicano
    private double iqd; //Dinar Iraqui
    private double uzs; //Som Uzbeko
    private double sos; // Chelin Somali
    private double rwf; //Franco Ruandes
    private double jpy; //Yen Japones
    private double bhd; //Dinar Bareini

    public Moneda(double mxn, double usd, double bwp, double dop, double iqd, double uzs, double sos, double rwf, double jpy, double bhd) {
        this.mxn = mxn;
        this.usd = usd;
        this.bwp = bwp;
        this.dop = dop;
        this.iqd = iqd;
        this.uzs = uzs;
        this.sos = sos;
        this.rwf = rwf;
        this.jpy = jpy;
        this.bhd = bhd;
    }

    public Moneda() {
    }

    public double getMxn() {
        return mxn;
    }

    public void setMxn(double mxn) {
        this.mxn = mxn;
    }

    public double getUsd() {
        return usd;
    }

    public void setUsd(double usd) {
        this.usd = usd;
    }

    public double getBwp() {
        return bwp;
    }

    public void setBwp(double bwp) {
        this.bwp = bwp;
    }

    public double getDop() {
        return dop;
    }

    public void setDop(double dop) {
        this.dop = dop;
    }

    public double getIqd() {
        return iqd;
    }

    public void setIqd(double iqd) {
        this.iqd = iqd;
    }

    public double getUzs() {
        return uzs;
    }

    public void setUzs(double uzs) {
        this.uzs = uzs;
    }

    public double getSos() {
        return sos;
    }

    public void setSos(double sos) {
        this.sos = sos;
    }

    public double getRwf() {
        return rwf;
    }

    public void setRwf(double rwf) {
        this.rwf = rwf;
    }

    public double getJpy() {
        return jpy;
    }

    public void setJpy(double jpy) {
        this.jpy = jpy;
    }

    public double getBhd() {
        return bhd;
    }

    public void setBhd(double bhd) {
        this.bhd = bhd;
    }

    @Override
    public String toString() {
        return "Moneda{" +
                "mxn=" + mxn +
                ", usd=" + usd +
                ", bwp=" + bwp +
                ", dop=" + dop +
                ", iqd=" + iqd +
                ", uzs=" + uzs +
                ", sos=" + sos +
                ", rwf=" + rwf +
                ", jpy=" + jpy +
                ", bhd=" + bhd +
                '}';
    }
}

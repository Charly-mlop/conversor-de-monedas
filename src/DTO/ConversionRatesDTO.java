package DTO;

//Aquie se encapsula especificamente las monedas que se requieren
public record ConversionRatesDTO(
        double MXN, double USD, double BWP, double DOP, double IQD,
        double UZS, double SOS, double RWF, double JPY, double BHD
) {
    @Override
    public double MXN() {
        return MXN;
    }

    @Override
    public double USD() {
        return USD;
    }

    @Override
    public double BWP() {
        return BWP;
    }

    @Override
    public double DOP() {
        return DOP;
    }

    @Override
    public double IQD() {
        return IQD;
    }

    @Override
    public double UZS() {
        return UZS;
    }

    @Override
    public double SOS() {
        return SOS;
    }

    @Override
    public double RWF() {
        return RWF;
    }

    @Override
    public double JPY() {
        return JPY;
    }

    @Override
    public double BHD() {
        return BHD;
    }

}

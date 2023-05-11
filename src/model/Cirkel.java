package model;

/**
 * @author Vincent Velthuizen <v.r.velthuizen@pl.hanze.nl>
 * Purpose of the program
 */
public class Cirkel {
    private static final int DEFAULT_MIDDELPUNT_X = 0;
    private static final int DEFAULT_MIDDELPUNT_Y = 0;
    private static final String DEFAULT_KLEUR = "paars";
    private static final int DEFAULT_STRAAL = 1;

    public double straal;
    public double middelpuntX;
    public double middelpuntY;
    public String kleur;

    public Cirkel(double straal, double middelpuntX, double middelpuntY, String kleur) {
        this.straal = straal;
        this.middelpuntX = middelpuntX;
        this.middelpuntY = middelpuntY;
        this.kleur = kleur;
    }

    public Cirkel(double straal) {
        this.straal = straal;
        this.middelpuntX = DEFAULT_MIDDELPUNT_X;
        this.middelpuntY = DEFAULT_MIDDELPUNT_Y;
        this.kleur = DEFAULT_KLEUR;
    }

    public Cirkel() { // default constructor
        this.straal = DEFAULT_STRAAL;
        this.middelpuntX = DEFAULT_MIDDELPUNT_X;
        this.middelpuntY = DEFAULT_MIDDELPUNT_Y;
        this.kleur = DEFAULT_KLEUR;
    }

    public double geefOmtrek() {
        return 2 * Math.PI * straal;
    }

    public double geefOppervlak() {
        return Math.PI * straal * straal;
    }

    public static String geefDefinitie() {
        return "Een cirkel is een verzameling punten, die allemaal dezelfde afstand tot een middelpunt hebben.";
    }
}

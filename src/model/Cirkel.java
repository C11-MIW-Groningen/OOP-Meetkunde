package model;

/**
 * @author Vincent Velthuizen <v.r.velthuizen@pl.hanze.nl>
 * Purpose of the program
 */
public class Cirkel extends Figuur {
    private static final double DEFAULT_STRAAL = 1;
    private static final String DEFAULT_KLEUR = "paars";

    private double straal;
    private Punt middelpunt;

    public Cirkel(double straal, Punt middelpunt, String kleur) {
        super(kleur);
        setStraal(straal);
        this.middelpunt = middelpunt;
    }

    public Cirkel(double straal) {
        this(straal, new Punt(), DEFAULT_KLEUR);
    }

    public Cirkel() { // default constructor
        this(DEFAULT_STRAAL);
    }

    public static String geefDefinitie() {
        return "Een cirkel is een verzameling punten, die allemaal dezelfde afstand tot een middelpunt hebben.";
    }

    @Override
    public double geefOmtrek() {
        return 2 * Math.PI * straal;
    }

    @Override
    public double geefOppervlakte() {
        return Math.PI * straal * straal;
    }

    @Override
    public boolean pastInOppervlak(double lengte, double breedte) {
        return straal <= lengte / 2 && straal <= breedte / 2;
    }

    @Override
    public String toString() {
        return String.format("%s\nStraal: %s\nMiddelpunt: %s", super.toString(), this.straal, this.middelpunt);
    }

    public double getStraal() {
        return straal;
    }


    /**
     * Stel een nieuwe straal in voor deze cirkel, de straal moet positief zijn.
     *
     * @param straal De nieuwe straal voor deze cirkel
     */
    public void setStraal(double straal) {
        if (straal <= 0) {
            System.err.printf("De straal moet positief zijn. De straal wordt op %.1f gezet.\n", DEFAULT_STRAAL);
            this.straal = DEFAULT_STRAAL;
        } else {
            this.straal = straal;
        }
    }

    public Punt getMiddelpunt() {
        return middelpunt;
    }
}

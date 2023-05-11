package model;

/**
 * @author Vincent Velthuizen <v.r.velthuizen@pl.hanze.nl>
 * Purpose of the program
 */
public class Cirkel {
    private static final double GRENSWAARDE_GROOT_FIGUUR = 100.0;

    private static final double DEFAULT_STRAAL = 1;
    private static final String DEFAULT_KLEUR = "paars";

    private double straal;
    private Punt middelpunt;
    private String kleur;

    public Cirkel(double straal, Punt middelpunt, String kleur) {
        setStraal(straal);
        this.middelpunt = middelpunt;
        this.kleur = kleur;
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

    public double geefOmtrek() {
        return 2 * Math.PI * straal;
    }


    public double geefOppervlak() {
        return Math.PI * straal * straal;
    }

    public String vertelOverGrootte() {
        if (geefOppervlak() > GRENSWAARDE_GROOT_FIGUUR) {
            return "Ik ben groot!!!";
        } else {
            return "Zij zijn groot en ik ben klein en dat is NIET eerlijk.";
        }
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

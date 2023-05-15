package model;

/**
 * @author Vincent Velthuizen <v.r.velthuizen@pl.hanze.nl>
 * Algemene eigenschappen van een meetkundig figuur
 */
public abstract class Figuur implements Comparable<Figuur>, ToelaatbaarInOppervlak {
    private static final double GRENSWAARDE_GROOT_FIGUUR = 100.0;
    private static final String DEFAULT_KLEUR = "rood";

    private String kleur;

    public Figuur(String kleur) {
        this.kleur = kleur;
    }

    public Figuur() {
        this(DEFAULT_KLEUR);
    }

    public static String geefDefinitie() {
        return "Een figuur is een verzameling punten";
    }

    public abstract double geefOmtrek();
    public abstract double geefOppervlakte();

    public String vertelOverGrootte() {
        if (geefOppervlakte() > GRENSWAARDE_GROOT_FIGUUR) {
            return "Ik ben groot!!!";
        } else {
            return "Zij zijn groot en ik ben klein en dat is NIET eerlijk.";
        }
    }

    @Override
    public int compareTo(Figuur andereFiguur) {
        if (this.geefOppervlakte() > andereFiguur.geefOppervlakte()) {
            return 1;
        } else if (this.geefOppervlakte() < andereFiguur.geefOppervlakte()) {
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return String.format("Kleur: %s\nOmtrek: %.2f\nOppervlakte: %.2f", kleur, geefOmtrek(), geefOppervlakte());
    }

    public String getKleur() {
        return kleur;
    }
}

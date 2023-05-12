package model;

/**
 * @author Vincent Velthuizen <v.r.velthuizen@pl.hanze.nl>
 * Algemene eigenschappen van een meetkundig figuur
 */
public class Figuur {
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

    public double geefOmtrek() {
        return 0.0;
    }

    public double geefOppervlakte() {
        return 0.0;
    }

    public String vertelOverGrootte() {
        if (geefOppervlakte() > GRENSWAARDE_GROOT_FIGUUR) {
            return "Ik ben groot!!!";
        } else {
            return "Zij zijn groot en ik ben klein en dat is NIET eerlijk.";
        }
    }

    public String getKleur() {
        return kleur;
    }
}

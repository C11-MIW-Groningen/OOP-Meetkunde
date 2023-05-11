package model;

/**
 * @author Vincent Velthuizen <v.r.velthuizen@pl.hanze.nl>
 * Bescrhijft een rechthoek
 */
public class Rechthoek {
    private static final double GRENSWAARDE_GROOT_FIGUUR = 100.0;

    private static final int DEFAULT_LENGTE = 2;
    private static final int DEFAULT_BREEDTE = 1;

    private double lengte;
    private double breedte;
    private Punt hoekpuntLinksBoven;
    private String kleur;

    public Rechthoek(double lengte, double breedte, Punt hoekpuntLinksBoven, String kleur) {
        this.lengte = lengte;
        this.breedte = breedte;
        this.hoekpuntLinksBoven = hoekpuntLinksBoven;
        this.kleur = kleur;
    }

    public Rechthoek(double lengte, double breedte) {
        this(lengte, breedte, new Punt(), "papayawhip");
    }

    public Rechthoek() {
        this(DEFAULT_LENGTE, DEFAULT_BREEDTE);
    }

    public static String geefDefinitie() {
        return "Een rechthoek is een vierhoek met vier rechte hoeken.";
    }

    public double geefOmtrek() {
        return 2 * (lengte + breedte);
    }

    public double geefOppervlakte() {
        return lengte * breedte;
    }

    public String vertelOverGrootte() {
        if (geefOppervlakte() > GRENSWAARDE_GROOT_FIGUUR) {
            return "Ik ben groot!!!";
        } else {
            return "Zij zijn groot en ik ben klein en dat is NIET eerlijk.";
        }
    }

    public Punt getHoekpuntLinksBoven() {
        return hoekpuntLinksBoven;
    }
}

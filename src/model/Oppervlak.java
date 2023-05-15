package model;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author Vincent Velthuizen <v.r.velthuizen@pl.hanze.nl>
 * 2d ruimte om figuren op te plaatsen
 */
public class Oppervlak {
    private double lengte;
    private double breedte;
    private ArrayList<Figuur> mijnFiguren;

    public Oppervlak(double lengte, double breedte) {
        this.lengte = lengte;
        this.breedte = breedte;
        mijnFiguren = new ArrayList<>();
    }

    public void voegFiguurToe(Figuur figuur) {
        if (figuur.pastInOppervlak(lengte, breedte)) {
            mijnFiguren.add(figuur);
            System.out.println("Dit figuur is toegevoegd.");
        } else {
            System.out.println("Dit figuur past niet.");
        }

    }

    public ArrayList<Figuur> geefFigurenMetGrotereOppervlakte(double grenswaarde) {
        ArrayList<Figuur> gevraagdeFiguren = new ArrayList<>();

        for (Figuur figuur : mijnFiguren) {
            if (figuur.geefOppervlakte() > grenswaarde) {
                gevraagdeFiguren.add(figuur);
            }
        }

        return gevraagdeFiguren;
    }

    @Override
    public String toString() {
        StringBuilder eenReturn = new StringBuilder();

        Collections.sort(mijnFiguren);

        for (Figuur figuur : mijnFiguren) {
            eenReturn.append(figuur.toString()).append("\n\n");
        }

        return eenReturn.toString();
    }

    public ArrayList<Figuur> getMijnFiguren() {
        return mijnFiguren;
    }
}

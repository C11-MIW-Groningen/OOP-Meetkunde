package controller;

import model.Cirkel;
import model.Figuur;
import model.Punt;
import model.Rechthoek;

/**
 * @author Vincent Velthuizen <v.r.velthuizen@pl.hanze.nl>
 * Purpose of the program
 */
public class MeetkundeLauncher {

    public static void main(String[] args) {
        System.out.println(Rechthoek.geefDefinitie());
        Rechthoek[] mijnRechthoekArray = new Rechthoek[3];
        mijnRechthoekArray[0] = new Rechthoek(4, 3, new Punt(2, 5), "blauw");
        mijnRechthoekArray[1] = new Rechthoek();
        mijnRechthoekArray[2] = new Rechthoek(25, 10);
        for (int arrayTeller = 0; arrayTeller < mijnRechthoekArray.length; arrayTeller++) {
            toonInformatie(mijnRechthoekArray[arrayTeller]);
        }

        Cirkel cirkel = new Cirkel();
        toonInformatie(cirkel);
    }

    public static void toonInformatie(Figuur figuur) {
        System.out.println(figuur);
        System.out.println();
    }

}

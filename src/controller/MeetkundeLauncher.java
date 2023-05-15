package controller;

import model.Cirkel;
import model.Figuur;
import model.Punt;
import model.Rechthoek;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 * @author Vincent Velthuizen <v.r.velthuizen@pl.hanze.nl>
 * Purpose of the program
 */
public class MeetkundeLauncher {

    public static void main(String[] args) {
        ArrayList<Cirkel> mijnCirkels = new ArrayList<>();
        mijnCirkels.add(new Cirkel(3, new Punt(1, 4), "groen"));
        mijnCirkels.add(new Cirkel());
        mijnCirkels.add(new Cirkel(6));

        for (int cirkel = 0; cirkel < mijnCirkels.size(); cirkel++) {
            System.out.println(mijnCirkels.get(cirkel));
        }

        // enhanced for
        for (Cirkel cirkelUitDeLijst : mijnCirkels) {
            System.out.println(cirkelUitDeLijst);
        }
    }

    public static void toonInformatie(Figuur figuur) {
        System.out.println(figuur);
        System.out.println();
    }

}

package controller;

import model.Cirkel;

/**
 * @author Vincent Velthuizen <v.r.velthuizen@pl.hanze.nl>
 * Purpose of the program
 */
public class MeetkundeLauncher {

    public static void main(String[] args) {
        Cirkel mijnCirkel = new Cirkel();
        mijnCirkel.kleur = "paars";

        mijnCirkel.geefDefinitie();
        System.out.println("De straal van de cirkel is: " + mijnCirkel.straal);
        System.out.println("En zijn omtrek is: " + mijnCirkel.geefOmtrek());
    }

    public static void printOmtrekVanCirkel(Cirkel cirkel) {

    }

}

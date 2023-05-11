package controller;

import model.Cirkel;
import model.Punt;

/**
 * @author Vincent Velthuizen <v.r.velthuizen@pl.hanze.nl>
 * Purpose of the program
 */
public class MeetkundeLauncher {

    public static void main(String[] args) {
        Cirkel[] mijnCirkelArray = new Cirkel[3];

        mijnCirkelArray[0] = new Cirkel(3, new Punt(1, 4), "groen");
        mijnCirkelArray[1] = new Cirkel();
        mijnCirkelArray[2] = new Cirkel(6);

        mijnCirkelArray[0].setStraal(3);

        for (int cirkel = 0; cirkel < mijnCirkelArray.length; cirkel++) {
            System.out.println(mijnCirkelArray[cirkel].geefOppervlak());
            System.out.println(mijnCirkelArray[cirkel].geefOmtrek());
            System.out.println(mijnCirkelArray[cirkel].getMiddelpunt().getxCoordinaat());
            System.out.println(mijnCirkelArray[cirkel].getMiddelpunt().getyCoordinaat());
            System.out.println(mijnCirkelArray[cirkel].vertelOverGrootte());
            System.out.println();
        }
    }

}

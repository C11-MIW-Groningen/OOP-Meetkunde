package controller;

import model.Cirkel;

/**
 * @author Vincent Velthuizen <v.r.velthuizen@pl.hanze.nl>
 * Purpose of the program
 */
public class MeetkundeLauncher {

    public static void main(String[] args) {
        Cirkel mijnDefaultCirkel = new Cirkel();
        System.out.println(mijnDefaultCirkel.getStraal());
        System.out.println(mijnDefaultCirkel.geefOppervlak());
        System.out.println(mijnDefaultCirkel.vertelOverGrootte());
        mijnDefaultCirkel.setStraal(3);
        System.out.println(mijnDefaultCirkel.geefOppervlak());
        System.out.println(mijnDefaultCirkel.vertelOverGrootte());
        mijnDefaultCirkel.setStraal(6);
        System.out.println(mijnDefaultCirkel.geefOppervlak());
        System.out.println(mijnDefaultCirkel.vertelOverGrootte());
    }

}

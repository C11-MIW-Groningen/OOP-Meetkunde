package controller;

import model.Cirkel;
import model.Figuur;
import model.Punt;
import model.Rechthoek;

import java.time.LocalDate;

/**
 * @author Vincent Velthuizen <v.r.velthuizen@pl.hanze.nl>
 * Purpose of the program
 */
public class MeetkundeLauncher {

    public static void main(String[] args) {
        LocalDate vandaag = LocalDate.now();
        System.out.println(vandaag);

        LocalDate beginVan2023 = LocalDate.parse("2023-01-01");
        System.out.println(beginVan2023);

        LocalDate koningsdag2023 = LocalDate.of(2023, 4, 27);
        System.out.println(koningsdag2023.minusMonths(14));

        if (koningsdag2023.isBefore(vandaag)) {
            System.out.println("Is koningsdag nu geweest of niet? Ja");
        }
    }

    public static void toonInformatie(Figuur figuur) {
        System.out.println(figuur);
        System.out.println();
    }

}

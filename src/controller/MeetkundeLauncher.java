package controller;

import model.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Vincent Velthuizen <v.r.velthuizen@pl.hanze.nl>
 * Purpose of the program
 */
public class MeetkundeLauncher {

    public static void main(String[] args) {
        ArrayList<Figuur> rechthoeken = new ArrayList<>();
        File rechthoekenBestand = new File("resources/Rechthoek.csv");

        try (Scanner invoer = new Scanner(rechthoekenBestand)) {
            while (invoer.hasNextLine()) {
                String[] elementenVanRechthoek = invoer.nextLine().split(",");
                double lengte = Double.parseDouble(elementenVanRechthoek[0]);
                double breedte = Double.parseDouble(elementenVanRechthoek[1]);
                double xCoordinaat = Double.parseDouble(elementenVanRechthoek[2]);
                double yCoordinaat = Double.parseDouble(elementenVanRechthoek[3]);
                String kleur = elementenVanRechthoek[4];

                rechthoeken.add(new Rechthoek(lengte, breedte, new Punt(xCoordinaat, yCoordinaat), kleur));
            }
        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println("Het bestand is niet gevonden");
        }

        File uitvoerBestand = new File("resources/Rechthoeken.txt");
        try (PrintWriter printWriter = new PrintWriter(uitvoerBestand)) {
            for (Figuur figuur : rechthoeken) {
                printWriter.println(figuur);
                printWriter.println();
            }
        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println("Het bestand kan niet worden aangemaakt.");
        }
    }

    public static void toonInformatie(Figuur figuur) {
        System.out.println(figuur);
    }

    public static void toonInformatie(ArrayList<Figuur> figuren) {
        for (Figuur figuur : figuren) {
            toonInformatie(figuur);
            System.out.println();
        }
    }

}

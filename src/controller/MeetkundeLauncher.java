package controller;

import model.*;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Vincent Velthuizen <v.r.velthuizen@pl.hanze.nl>
 * Purpose of the program
 */
public class MeetkundeLauncher {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        boolean onjuisteInvoer = true;

        while (onjuisteInvoer) {

            try {
                System.out.print("Geef een straal: ");
                double straal = keyboard.nextDouble();
                Cirkel ingevoerdeCirkel = new Cirkel(straal);
                System.out.println(ingevoerdeCirkel);
                onjuisteInvoer = false;
            } catch (IllegalArgumentException fout) {
                System.out.println(fout.getMessage());
            } catch (InputMismatchException | IOException fout) {
                System.out.println("Dat was geen getal, probeer het nog een keer");
                keyboard.nextLine();
            } finally {
                System.out.println("Je invoer is op de juiste wijze afgehandeld.");
            }
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

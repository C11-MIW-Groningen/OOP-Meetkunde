package controller;

import database.CirkelDAO;
import database.DBaccess;
import database.FiguurDAO;
import database.PuntDAO;
import model.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
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
        DBaccess dBaccess = new DBaccess("figuren", "userFiguren", "userFigurenPW");
        dBaccess.openConnection();
        CirkelDAO cirkelDAO = new CirkelDAO(dBaccess);

        cirkelDAO.slaCirkelOp(new Cirkel(5, new Punt(3, 7), "oranje"));
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

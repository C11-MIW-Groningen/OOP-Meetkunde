package controller;

import model.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
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

        String mysqlDriver = "com.mysql.cj.jdbc.Driver";
        String urlPrefix = "jdbc:mysql://localhost:3306/";
        String connectionSetting  ="?useSSL=false" +
                "&allowPublicKeyRetrieval=true" +
                "&useJDBCCompliantTimezoneShift=true" +
                "&useLegacyDatetimeCode=false" +
                "&serverTimezone=UTC";

        String databaseName = "Figuren";
        String mainUser = "userFiguren";
        String mainUserPassword = "userFigurenPW";

        Connection connection = null;

        System.out.print("Driver laden ... ");
        try {
            Class.forName(mysqlDriver);
            System.out.println("driver geladen");

            connection = DriverManager.getConnection(urlPrefix + databaseName + connectionSetting,
                    mainUser, mainUserPassword);
            System.out.println("Verbinding succesvol");
        } catch (ClassNotFoundException e) {
            System.out.println("driver niet gevonden.");
        } catch (SQLException sqlException) {
            System.out.println("SQL exception: " + sqlException.getMessage());
        }

        if (connection != null) {
            String sql = "INSERT INTO punt VALUES (3, 5)";

            try {
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                preparedStatement.executeUpdate();
                connection.close();
                System.out.println("Alles is gelukt");
            } catch (SQLException sqlException) {
                System.out.println("SQL exception: " + sqlException.getMessage());
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

package database;

import model.Cirkel;

import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author Vincent Velthuizen <v.r.velthuizen@pl.hanze.nl>
 * Regelt het ophalen en wegschrijven van Cirkels naar de DB
 */
public class CirkelDAO {
    private DBaccess dBaccess;

    public CirkelDAO(DBaccess dBaccess) {
        this.dBaccess = dBaccess;
    }

    public void slaCirkelOp(Cirkel cirkel) {
        FiguurDAO figuurDAO = new FiguurDAO(dBaccess);
        int primaryKey = figuurDAO.slaFiguurOp(cirkel);

        String sql = "INSERT INTO cirkel (figuurnummer, straal, xcoordinaat, ycoordinaat) VALUES (?, ?, ?, ?);";

        try {
            PreparedStatement preparedStatement = dBaccess.getConnection().prepareStatement(sql);
            preparedStatement.setInt(1, primaryKey);
            preparedStatement.setDouble(2, cirkel.getStraal());
            preparedStatement.setDouble(3, cirkel.getMiddelpunt().getxCoordinaat());
            preparedStatement.setDouble(4, cirkel.getMiddelpunt().getyCoordinaat());
            preparedStatement.executeUpdate();
        } catch (SQLException sqlException) {
            System.out.println("SQL exception: " + sqlException.getMessage());
        }
    }
}

package database;

import model.Cirkel;

import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author Vincent Velthuizen <v.r.velthuizen@pl.hanze.nl>
 * Regelt het ophalen en wegschrijven van Cirkels naar de DB
 */
public class CirkelDAO extends AbstractDAO {

    public CirkelDAO(DBaccess dBaccess) {
        super(dBaccess);
    }

    public void slaCirkelOp(Cirkel cirkel) {
        FiguurDAO figuurDAO = new FiguurDAO(dBaccess);
        int primaryKey = figuurDAO.slaFiguurOp(cirkel);

        String sql = "INSERT INTO cirkel (figuurnummer, straal, xcoordinaat, ycoordinaat) VALUES (?, ?, ?, ?);";

        try {
            setupPreparedStatement(sql);
            preparedStatement.setInt(1, primaryKey);
            preparedStatement.setDouble(2, cirkel.getStraal());
            preparedStatement.setDouble(3, cirkel.getMiddelpunt().getxCoordinaat());
            preparedStatement.setDouble(4, cirkel.getMiddelpunt().getyCoordinaat());
            executeManipulateStatement();
        } catch (SQLException sqlException) {
            System.out.println("SQL exception: " + sqlException.getMessage());
        }
    }
}

package database;

import model.Punt;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * @author Vincent Velthuizen <v.r.velthuizen@pl.hanze.nl>
 * Purpose of the program
 */
public class PuntDAO extends AbstractDAO {

    public PuntDAO(DBaccess dBaccess) {
        super(dBaccess);
    }

    public void slaPuntOp(Punt punt) {
        String sql = "INSERT INTO punt VALUES (?, ?);";

        try {
            setupPreparedStatement(sql);
            preparedStatement.setDouble(1, punt.getxCoordinaat());
            preparedStatement.setDouble(2, punt.getyCoordinaat());
            executeManipulateStatement();
        } catch (SQLException sqlException) {
            System.out.println("SQL exception: " + sqlException.getMessage());
        }
    }

    public ArrayList<Punt> getAll() {
        ArrayList<Punt> allePunten = new ArrayList<>();

        String sql = "SELECT xcoordinaat, ycoordinaat FROM punt;";

        try {
            setupPreparedStatement(sql);
            ResultSet resultSet = executeSelectStatement();
            while (resultSet.next()) {
                double xCoordinaat = resultSet.getDouble(1);
                double yCoordinaat = resultSet.getDouble(2);
                allePunten.add(new Punt(xCoordinaat, yCoordinaat));
            }
        } catch (SQLException sqlException) {
            System.out.println("SQL exception: " + sqlException.getMessage());
        }

        return allePunten;
    }
}

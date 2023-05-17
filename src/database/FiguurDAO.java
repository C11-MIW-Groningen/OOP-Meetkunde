package database;

import model.Figuur;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author Vincent Velthuizen <v.r.velthuizen@pl.hanze.nl>
 * Regelt het ophalen en wegschrijven van Figuren naar de DB
 */
public class FiguurDAO extends AbstractDAO {

    public FiguurDAO(DBaccess dBaccess) {
        super(dBaccess);
    }

    public int slaFiguurOp(Figuur figuur) {
        String sql = "INSERT INTO figuur (kleur) VALUES (?);";
        int primaryKey = -1;

        try {
            setupPreparedStatementWithKey(sql);
            preparedStatement.setString(1, figuur.getKleur());
            preparedStatement.executeUpdate();
            primaryKey = executeInsertStatementWithKey();
        } catch (SQLException sqlException) {
            System.out.println("SQL exception: " + sqlException.getMessage());
        }

        return primaryKey;
    }
}

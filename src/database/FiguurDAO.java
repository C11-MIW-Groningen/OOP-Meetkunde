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
public class FiguurDAO {
    private DBaccess dBaccess;

    public FiguurDAO(DBaccess dBaccess) {
        this.dBaccess = dBaccess;
    }

    public int slaFiguurOp(Figuur figuur) {
        String sql = "INSERT INTO figuur (kleur) VALUES (?);";
        int primaryKey = -1;

        try {
            PreparedStatement preparedStatement = dBaccess.getConnection()
                    .prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, figuur.getKleur());
            preparedStatement.executeUpdate();
            ResultSet resultSet = preparedStatement.getGeneratedKeys();

            if (resultSet.next()) {
                primaryKey = resultSet.getInt(1);
            }

        } catch (SQLException sqlException) {
            System.out.println("SQL exception: " + sqlException.getMessage());
        }

        return primaryKey;
    }
}

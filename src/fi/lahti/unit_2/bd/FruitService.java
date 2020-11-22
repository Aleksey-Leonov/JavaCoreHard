package fi.lahti.unit_2.bd;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;

public class FruitService implements Service<Fruit> {

    @Override
    public Fruit findById(int id) {
        Connection connection = DBService.getConnection();

        try {
            PreparedStatement statement = connection.prepareStatement(
                    "SELECT * FROM fruits WHERE id = ?"
            );

            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                return new Fruit(
                        resultSet.getInt("id"),
                        resultSet.getString("name")
                );
            }
            return null;
        } catch (SQLException throwables) {
            throw new RuntimeException("SWW during Fruit find by id", throwables);
        } finally {
            DBService.close(connection);
        }
    }

    public Collection<Fruit> findAll() {
        Connection connection = DBService.getConnection();

        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM fruits");

            Collection<Fruit> fruits = new ArrayList<>();
            while (resultSet.next()) {
                fruits.add(
                        new Fruit(
                                resultSet.getInt("id"),
                                resultSet.getString("name")
                        )
                );
            }
            return fruits;
        } catch (SQLException throwables) {
            throw new RuntimeException("SWW during Fruit find all", throwables);
        } finally {
            DBService.close(connection);
        }
    }

    @Override
    public int save(Fruit fruit) {
        Connection connection = DBService.getConnection();

        try {
            connection.setAutoCommit(false);

            PreparedStatement statement = connection.prepareStatement(
                    "INSERT INTO fruits (name) VALUES (?)"
            );
            statement.setString(1, fruit.getName());
            int val = statement.executeUpdate();

            connection.commit();
            return val;
        } catch (SQLException throwables) {
            DBService.rollback(connection);
            throw new RuntimeException("SWW during Fruit save", throwables);
        } finally {
            DBService.close(connection);
        }
    }
}

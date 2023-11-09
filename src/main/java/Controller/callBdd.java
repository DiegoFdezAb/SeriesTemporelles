package dbController;

import javax.xml.transform.Result;
import java.sql.*;

public class callBdd {
    public PreparedStatement ps;
    public Connection connection;
    public void connection() {
        try {
            connection = DriverManager.getConnection("jdbc:h2:file:./data/databaseTest", "", "");
            System.out.println("connection.isValid(0) = " + connection.isValid(0));

        } catch (
                SQLException e) {
            System.out.println("No connection to database");
            throw new RuntimeException(e);
        }
    }
    public ResultSet sqlRunner(String sqlCommand){
        try {
            System.out.println("bddConnect.isValid(0) = " + connection.isValid(0));
            ps = connection.prepareStatement(sqlCommand);
            return ps.executeQuery();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}

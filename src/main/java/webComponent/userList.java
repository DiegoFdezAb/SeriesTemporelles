package webComponent;

import java.sql.ResultSet;
import java.sql.SQLException;

import static com.tp.springboot.Application.bdd;

public class userList {
    public String getUser() {
        ResultSet response = bdd.sqlRunner("SELECT * FROM Utilisateur WHERE id = 1");
        try {
            response.next();
            return response.getString("nom_utilisateur");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public String getUserList(){
        ResultSet response = bdd.sqlRunner("SELECT * FROM Utilisateur");
        try {
            String userList = "";
            while (response.next()){
                userList = response.getString("nom_utilisateur") + "\n") + response.getString("email") + "\n";

            }
            return userList;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}

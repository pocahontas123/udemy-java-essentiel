import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    public static void main(String[] args) {
        DatabaseConnection dbConnection = new DatabaseConnection();
        try {
            dbConnection.connect();
            System.out.println("Connexion établie avec succès !");
        } catch (DatabaseConnectionException e) {
            // Gérer l'exception et afficher les informations d'erreur
            System.err.println("Erreur de connexion à la base de données : " + e.getMessage());
            System.err.println("Cause : " + e.getCause().getMessage());
        }
    }

    public Connection connect() throws DatabaseConnectionException {
        try {
            // Tentative de connexion à la base de données
            String url = "jdbc:mysql://localhost:3306/mydatabase";
            String user = "username";
            String password = "password";
            return DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            //e.printStackTrace();
            // Capturer et encapsuler l'exception d'origine dans une nouvelle exception
            throw new DatabaseConnectionException("Erreur lors de la connexion à la base de données", e);
        }
    }
}

class DatabaseConnectionException extends Exception {
    public DatabaseConnectionException(String message, Throwable cause) {
        super(message, cause);
    }
}
/*
    Erreur de connexion à la base de données : Erreur lors de la connexion à la base de données
    Cause : No suitable driver found for jdbc:mysql://localhost:3306/mydatabase
 */
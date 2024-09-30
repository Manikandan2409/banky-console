package banky.entity.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import banky.utils.Exceptionable;

public class BankyConfig implements Config {
    private static Connection connection;

    private BankyConfig(){}

    public static Connection getConfiguration(){
        try {
            if (connection == null) {
                connection = DriverManager.getConnection(url+database, user, password);
                checkTables();
            }
        } catch (SQLException e) {
                System.out.println(Exceptionable.exceptionWhile+" database connection");
        }
        return connection;
    }
    private  static void checkTables(){

    }
}
interface Config{
    String url="jdbc:mysql://localhost:3306/";
    String user="root";
    String password="";
    String database ="banky";
}

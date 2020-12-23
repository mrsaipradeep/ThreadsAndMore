package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SqlCon {
    public static void main(String[] args) {
        String connectionUrl =
                "jdbc:sqlserver://INMAASAIPK2P:1433;"
                        + "database=mobiusview;"
                        + "user=sa;"
                        + "password=P@ssword;"
                        + "encrypt=true;"
                        + "trustServerCertificate=false;"
                        + "loginTimeout=30;";

        try (Connection connection = DriverManager.getConnection(connectionUrl)) {

        }
        // Handle any errors that may have occurred.
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

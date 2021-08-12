package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
    private Connection conn;
    private String username;
    private String password;
    private String url;

    public DbConnection(String dbType, String hostName, int portNumber, String dbName, String user, String pass) {
        
        this.username = user;
        this.password = pass;
        StringBuilder sb = new StringBuilder();
        sb.append("jdbc:").append(dbType).append("://").append(hostName).append(":").append(portNumber).append("/").append(dbName);
        this.url = new String(sb);

    }

    public boolean madeValidConnection() throws SQLException {

        int timeout = 5000;
        conn = DriverManager.getConnection(url, username, password);
        boolean validConnection = conn.isValid(timeout);
        conn.close();
        return validConnection;

    }
}

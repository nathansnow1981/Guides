package com.example;

import java.sql.SQLException;

public class App 
{
    public static void main( String[] args )
    {
        //Live but disposable database
        DbConnection db = new DbConnection(
            "mysql", 
            "bfmzqjqnqb2zweyrfrcj-mysql.services.clever-cloud.com", 
            3306, 
            "bfmzqjqnqb2zweyrfrcj", 
            "ujl2htktd6nlqhsg", 
            "fjjV64GZiaTB01Cj4Uhy"
        );

        try {
            String result;
            if(db.madeValidConnection())
                result = "A valid connection was made to the database :-)";
            else
                result = "A connection was not established :-(";
            System.out.println(result);
        } 
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

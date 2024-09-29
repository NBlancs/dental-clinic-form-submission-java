package org.openjfx.dental.clinic.form.submission.java.application;


import java.sql.Connection;
import java.sql.DriverManager;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class firstJDBC {

    public static void main(String[] args) {
        try {
            String driver = "com.mysql.cj.jdbc.Driver";
            String url = "jdbc:mysql://localhost:3306/dentalclinicdb";

            String username = "root";
            String password = "";

            // step 1
            Class.forName(driver);
            
            // step 2
            
            Connection con = DriverManager.getConnection(url, username, password);
            
            System.out.println("Connected ang database boss sa dental clinic nyeey!!");
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

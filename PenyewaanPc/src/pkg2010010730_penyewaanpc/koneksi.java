/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2010010730_penyewaanpc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ikybk
 */
public class koneksi {
    private Connection connect;
    
    private String driverName = "com.mysql.jdbc.Driver";
    private String url = "jdbc:mysql://localhost:3306/2010010730_penyewaan_pc";
    private String username = "root";
    private String password = "";
    
    public Connection getKoneksi(){
        if (connect == null) {
            try {
                Class.forName(driverName);
                System.out.println("Class Driver Ditemukan");
                connect = DriverManager.getConnection(url, username, password);
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(koneksi.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        return connect;
    }
    
    public static void main(String[] args) {
        koneksi koneksi = new koneksi();
        
        koneksi.getKoneksi();
    }
}

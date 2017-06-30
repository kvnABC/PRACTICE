/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatraining;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 *
 * @author kennethbolivar
 */
public class JavaTraining {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        
        Connection conn = null;
        Properties connectProp = new Properties();
        SingleConnect.getInstance().values();
        connectProp.put("user", SingleConnect.getInstance().getUser());
        connectProp.put("password", SingleConnect.getInstance().getPassword());

        try{
        conn = DriverManager.getConnection(SingleConnect.getInstance().getHost(), connectProp);
         System.out.println(conn.getMetaData().toString());
         
        }
        catch(Exception e){
            e.printStackTrace();
        }
        /*try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }*/

       

    }

}

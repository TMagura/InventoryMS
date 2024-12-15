/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
//import java.sql.Statement;

import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author TEEBAG
 */
public class Tables {

    public static void main(String[] args) {
        Connection con = null;
        Statement st = null;
        try {
            con = ConnectionProvider.getCon();
            st = con.createStatement();
//         st.executeUpdate("create table appuser "
//                 + "(appuser_pk int AUTO_INCREMENT primary key, "
//                 + "userRole varchar(50),"
//                 + "name varchar(200),"
//                 + "mobileNumber varchar(50),"
//                 + "email varchar (200),"
//                 + "password varchar(50),"
//                 + "address varchar(200),"
//                 + "status varchar (50))");

//        st.executeUpdate("insert into appuser (userRole, name, mobileNumber, email, password, address, status) "
//                    + "values('SuperAdmin','Super Admin', '0783779699','a@gmail.com', 'password', 'mkoba 14','Active')");
//        st.executeUpdate("create table category "
//                 + "(category_pk int AUTO_INCREMENT primary key, "
//                 + " name varchar(50))");
//          st.executeUpdate("create table product"
//                 + "(product_pk int AUTO_INCREMENT primary key,"
//                 + "name varchar(200),"
//                 + "quantity int,"
//                 + "price int,"
//                 + "description varchar(500),"
//                 + "category_fk int)");
            st.executeUpdate("create table customer"
                    + "(customer_pk int AUTO_INCREMENT primary key,"
                    + "name varchar(200),"
                    + "mobileNumber varchar(50),"
                    + "email varchar(200))");
            
            JOptionPane.showMessageDialog(null, "Table created successfully");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            try {
                con.close();
                st.close();
            } catch (Exception e) {

            }
        }
    }
}

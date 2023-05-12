/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package dao;

/**
 * Nama : Reynold Kunarto 
 * NPM : 210711015
 * 
 * Nama : Febiola Ika Putri Wibowo
 * NPM : 210711023
 */
/**
 *
 * @author Msi Modern 14
 */

import connection.DbConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Customer;

public class CustomerDAO {
    
    private DbConnection dbcon = new DbConnection();
    private Connection con;
    
    public void insertCustomer(Customer c){
        con = dbcon.makeConnection();
        
        String sql = "INSERT INTO customer(id, nama, ktp, no_telepon) "
                + "VALUES ('" + c.getId() + "', '" + c.getNama() + "', '"
                + c.getKtp() + "', '" + c.getNo_telepon() + "')";
        
        System.out.println("Adding Customer ...");
        
        try{
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Added "+result+" Customer");
            statement.close();
        }catch(Exception e){
            System.out.println("Error adding customer ...");
            System.out.println(e);
        }
        dbcon.closeConnection();
    }
    
    public List<Customer> showCustomer(String query){
        con = dbcon.makeConnection();
        
        String sql = "SELECT * FROM customer";
        System.out.println("Mengambil data customer ...");
        
        List<Customer> list = new ArrayList();
        
        try{
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            
            if(rs != null){
                while (rs.next()){
                    Customer c = new Customer(
                            rs.getInt("id"),
                            rs.getString("nama"),
                            rs.getString("ktp"),
                            rs.getString("no_telepon")
                    );
                    list.add(c);
                }
            }
            rs.close();
            statement.close();
        }catch(Exception e){
            System.out.println("Error reading database ...");
            System.out.println(e);
        }
        dbcon.closeConnection();
        
        return list;
    }
    
    public Customer searchCustomer(int id){
        con = dbcon.makeConnection();
        
        String sql = "SELECT * FROM customer WHERE id = '"
                + id + "'";
        System.out.println("Searching Customer ...");
        Customer c = null;
        
        try{
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            
            if(rs != null){
                while(rs.next()){
                    c = new Customer(
                            rs.getInt("id"),
                            rs.getString("nama"),
                            rs.getString("ktp"),
                            rs.getString("no_telepon")
                    );
                }
            }
            rs.close();
            statement.close();
        }catch(Exception e){
            System.out.println("Error reading database ...");
            System.out.println(e);
        }
        dbcon.closeConnection();
        
        return c;
    }
    
    public void updateCustomer(Customer c) {

        con = dbcon.makeConnection();
        
           String sql = "UPDATE customer SET nama = '" + c.getNama()+ "', "
                + "ktp = '" + c.getKtp() + "', "
                + "no_telepon = '" + c.getNo_telepon() + "', "
                + "WHERE id = '" + c.getId() + "'"; 
           System.out.println("Editing customer ...");
                
        try {
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Edited " + result + " customer " + c.getId());
            statement.close();
        } catch (Exception e) {
            System.out.println("Error editing customer ...");
            System.out.println(e);
        }

        dbcon.closeConnection();
    }
    
    public void deleteCustomer(int id) {

        con = dbcon.makeConnection();
        
        String sql = "DELETE FROM customer WHERE id = '" + id + "'";
        System.out.println("Deleting customer ...");
        
        try {
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Delete " + result + " customer " + id);
            statement.close();
        } catch (Exception e) {
            System.out.println("Error deleting customer...");
            System.out.println(e);
        }

        dbcon.closeConnection();
    }
    
}

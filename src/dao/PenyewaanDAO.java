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

import connection.DbConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Kendaraan;
import model.Customer;
import model.Penyewaan;

public class PenyewaanDAO {
    private DbConnection dbcon = new DbConnection();
    private Connection con;
    
    public void insertPenyewaan(Penyewaan p){
        con = dbcon.makeConnection();
        
        String sql = "INSERT INTO penyewaan(id, lama_sewa, total_harga, fasilitas, id_kendaraan, id_customer) "
                + "VALUES ('" + p.getId() + "', '" + p.getLama_sewa() + "', '"
                + p.getTotal_harga() + "', '" + p.getFasilitas() + "', '" 
                + p.getKendaraan().getId() + "', '" + p.getCustomer().getId() + "')";
        
        System.out.println("Adding Penyewaan ...");
        
        try{
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Added "+result+" Penyewaan");
            statement.close();
        }catch(Exception e){
            System.out.println("Error adding penyewaan ...");
            System.out.println(e);
        }
        dbcon.closeConnection();
    }
    
    public List<Penyewaan> showPenyewaan(String query){
        con = dbcon.makeConnection();
        
        String sql = "SELECT p.*, k.*, c.* FROM penyewaan as p"
                + " JOIN kendaraan as k ON p.id_kendaraan = k.id"
                + " JOIN customer as c ON p.id_customer = c.id"
                + " WHERE (k.merk LIKE '%" + query + "%'"
                + "OR k.jenis LIKE '%" + query + "%'"
                + "OR c.nama LIKE '%" + query + "%'"
                + "OR p.lama_sewa LIKE '%" + query + "%'"
                + "OR p.total_harga LIKE '%" + query + "%'"
                + "OR p.fasilitas LIKE '%" + query + "%'"
                + "OR k.jumlah_penumpang LIKE '%" + query + "%'"
                + "OR k.jenis_tak LIKE '%" + query + "%')";
        System.out.println("Mengambil data Penyewaan ...");
        
        List<Penyewaan> list = new ArrayList();
        
        try{
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            
            if(rs != null){
                while (rs.next()){
                    Kendaraan k = new Kendaraan(
                            rs.getString("k.id"),
                            rs.getString("merk"),
                            rs.getString("jenis"),
                            rs.getInt("tahunPembuatan"),
                            rs.getString("noPlat"),
                            rs.getInt("jumlah_penumpang"),
                            rs.getString("jenis_tak")
                    );
                    
                    Customer c = new Customer(
                            rs.getInt("c.id"),
                            rs.getString("nama"),
                            rs.getString("ktp"),
                            rs.getString("no_telepon")
                    );
                    
                    Penyewaan p = new Penyewaan(
                            rs.getInt("p.id"),
                            rs.getString("lama_sewa"),
                            rs.getFloat("total_harga"),
                            rs.getString("fasilitas"),
                            k,c
                            
                    );
                    
                    list.add(p);
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
    
    public void updatePenyewaan(Penyewaan p) {

        con = dbcon.makeConnection();
        
           String sql = "UPDATE penyewaan SET id_kendaraan = '" + p.getKendaraan().getId() + "', "
                + "id_customer = '" + p.getCustomer().getId() + "', "
                + "lama_sewa = '" + p.getLama_sewa()+ "', "
                + "total_harga = '" + p.getTotal_harga() + "', "
                + "fasilitas = '" + p.getFasilitas() + "' "
                + "WHERE id = '" + p.getId() + "'"; 
           System.out.println("Editing penyewaan ...");
                
        try {
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Edited " + result + " Penyewaan " + p.getId());
            statement.close();
        } catch (Exception e) {
            System.out.println("Error editing penyewaan ...");
            System.out.println(e);
        }

        dbcon.closeConnection();
    }
    
    public void deletePenyewaan(int id) {

        con = dbcon.makeConnection();
        
        String sql = "DELETE FROM penyewaan WHERE id = '" + id + "'";
        System.out.println("Deleting penyewaan ...");
        
        try {
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Delete " + result + " penyewaan " + id);
            statement.close();
        } catch (Exception e) {
            System.out.println("Error deleting Penyewaan...");
            System.out.println(e);
        }

        dbcon.closeConnection();
    }
}

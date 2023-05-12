/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package control;

/**
 * Nama : Reynold Kunarto 
 * NPM : 210711015
 * 
 * Nama : Febiola Ika Putri Wibowo
 * NPM : 210711023
 */


import dao.PenyewaanDAO;
import java.util.List;
import model.Penyewaan;
import table.TablePenyewaan;

public class PenyewaanControl {
    private PenyewaanDAO pDao = new PenyewaanDAO();
    
    public void insertDataPenyewaan(Penyewaan p){
        pDao.insertPenyewaan(p);
    }
    
    public String showDataPenyewaan(String query){
        List<Penyewaan> dataPenyewaan = pDao.showPenyewaan(query);
        TablePenyewaan tablePenyewaan = new TablePenyewaan(dataPenyewaan);
        
        return tablePenyewaan;
    }
    
    public void updateDataPeneywaan(Penyewaan p){
        pDao.updatePenyewaan(p);
    }
    
    public void deleteDataPenyewaan(int id){
        pDao.deletePenyewaan(id);
    }
}

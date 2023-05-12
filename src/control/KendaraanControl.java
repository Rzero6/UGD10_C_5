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

import dao.kendaraanDAO;
import java.util.List;
import model.Kendaraan;

public class KendaraanControl {
    private kendaraanDAO kDao = new kendaraanDAO();
    
    public void insertDataKendaraan(Kendaraan k){
        kDao.insertKendaraan(k);
    }
    
    public int getDataCount(String jenis){
        List<Kendaraan> dataKendaraan = kDao.showKendaraan(jenis);
        return dataKendaraan.size();
    }
    
    public Kendaraan getLasKendaraan(String jenis){
        return kDao.getLastData(jenis);
    }
    
    public String showDataKendaraan(String jenis){
        List<Kendaraan> dataKendaraan = kDao.showKendaraan(jenis);
        String kendaraanString = "";
        for(int i=0; i<dataKendaraan.size(); i++){
            kendaraanString = kendaraanString + dataKendaraan.get(i).showData(jenis);
        }
        return kendaraanString;
    }
    
    public List<Kendaraan> showListKendaraan(){
        List<Kendaraan> dataKendaraan = kDao.showKendaraan("All");
        return dataKendaraan;
    }
    
    public Kendaraan searchKendaraan(String id){
        return kDao.searchKendaraan(id);
    }
    
    public void updateDataKendaraan(Kendaraan k, String id){
        kDao.updateKendaraan(k, id);
    }
    
    public void deleteKendaraan(String id){
        kDao.deleteKendaraan(id);
    }
}

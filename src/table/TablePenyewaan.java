/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package table;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Penyewaan;

/**
 * Nama : Reynold Kunarto 
 * NPM : 210711015
 * 
 * Nama : Febiola Ika Putri Wibowo
 * NPM : 210711023
 */
/**
 *
 * @author VICTUS
 */
public class TablePenyewaan extends AbstractTableModel{
    private List<Penyewaan> list;
    
    public TablePenyewaan(List<Penyewaan> list){
        this.list = list;
    }
    
    public int getRowCount(){
        return list.size();
    }
    
    public int getColumnCount(){
        return 8;
    }
    
    public Object getValueAt(int rowIndex, int columnIndex){
        switch(columnIndex){
            case 0:
                return list.get(rowIndex).getKendaraan().getMerk();
            case 1:
                return list.get(rowIndex).getKendaraan().getJenis();
            case 2:
                return list.get(rowIndex).getCustomer().getNama();
            case 3:
                return list.get(rowIndex).getLama_sewa();
            case 4:
                return list.get(rowIndex).getTotal_harga();
            case 5:
                return list.get(rowIndex).getFasilitas();
            case 6:
                return list.get(rowIndex).getKendaraan().getJumlah_penumpang();
            case 7:
                return list.get(rowIndex).getKendaraan().getJenis_tak();
            case 8:
                return list.get(rowIndex).getId();
            case 9:
                return list.get(rowIndex).getKendaraan().getId();
            case 10:
                return list.get(rowIndex).getCustomer().getId();
            default:
                return null;
        }
    }
    
    public String getColumnName(int column){
        switch (column) {
            case 0:
                return "Merk Kendaraan";
            case 1:
                return "Jenis Kendaraan";
            case 2:
                return "Nama Customer";
            case 3:
                return "Lama Sewa";
            case 4:
                return "Total Harga";
            case 5:
                return "Fasilitas";
            case 6:
                return "Jumlah Penumpang";
            case 7:
                return "Jumlah Tak";
            default:
                return null;
        }
    }
}

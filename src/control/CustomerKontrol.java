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

import dao.CustomerDAO;
import java.util.List;
import model.Customer;

public class CustomerKontrol {
    private CustomerDAO cDao = new CustomerDAO();
    
    public void insertDataCustomer(Customer c){
        cDao.insertCustomer(c);
    }
    
    public void updateDataCustome(Customer c){
        cDao.updateCustomer(c);
    }
    
    public void deleteCustomer(int id){
        cDao.deleteCustomer(id);
    }
}

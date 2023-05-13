/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package model;

/**
 * Nama : Reynold Kunarto 
 * NPM : 210711015
 * 
 * Nama : Febiola Ika Putri Wibowo
 * NPM : 210711023
 */

public class Customer {
    private int id;
    private String nama;
    private String ktp;
    private String no_telepon;

    public Customer(int id, String nama, String ktp, String no_telepon) {
        this.id = id;
        this.nama = nama;
        this.ktp = ktp;
        this.no_telepon = no_telepon;
    }

    public Customer(String nama, String ktp, String no_telepon) {
        this.nama = nama;
        this.ktp = ktp;
        this.no_telepon = no_telepon;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public String getKtp() {
        return ktp;
    }

    public void setKtp(String ktp) {
        this.ktp = ktp;
    }
    
    public String getNo_telepon() {
        return no_telepon;
    }

    public void setNo_telepon(String no_telepon) {
        this.no_telepon = no_telepon;
    }
    
    @Override
    public String toString(){
        return nama;
    }
}

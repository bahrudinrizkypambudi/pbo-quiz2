/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bahrudin<bahrudinrizky313@gmai.com>
 */
public class Item {
    private String nama;
    private float harga;
    private int jumlah;

    //konstruktor class Item
    public Item(String name, float price, int jumlah) {
        this.nama = nama;
        this.harga = harga;
        this.jumlah = jumlah;
    }
    
    //Mengambil Nama
    public String getNama() {
        return nama;
    }
    
    //meng-set Nama
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    //mengambil harga 
    public float getHarga() {
        return harga;
    }
    
    //mengset Harga
    public void setHarga(float harga) {
        this.harga = harga;
    }
    
    //mengambil total akhir
    public int getJumlah() {
        return jumlah;
    }
    
    //Meng-set Jumlah
    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }
    
    //mengambil total khir
    public float getTotal(){
        return this.harga * this.jumlah;
    }
    
    public String toString(){
        return "Item{"+"nama=" + nama + ",harga=" +harga+", jumlah =" +jumlah+'}';
    }
}
package bahrudin.quiz;


import bahrudin.quiz.Item;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bahrudin<bahrudinrizky313@gmai.com>
 */
public class Transaksi {
    private String code;
    private ArrayList<Item> items = new ArrayList<>();
    private float total;

    //konstraktor
    public Transaksi(String code, ArrayList<Item> item) {
        this.code = code;
        this.items=item;
    }
    
    //mengambil Item
    public ArrayList<Item> getItems(){
        return items;
    }
    
    //meng-set Item yang akan dimasukan kedalam tabel
    public void setItems(ArrayList<Item> items){
        this.items = items;
    }
    
    //mengambil total
    public float getTotal(){
        float totalAkhir = 0;
        for(Item item : this.items){
            totalAkhir+=item.getTotal();
        }
        this.total = totalAkhir;
        return 0;
    }
    
    //meng-set total akhir
    public void setTotal() {
        float totalAkhir = 0;
        for(Item item : this.items){
            totalAkhir+=item.getTotal();
        }
        this.total=totalAkhir;
    }
    
    //menampilkan detail transaksi menjadi popup window
    public String transDetail() { 
        setTotal();
        String str = "";
        str += "Kode\t\t: "+ this.code +"\n";
        str += "Daftar Belanja : \n";
        for(Item item : this.items) {
            str += "\t"+ item.getName() +"(x"+ item.getQty() +") : "+ item.getTotal() +"\n";
        }
        str += "Total\t\t: "+ this.total;
        return str;
    } 
}

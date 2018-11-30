
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

    public Transaksi(String code, float total) {
        this.code = code;
        this.total = total;
    }
    
    public ArrayList<Item> getItems(){
        return items;
    }
    
    public void setItems(ArrayList<Item> items){
        this.items = items;
    }
    
    public float getTotal(){
        float totalAkhir = 0;
        for(Item item : this.items){
            totalAkhir+=item.getTotal();
        }
        this.total = totalAkhir;
        return 0;
    }
    
    public String transDetail() { 
        setTotal();
        String str = "";
        str += "Kode\t\t: "+ this.code +"\n";
        str += "Daftar Belanja : \n";
        for(Item item : this.items) {
            str += "\t"+ item.getNama() +"(x"+ item.getJumlah() +") : "+ item.getTotal() +"\n";
        }
        str += "Total\t\t: "+ this.total;
        return str;
    }

    private void setTotal() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}

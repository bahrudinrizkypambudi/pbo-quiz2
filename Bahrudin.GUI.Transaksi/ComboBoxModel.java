
import java.util.ArrayList;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bahrudin<bahrudinrizky313@gmai.com>
 */
public class ComboBoxModel {
    private HashMap<String,Float> items = new HashMap<>();
    
    public ComboBoxModel(){
        this.items.put("Gula", new Float(30000));
        this.items.put("Kopi", new Float(10000));
        this.items.put("Susu", new Float(20000));
    }
    
    public ArrayList<String> getNama(){
        ArrayList<String> brg = new ArrayList<>();
        for(String item : this.items.keySet()){
            brg.add(item);
        }
        return brg;
    }
    
        public ArrayList<Float> getHarga() {
        ArrayList<Float> hrg = new ArrayList<>();
        for(float item : this.items.values()) {
            hrg.add(item);
        }
        return hrg;
    }
        public void addItems(String nama, float harga){
            this.items.put(nama, harga);
       
    }
}

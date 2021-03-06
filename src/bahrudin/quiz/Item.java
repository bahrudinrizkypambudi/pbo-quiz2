package bahrudin.quiz;

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
    private String name;
    private float price;
    private int qty;

    //konstruktor class Item
    public Item(String name, float price, int qty) {
        this.name = name;
        this.price = price;
        this.qty = qty;
    }
    
    //Getter name
    public String getName() {
        return name;
    }
    
    //Setter Name
    public void setName(String name) {
        this.name = name;
    }
    
    //getter price 
    public float getPrice() {
        return price;
    }
    
    //Setter price
    public void setPrice(float price) {
        this.price = price;
    }
    
    //Getter qty
    public int getQty() {
        return qty;
    }
    
    //Setter qty
    public void setQty(int qty) {
        this.qty = qty;
    }
    
    //mengambil total akhir
    public float getTotal(){
        return this.price * this.qty;
    }

    @Override
    public String toString() {
        return "Item{" + "name=" + name + ", price=" + price + ", qty=" + qty + '}';
    }
}
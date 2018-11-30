
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bahrudin<bahrudinrizky313@gmai.com>
 */
public class TableModel extends DefaultTableModel {
        private  final String[] namaKolom;

   public TableModel(){
    this.namaKolom = new String[] {
        "Nama", "Harga", "Jumlah"
    };
   }
   
   public String[] getnamaKolom(){
    return this.namaKolom;
   }    
}

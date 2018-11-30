package bahrudin.quiz;
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
        private String[] columns;

   public TableModel(){
    this.columns = new String[] {
        "Nama", "Harga", "Jumlah"
    };
   }
   
   //mengambil kolom pada tabel
   public String[] getcolumnName(){
    return this.columns;
   }    

    @Override
    public String toString() {
        return "TableModel("+"column="+columns;
    }
   
}

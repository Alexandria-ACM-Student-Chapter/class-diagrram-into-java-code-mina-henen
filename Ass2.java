/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ass.pkg2;

/**
 *
 * @author HP
 */
public class Ass2 {

    /**
     * @param args the command line arguments
     */
    public class InvoiceItem
    {
       private int  qty;
       private String id,desc;
       private double unitPrice;
       public InvoiceItem(String id, String desc, int qty, double unitPrice)
            {
                this.id= id;
                this.desc= desc;
                this.qty= qty;
                this.unitPrice= unitPrice;
            }
       public String getID()
            {
                return id;
            }
       public String getDesc()
            {
                return desc;
            }
       public int getQty()
            {
                return qty;
            }
       public void setQty(int new_qty)
            {
                this.qty= new_qty;
            }
       public double getUnitPrice()
       {
           return unitPrice;
       }
       public void setUnitPrice(double new_price)
            {
                this.unitPrice= new_price;
            }
       public double getTotal()
       {
           double total= qty*unitPrice;
           return total;
       }
       public String tooString()
            {
                String st="InvoiceItem[id ="+getID()+" ,desc="+getDesc()+" ,qty="+getQty()+" ,unitPrice="+getUnitPrice()+"]";
                return st;
       
    }
    
}

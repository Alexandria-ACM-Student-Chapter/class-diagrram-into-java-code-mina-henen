/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ass.pkg1;

/**
 *
 * @author HP
 */
public class Ass1 {

    /**
     * @param args the command line arguments
     */
    public class Account
    {
        String id,name;
        int balance=0;
        public Account(String id,String name)
        {
            this.id= id;
            this.name= name;
        }
        public Account(String id,String name, int balance)
        {
            this.id= id;
            this.name= name;
            this.balance= balance;
        }
        public String getID()
        {
            return id;
        }
        public String getName()
        {
            return name;
        }
        public int getBalance()
        {
            return balance;
        }
        public int credit(int amount)
        {
            balance+= amount;
            return balance;
        }
        public int debit(int amount)
        {
            if(amount<=balance)
            {
                balance-= amount;
            }
            else
            {
                System.out.println("Amount exceede balance");
            }
            return balance;
        }
        public int transferTo(Account another, int amount){
            if(amount<=balance)
            {
                another.balance= amount;
                balance-= amount;
            }
            else
            {
                System.out.println("Amount exceede balance");
            }
            return balance;
        }
                
        public String tooString()
            {
                String st="Account[id ="+getID()+" ,name="+getName()+" ,balance="+getBalance()+"]";
                return st;
            }
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author HP
 */
public class JavaApplication1 {

    /**
     */
        public class Employee
        {
            public void main(String[] args) {
            }
     
            // objects
            private int id, salary;
            private String firstname, lastname;
            // constructor
            public Employee(int id, String firstname, String lastname, int salary)
            {
                this.id= id;
                this.firstname= firstname;
                this.lastname= lastname;
                this.salary= salary;
            }
            public int getID()
            {
                return id;
            }
            public String getFirstName()
            {
                return firstname;
            }
            public String getLastName()
            {
                return lastname;
            }
            public String getName()
            {
                String name= firstname + lastname;
                return name;
            }
            public int getSalary()
            {
                return salary;
            }
            public void setSalary(int new_salary)
            {
                this.salary= new_salary;
            }
            public int getAnnualSalary()
            {
                int annualsalary= salary*12;
                return annualsalary;
            }
            public int raiseSalary(int percent)
            {
                int n_salary= salary + (percent* salary);
                return n_salary;
            }
            public String tooString()
            {
                String emp="Employee[id ="+getID()+" ,name="+getName()+" ,salary="+getSalary()+"]";
                return emp;
            }
            
        }
    }
       
    

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalexam;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Anusha Kanagala
 */
public class ques12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                 ArrayList<Employee> employees = new ArrayList<Employee>();
       employees.add(new Employee(1111, "Anusha", 10000));
       employees.add(new Employee(7356, "Likhita", 98600));
       employees.add(new Employee(8632, "Abhilash", 36000));
       employees.add(new Employee(4638, "Chandu", 65000));
       employees.add(new Employee(5347, "Dhoni", 58300));

       System.out.println("Displaying the list of employees : ");
       display(employees);
      

       Collections.sort(employees);
       System.out.println("\n\ndisplaying the employees List after sorting: ");
       display(employees);
      

Collections.sort(employees, new SortBySalary());
       System.out.println("\n\nDisplaying the employees List after sorting by Salary: ");
display(employees);
  
      
Collections.sort(employees, new SortByName());
System.out.println("\n\nDisplaying the employees List after sorting by Name: ");
display(employees);
   }

   private static void display(ArrayList<Employee> emps) {
       for (Employee emp : emps) {
           System.out.println(emp);
       }
      
   }

}

        

    

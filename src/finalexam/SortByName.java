/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalexam;

import java.util.Comparator;

/**
 *
 * @author  Anusha Kanagala
 */
public class SortByName implements Comparator<Employee>  {
       @Override
                public int compare(Employee emp1, Employee emp2) {
                if (emp1.getEmployeeName().compareTo(emp2.getEmployeeName()) < 0) {
                return -1;
                }
                   else if (emp1.getEmployeeName().compareTo(emp2.getEmployeeName()) > 0) {
                return 1;
                }
                else {
                        return 0;
                }
               }  
}

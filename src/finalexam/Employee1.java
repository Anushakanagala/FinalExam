/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalexam;

/**
 *
 * @author Anusha Kanagala
 */
public class Employee1 {
        private String employeename;
        private String employeeId;

    public Employee1(String employeename, String employeeId) {
        this.employeename = employeename;
        this.employeeId= employeeId;
    }

    @Override
    public String toString() {
        return  "Employee Name: " + employeename + " and Employee Id is: " + employeeId ;
    }

}

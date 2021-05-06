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
public class Accenture extends Employee1{
              private String ProjectName;

    public Accenture(String employeename, String employeeId, String ProjectName) {
        super(employeename, employeeId);
        this.ProjectName=ProjectName;
       
    }

       

    @Override
    public String toString() {
        return super.toString() + ", Project Name is: " + ProjectName ;
    }
    
    
}

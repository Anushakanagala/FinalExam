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
public class Employee implements Comparable<Employee>  {
           private int employeeId;
	   private String employeeName;
	   private double employeeSalary;

	   /**
	   * @param empId
	   * @param empName
	   * @param empSalary
	   */
	   public Employee(int empId, String empName, double empSalary) {
	       this.employeeId = empId;
	       this.employeeName = empName;
	       this.employeeSalary = empSalary;
	   }

	   public int getEmployeeId() {
	       return employeeId;
	   }

	   public void setEmployeeId(int empId) {
	       this.employeeId = empId;
	   }

	   public String getEmployeeName() {
	       return employeeName;
	   }

	   public void setEmployeeName(String empName) {
	       this.employeeName = empName;
	   }

	   public double getEmployeeSalary() {
	       return employeeSalary;
	   }

	   public void setEmployeeSalary(double empSalary) {
	       this.employeeSalary = empSalary;
	   }

	   @Override
	   public String toString() {
	       return "Emp Id: " + employeeId + ", Emp Name: " + employeeName + ", Emp Salary: "
	               + employeeSalary;
	   }

	   @Override
	   public int compareTo(Employee other) {
	       if (this.employeeId < other.getEmployeeId())
	           return -1;
	       else if (this.employeeId > other.getEmployeeId())
	           return 1;
	       else
	           return 0;

           }
}

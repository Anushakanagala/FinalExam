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
public class ques3a {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Employee1 employee1= new Employee1("Harshitha", "S42823");
       Accenture accenture=new Accenture("Sunil", "S542268"  , "Telecommunications ");
        employee1 = accenture;
       accenture=(Accenture)employee1;
        System.out.println(accenture);

    }
    
}

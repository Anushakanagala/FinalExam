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
public class ques9c {

    /**
     * @param args the command line arguments
     */
   
   
    static void food() throws IllegalAccessException // this method throws an exception to be handled by user
    {
        System.out.println("biryani");
        throw new IllegalAccessException("not available");
    }
  
    // This is a caller function 
    public static void main(String args[])
    {
        try {
            food();
        }
        catch (IllegalAccessException exc) {
            System.out.println("Avaialble");
        }
    
}
}

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
public class ques9a {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      try
      {
          System.out.println("Before throw.");
          throw new ArithmeticException();
      }
      catch(ArithmeticException exc)
      {
          System.out.println("Exception caught.");
          
      }
      System.out.println("After try/catch block");
    }
    
}

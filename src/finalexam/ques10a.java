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
public class ques10a {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int a = sum(5);
    System.out.println(a);
   }
  
    
    public static int sum(int i) {
    if (i > 0) 
    {
      return i + sum(i - 1);
    } 
    else 
    {
      return 0;
    }
    }
    
}

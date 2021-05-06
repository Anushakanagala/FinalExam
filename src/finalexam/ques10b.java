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
public class ques10b {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     int a = sum(10, 20);
    System.out.println(a);
  }
    
    
  public static int sum(int start, int end) {
    if (end > start)
    {
      return end + sum(start, end - 1);
    } 
    else 
    {
      return end;
    }
    }
    
}

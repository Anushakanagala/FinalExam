/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalexam;

/**
 *
 * @author Anusha kanagala
 */
public class ques10d {

    /**
     * @param args the command line arguments
     */
    public static void recSearch(int[] b, int d, int len, int c) {
       if (d == len){
        System.out.println(c+": Element doesn't exist in array list.");   
     }
     else{
         if (b[d] == c) 
         {
           System.out.println("Element present at location "+(d+1)+" is: "+ c);
          
         }
         else{
             recSearch(b, d+1, len, c);
         }
    }

       

    }
    
}

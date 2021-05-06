/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalexam;

import static finalexam.ques10d.recSearch;

/**
 *
 * @author Anusha Kanagala
 */
public class SearchElement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int a,c=5;
      int b[]={1,3,5,7,9};   
      
        recSearch(b, 0, b.length-1, c);

    }
    
}

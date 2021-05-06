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

    public class Square1 extends Shape{
         int side;
 
    // constructor
    Square1(int side)
    {
 
        
        this.side = side;
        
    }
 
   
 
    @Override public double area()
    {
        return (double)(side * side);
    }
    
}


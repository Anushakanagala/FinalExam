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
public class circle1 extends Shape{
     double pi = 3.14;
    int radius;
 
    // constructor
    circle1(int radius)
    {
 
      
        this.radius = radius;
    }
 
   
   
    @Override public double area()
    {
        return (double)((pi * radius * radius) / 2);
    }
}


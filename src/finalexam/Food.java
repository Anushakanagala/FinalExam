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
public class Food {
    public String foodname;
    public int cost;
          
    Food(String foodname, int cost)  // constructor with two arguments.
    {
              
        this.foodname = foodname;
        this.cost = cost;
    }
      
    @Override
    public boolean equals(Object obj)
    {
          
  
    if(this == obj) // checking if both the object references are referring to the same object
            return true;
          
        
        if(obj == null || obj.getClass()!= this.getClass()) // if the object is of type food by comparing both the classes and if they are not same it returns false 
                                                                 
            return false;
          
        
        Food food = (Food) obj;  // type casting of the argument.
          
        
        return (food.foodname == this.foodname && food.cost == this.cost); // comparing the state of argument with the state of 'this' Object 
    }
      
    @Override
    public int hashCode()
    {
          
       
        return this.cost; /* returning the cost as a hashcode value here we 
                            an also return some other calculated value or 
                              may be the address of object on which it is invoked 
                                it depends on how we implement hashcode() method.*/ 
    }
}

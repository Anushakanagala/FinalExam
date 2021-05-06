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
public class ques11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // creating the Objects of Food class with objects food1 and food2
        Food food1 = new Food("Panneer Biryani", 250);
        Food food2 = new Food("Panneer Biryani", 250);
          
        // comparing above created Objects.
        if(food1.hashCode() == food2.hashCode())
        {
  
               if(food1.equals(food2))
                System.out.println("Both Objects are equal. ");
            else
                System.out.println("Both Objects are not equal. ");
      
        }
        else
        System.out.println("Both Objects are not equal. ");
    }
    
}

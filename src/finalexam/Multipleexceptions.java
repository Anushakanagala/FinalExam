/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalexam;

/**
 *
 * @author Anudsha Kanagala
 */
public class Multipleexceptions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                   try{
	         int arr[]=new int[7];
	         arr[4]=30/0;
	         System.out.println("Last Statement of try block");
	      }
	      catch(ArithmeticException exe){
	         System.out.println("You can't divide a number by zero");
	      }
	      catch(ArrayIndexOutOfBoundsException aibe){
	         System.out.println("Accessing array elements out of bounds");
	      }
	      catch(Exception exc){
	         System.out.println("Some Other Exception");
	      }
	      System.out.println("Out of the try-catch block");

    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalexam;

import java.util.Scanner;

/**
 *
 * @author Anusha Kanagala
 */
public class ques7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
		Scanner sc = new Scanner(System.in);   // Create a Scanner

		
		int[] array = getArray();  // Invoke getArray method

		
		System.out.print("Enter the index of the array: ");  
                                       // Prompt the user to enter the index of the array
		try {
			
			System.out.println("The corresponding element value is " + 
				array[sc.nextInt()]); // Display the corresponding element value
		}
                
		catch (ArrayIndexOutOfBoundsException exc) {
			System.out.println("Out of Bounds.");
		}
	}

	/** Returns an array with 100 randomly chosen integers */
    
	public static int[] getArray() {
		int[] array = new int[100];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int)(Math.random() * 100) + 1;
		}
		return array;
    }
    
}

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
public class ques5{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

		ComparableCircle circle1 = new ComparableCircle(7);
		ComparableCircle circle2 = new ComparableCircle(5);
		
		int value=circle1.compareTo(circle2);
		
		if(value>0) {
			System.out.println("Max circle is circle1 with radius:  "+circle1.getRad());
		}else {
			System.out.println("Max circle is circle2 with radius:  "+circle2.getRad());
		}
	}

}

    

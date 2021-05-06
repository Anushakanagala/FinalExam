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
public class Throw2 {
    static void Age(int age) {
    if (age < 18) {
      throw new ArithmeticException("Sorry!, You are not accessed to enter the pub.");
    }
    else {
      System.out.println("Congrats! - Access granted");
    }
  }


 public static void main(String[] args) {
        Age(19);
    }
}
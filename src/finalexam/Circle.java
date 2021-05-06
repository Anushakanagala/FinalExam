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
public class Circle {

	private double rad;
	private double pi = 3.14;

	public Circle(double rad) {
		super();
		this.rad = rad;
	}

	public Double getArea() {
		return pi * rad * rad;
	}

	public double getRad() {
		return rad;
	}

	public void setRadius(double rad) {
		this.rad = rad;
	}
	
}
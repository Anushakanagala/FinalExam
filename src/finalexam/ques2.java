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
public class ques2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        GeometricObject geoobject0 = new Square(5.0);
        GeometricObject geoobject1 = new Square(7.5);
        GeometricObject geometric2 = new Square(10.0);
        GeometricObject geoobject3 = new Square(4.5);
        GeometricObject geoobject4 = new Square(8.0);

        GeometricObject[] array = new GeometricObject[5];

        array[0] = geoobject0;
        array[1] = geoobject1;
        array[2] = geometric2;
        array[3] = geoobject3;
        array[4] = geoobject4;

        
        for (int i = 0; i < array.length; i++) {
            System.out.print("Area of Square " + i + " is: " + array[i].Area()
                    + " and ");
          array[i].howToColor();    
        }
        
    }
    
}

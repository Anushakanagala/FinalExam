/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalexam;

import java.io.FileInputStream;

/**
 *
 * @author Anusha Kanagala
 */
public class ques6a {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FileInputStream  a = null;
	
        a = new FileInputStream("C:/inputfile.txt"); /*This constructor throws 
                                              FileNotFoundException which
                                                       is a checked exception
                                                                       */
	int b; 

	
	while(( b = a.read() ) != -1) /* Method read() of FileInputStream 
                                                 class also throws a checked  
                                                        exception: IOException
                                                                */
	{ 
		System.out.print((char)b); 
	} 

	
	a.close(); /*The method close()
                            closes the file input stream
	                                It throws IOException*/
    }
    
}

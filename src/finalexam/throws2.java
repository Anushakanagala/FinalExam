/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalexam;

import java.io.IOException;

/**
 *
 * @author Anusha Kanagala
 */
public class throws2 {
    void a()throws IOException{  
	    throw new IOException("checked exception: device error");//checked exception  
	  }  
	  void b()throws IOException{  
	    a();  
	  }  
	  void c(){  
	   try{  
	    b();  
	   }catch(Exception e){System.out.println("exception is handled");}  
	  }  
	 

}

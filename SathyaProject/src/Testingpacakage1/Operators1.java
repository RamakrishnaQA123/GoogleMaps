package Testingpacakage1;

import java.util.ArrayList;
import java.util.List;

public class Operators1 {

	public static void main(String[] args) {

	
      List	value=new ArrayList<>();	
      value.add("Selenium");
      value.add("Testing");
      value.add(100);
      value.add('$');
      
      System.out.println(value.size());
      
      for(int i=0;i<value.size();i++){
    	  System.out.println(value.get(i));
      }
		
	}

}

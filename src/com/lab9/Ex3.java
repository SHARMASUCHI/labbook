package com.lab9;
import java.util.function.BiPredicate;
public class Ex3 {
  public static void main (String[] args){
	  BiPredicate<String,String> fun=(str1,str2)->{
			if(str1.equals("Admin") && str2.equals("789"))
				return true;
			else
				return false;
    
	  };
		boolean res1= fun.test("Admin", "789");
		boolean res2= fun.test("Admin", "789");
		boolean res3= fun.test("admin", "123");
		boolean res4= fun.test("admin", "456");
		System.out.println(res1+" "+res2+" "+res3+" "+res4);
	}

}

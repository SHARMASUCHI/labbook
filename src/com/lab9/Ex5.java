package com.lab9;

import java.util.function.Function;

class Factorial{
	public int fact(int no) {
		int f=1,i;
		if(no>=1)
		{
			for(i=1;i<=no;i++) {
				f=f*i;
			}
			return f;
		}
		else
			return 1;
	}
}
public class Ex5 {

	public static void main(String[] args) {
		Function<Integer,Integer> fun= new Factorial()::fact;
		int no=fun.apply(9);
		int no1=fun.apply(5);
		System.out.println(no+" "+no1);
	}

}

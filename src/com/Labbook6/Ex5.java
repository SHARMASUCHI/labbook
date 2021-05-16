package com.Labbook6;
import java.util.*;


public class Ex5 {

	public static void main(String[] args) {
		Integer array[] = {1,10,20,11,5,6,7};
		System.out.println("Second Smallest:"+ getSecondSmallest(array,7));
	}
	public static int getSecondSmallest(Integer[] array,int total)
	{
		List<Integer>list=Arrays.asList(array);
		Collections.sort(list);
		int element= list.get(1);
		return element;
	}
}

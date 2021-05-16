package com.Labbook6;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
 

public class Ex7{
	static int[] getsorted(int[] arr)
	{
		ArrayList<Integer> ls = new ArrayList<Integer>();
		for(int i : arr)
		{
	 ls.add(i);
 }
 Collections.reverse(ls);
 System.out.println("reverse list is" +ls);
 Arrays.sort(arr);
 return arr;
	}
	public static void main(String[]args)
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the size of array;");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the elements of array|:");
		for(int i=0;i<n;i++)
		{
			arr[i]= sc.nextInt();
		}
		sc.close();
		int[] sortedArray = getsorted(arr);
	System.out.println("sorted array is :");
		for(int i : sortedArray)
		{
			System.out.print(i);
		}
		sc.close();
	}
}
 
 
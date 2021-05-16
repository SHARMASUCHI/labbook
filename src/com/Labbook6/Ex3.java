package com.Labbook6;
import java.util.*;
 
public class Ex3 {
 
  public static HashMap<Integer,Integer> getSquares(int[]array)
  {
    HashMap<Integer, Integer> sq = new HashMap<Integer, Integer>();
 
    for (int n: array) {
      sq.put( n, n*n);
    }
    return sq;
  }
 
  public static void main(String[] args) {
	  
    int array[] = new int[]{1,2,3,4,5,6,7,8,9};
    HashMap<Integer, Integer> sq = getSquares(array);
 
  
	Iterator<Integer> it = sq.keySet().iterator();
    while(it.hasNext()){
    Integer values = it.next();
      System.out.println(values + " : " + sq.get(values));
    }
  }
}

 
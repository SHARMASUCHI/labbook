package com.Labbook6;

import java.util.HashMap;
import java.util.Map;


public class Ex2 {
	
		static void countChars(String inputString)
		{
			HashMap<Character,Integer> charCountMap = new HashMap<Character,Integer> ();
			char[] arr = inputString.toCharArray();
			
			for(char c : arr)
			{
				if(charCountMap.containsKey(c))
				{
					charCountMap.put(c,charCountMap.get(c)+1);
				}
				else {
					charCountMap.put(c,1);
				}
					
				}
				for(Map.Entry entry : charCountMap.entrySet()){
					System.out.println(entry.getKey() +" "+entry.getValue());
				}
					
				
			}
			public static void main(String[] args)
			{
				String str = "Suchi";
						countChars(str);
				
			}
					
	}


	
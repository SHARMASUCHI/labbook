package com.lab9;
interface Power{  
        int powerofnumbers(int a,int b);  
    }  
      
    public class Ex1{  
        public static void main(String[] args) {  
              
            // Multiple parameters in lambda expression  
            Power p=(a,b)->
            {
            	int pow=1;
            	for(int i=0;i<b;i++) {
            		pow*=a;
            		
            	}
            
            return pow;
            };
            System.out.println(p.powerofnumbers(7,3));  
              
            
        }  
    }  
 package com.Labbook6;

import java.util.HashMap;
import java.util.Set;
public class Ex4
{
       public HashMap<String,String> getStudent(HashMap<String,Integer> stu)
       {
              HashMap<String,String> medal = new HashMap<>();
              Set<String> set = stu.keySet();
              for(String s:set)
              {
                     Integer marks = stu.get(s);
                     if(marks>=90)
                     {
                           medal.put(s,"Gold");
                     }
                     else if(marks >=80&&marks<90)
                     {
                           medal.put(s,"Silver");
                     }
                     else if(marks>=70&&marks<80)
                     {
                           medal.put(s,"Bronze");
                     }
              }
              return medal;
       }
       public static void main(String[] ar)
       {
              HashMap<String,Integer> stu = new HashMap<>();
              Ex4 p = new Ex4();
              
              stu.put("suchi_eee1719221052",90);
              stu.put("richa_eee1719221053",76);
              stu.put("tanu_eee171922104",77);
              stu.put("anam_eee1719221056",78);
              
              System.out.println(p.getStudent(stu));
       }

	}



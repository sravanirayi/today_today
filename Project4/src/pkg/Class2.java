package pkg;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;

public class Class2
{
public static void main(String[] args) 
{
 HashMap<Integer, String> hm=new HashMap<Integer,String>();
 hm.put(2, "Deepak");
 hm.put(1,"Testing");
 hm.put(14, "Selenioum");
 hm.put(3,"Appium");
 
  Set<Integer> all=  hm.keySet();
  
  for(Integer i : all)
  {
	  System.out.println(hm.get(i));
  }
  
}
	
}

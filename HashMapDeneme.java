package com.didem.examples;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDeneme {
	 public static void main(String[] args) 
	    {
	        
	         
	        HashMap<String, String> map = new HashMap<String, String>();
	         
	        
	         
	        map.put("ONE", "AAA");
	         
	        map.put("TWO", "BBB");
	         
	        map.put("THREE", "CCC");
	         
	        map.put("FOUR", "DDD");
	         
	        map.put("FIVE", "EEE");
	         
	       
	         
	
	        //Get Key Value        
	        Set<Entry<String, String>> keyValueSet = map.entrySet();
	                 
	        for (Entry<String, String> entry : keyValueSet) 
	        {
	            System.out.println(entry.getKey()+" : "+entry.getValue());
	        }
	                 
	     //Valuelarý deðiþtirme
	         
	        map.replace("FOUR", "DDD", "444");
	        map.remove("ONE", "CCC"); // remove with key + value
	        map.remove("ONE"); // remove with key
	         
	        System.out.println("HashMap After Replace :");
	        
	        //deðiþmiþ haliyle yazdýrma
	                 
	        for (Entry<String, String> entry : keyValueSet) 
	        {
	            System.out.println(entry.getKey()+" : "+entry.getValue());
	        }
	        
	        
	        //yalnýzca keyleri cekme
	        Set<String> keySet = map.keySet();
	         
	        for (String key : keySet) 
	        {
	            System.out.println(key);
	        }
	        
	        //Retrieving the number of key-value pairs
	         
	        System.out.println(map.size());      //Output : 5

	        //Clearing the map
	         
	        map.clear();
	         
	        //Checking the number of key-value pairs after clearing the map
	         
	        System.out.println(map.size());      //Output : 0
	        

	    }    

}

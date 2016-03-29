package org.cghr.utility;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class PhysicianMapper {
	
	public static Map<String,String> physicians=new HashMap<String,String>();
	static String file="D:\\mongoRecords\\phasePhysicianDump.json";
	
	public static Map<String,String> mapPhysicians() throws FileNotFoundException, IOException, ParseException{
		
		JSONParser parser = new JSONParser();
		JSONArray a = (JSONArray) parser.parse(new FileReader(file));
        System.out.println("Size is : "+a.size());
        
        int counter=0;
        
		  for(int i=0;i<a.size();i++){
			Object o=a.get(i);  
		    JSONObject physician = (JSONObject) o;		    
		   	String _id=(String) physician.get("_id");
		   	String physicianId=(String) physician.get("physicianId");
		   			
            System.out.println("_id :"+_id+"      physicianId :"+physicianId);	
		    counter++;
		    physicians.put(_id, physicianId);
		  }
		  
		  System.out.println("Total Count is : "+counter);	
		
		return physicians;
	}

}

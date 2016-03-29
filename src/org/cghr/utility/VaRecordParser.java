package org.cghr.utility;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.cghr.model.VaRecord;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class VaRecordParser {
	
	static Map<String,VaRecord> vaRecords=new HashMap<String,VaRecord>();
	static String file="D:\\mongoRecords\\vaRecordsDump.json";
	
	public static Map<String,VaRecord> parseVaRecords() throws FileNotFoundException, IOException, ParseException{
		
		JSONParser parser = new JSONParser();
		JSONArray a = (JSONArray) parser.parse(new FileReader(file));
        System.out.println("Size is : "+a.size());
        
        int counter=0;
        
		  for(int i=0;i<a.size();i++){
			Object o=a.get(i);  
		    JSONObject vaRecord = (JSONObject) o;
		    
		    String _id=((String) vaRecord.get("_id")).substring(10, 34);
		    String deathId = (String) vaRecord.get("deathId");
		    String sex =  (String) vaRecord.get("sex");
		    float ageInYears =  Float.parseFloat(vaRecord.get("ageInYears").toString());
		    
		    VaRecord v=new VaRecord();
		    v.set_id(_id);
		    v.setDeathId(deathId);
		    v.setAgeInYears(ageInYears);
		    v.setSex(sex);
		    
		    vaRecords.put(_id, v);
		    
            System.out.println("deathId : "+deathId+"  -> sex :"+sex+"  > ageInYears :"+ageInYears+"  > : "+_id);	
		    counter++;
		  }
		  
		  System.out.println("Total Count is : "+counter);
				
		  return vaRecords;
	}

}

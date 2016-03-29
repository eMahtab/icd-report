package org.cghr;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;

import org.cghr.model.VaRecord;
import org.cghr.utility.PhysicianMapper;
import org.cghr.utility.VaRecordParser;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReportGenerator {
	
	static String file="D:\\mongoRecords\\rhimeReportDump.json";
	

	public static void generateReport() throws FileNotFoundException, IOException, ParseException{
	
		Map<String,VaRecord> vaRecords=VaRecordParser.parseVaRecords();
		Map<String,String> physiciansMap=PhysicianMapper.mapPhysicians();
		
		JSONParser parser = new JSONParser();
		JSONArray a = (JSONArray) parser.parse(new FileReader(file));
        System.out.println("Size is : "+a.size());
        
        int counter=0;
        
		  for(int i=0;i<1;i++){
			//Object o=a.get(i);  
		    JSONObject rhimeReport = (JSONObject) a.get(i);  
		    
		    String recordId=(String)rhimeReport.get("recordId");
		    //System.out.println("Record Id "+recordId);
		    
		    VaRecord vaRecord=vaRecords.get(recordId);
		    System.out.println(vaRecord.getDeathId());
		    System.out.println(vaRecord.getAgeInYears());
		    System.out.println(vaRecord.getSex());
		    
		    JSONArray tasks = (JSONArray) rhimeReport.get("tasks");
		   // System.out.println("Tasks Size : "+tasks.size());
		    for(int t=0;t<tasks.size();t++){		    	
		    	//Object o=tasks.get(t);  
			    JSONObject task = (JSONObject)tasks.get(t);
		    	String physician=(String)task.get("physician");
		    	System.out.println("Physician :"+physician);
		    }
		    
		    System.out.println("_________________________________________________");
		  }
        
		
	}

}

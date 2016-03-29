package org.cghr;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.cghr.utility.PhysicianMapper;
import org.cghr.utility.VaRecordParser;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Test {

	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {
		
		/*JSONParser parser = new JSONParser();
		JSONArray a = (JSONArray) parser.parse(new FileReader("D:\\rhimeReportDump.json"));
        System.out.println("Size is : "+a.size());
        int counter=0;
		  for(int i=0;i<a.size();i++){
			Object o=a.get(i);  
		    JSONObject person = (JSONObject) o;
		    Object name =  person.get("taskCount");
           // System.out.println(name);	
		    counter++;
		  }
		  System.out.println("Total Count is : "+counter);*/
		
		//VaRecordParser.parseVaRecords();
		
		//PhysicianMapper.mapPhysicians();
		
		ReportGenerator.generateReport();
		
	 }

}

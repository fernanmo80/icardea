package de.offis.health.icardea.cied.hl7.parser;

import java.io.BufferedReader;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.io.File;  
import java.io.FileWriter;  
import java.io.IOException;  

import java.util.regex.*;
//import org.apache.log4j.Logger;

public class WriteAndReadText {

    //private static String textPath="C:/Test";  
	static boolean flag=true;
	//public static String keywords_numenclature="(739568\\^)|(739712\\^)|(737824\\^)";  
	
    public static void readTextbyLine(String textname, String newtextname, String textPath, String newtextPath, String keywords){  
        File file=new File(textPath+File.separator+textname);
        BufferedReader reader = null;
        boolean result=false;
        try {  
            reader = new BufferedReader(new java.io.FileReader(file));  
            
            String templineString =null;// br.readLine(); 
            int obx_index=1;
            
            while ((templineString=reader.readLine()) != null) {  
            	//System.out.println("line " + line + ": " + templineString);
            	//line++;
            	flag=false;
                if(result=Pattern.compile(keywords).matcher(templineString).find()==true)
                	{
                	flag=true;
                		if (Pattern.compile("OBR\\|").matcher(templineString).find()==true){
                			obx_index=1;	 // reset OBX index for each ORU
                			//flag=true;
                		}
                	
                		if (Pattern.compile("OBX\\|").matcher(templineString).find()==true){
                			if (Pattern.compile(keywords).matcher(templineString).find()==true){
                				//System.out.println("this is the number "+ obx_index+"  "+templineString);
                				String oru_regEx="OBX\\|\\d+\\|";
                				Pattern p=Pattern.compile(oru_regEx);
                				Matcher m=p.matcher(templineString);
                				templineString=m.replaceAll("OBX\\|"+obx_index+"\\|");
                				obx_index++;
                				flag=true;
                				} 
                			else{
                				//System.out.println("......not....");
                				flag=false;
                				}
                	    }
                	
                		if (flag==true){ 
                			//System.out.println("this is the number "+ obx_index+"  "+templineString);
                			//System.out.println(templineString);
                			appendText(newtextname,newtextPath,templineString+'\n');
                	        }
                	}
                /*
                int j=0;
                while (j<keywords.length){
                	System.out.println(keywords[j]);
                if((templineString.indexOf(keywords[j]) !=-1)){
                	System.out.println(templineString);
                	appendText("new"+textname,templineString+'\n');
                	//return sb.toString();
                   }
                	j++;
                }*/
            }  
            reader.close();   
        } catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (reader != null) {
				try {
					reader.close();
				} catch (IOException e1) {
				}
			}
		}
	}
      

    public boolean writeText(String textname,String textPath, String date){  
        boolean flag=false;  
        File filePath=new File(textPath);  
        if(!filePath.exists()){  
            filePath.mkdirs();  
        }  
        try {  
            FileWriter fw =new FileWriter(textPath+File.separator+textname);  
            fw.write(date);  
            flag=true;  
            if(fw!=null)  
                fw.close();  
        } catch (IOException e) {  
            //LogInfo.error(this.getClass().getName(),e.getMessage(),e);  
            e.printStackTrace();  
        }  
  
        return flag;          
    }  

    public static boolean appendText(String textName,String textPath, String date){  
        boolean flag=false;  
        File filePath=new File(textPath);  
        if(!filePath.exists()){  
            filePath.mkdirs();  
        }  
        try {  
            FileWriter fw =new FileWriter(textPath+File.separator+textName,true);  
            fw.append(date);  
            flag=true;  
            if(fw!=null)  
                fw.close();  
        } catch (IOException e) {  
            //LogInfo.error(this.getClass().getName(),e.fillInStackTrace().toString());  
            e.printStackTrace();  
        }  
        return flag;      
    }  
    
    public static int getTimeStamp() {
        long longTime = System.currentTimeMillis();
        return (int) (longTime);
    }
    /*
    public String getTextPath() {  
        return textPath;  
    }  
    public void setTextPath(String textPath) {  
        this.textPath = textPath;  
    }
    */
    /*
    public static void main(String[] args) {
		String fileName = "HL7_ORU_input.hl7";
		WriteAndReadText writeandreadtext =new WriteAndReadText();
		writeandreadtext.readTextbyLine(fileName, "739568");
		
	}
	*/
}
package com.trulia.util;
import java.io.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.Logger;

public class TruliaUtils {
	 public static org.apache.log4j.Logger log = Logger.getLogger(TruliaUtils.class);
	     
	     
   static HashMap<String, String> _locators;
   static Map<String, String> map = new HashMap<String, String>();
   static 	Properties prop = new Properties();
	public static String _locator;
	public static Map<String, String> readProp(String file)
	{
		 log.trace("Trace Message!");
		FileInputStream input;
		try {
			input = new FileInputStream(new File(file));
			prop.load(input);	
			for (String key : prop.stringPropertyNames()) 
			{
				 log.trace("got locators");

				map.put(key, prop.getProperty(key));
			}
	
			} 
			catch (FileNotFoundException e) {

				e.printStackTrace();
			}
			catch (IOException e) {
				e.printStackTrace();
			}
			return map;
	}
  public static String getValue(String key) {
        try {

        	String value=prop.getProperty(key);
        	return value;
        } 
        catch (Exception ex) {
        }
        return "";
 }
  public static void main(String[] args) {

		PropertyConfigurator.configure("log4j.properties");
log.fatal("Trying to log Trulia");
	  Map<String, String> _locator = TruliaUtils.readProp("Trulia.properties");
	
	 log.trace("got locators");
//log.error("",.log. t);
	String value = TruliaUtils.getValue("link");
	
	
	}
}


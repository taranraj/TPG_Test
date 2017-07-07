package com.test.tpg;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.google.common.base.Stopwatch;

public class IPValidationRegex {
	
	private static Pattern pattern;
    private static Matcher matcher;
    
    private static final String PATTERN =
    		"^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
    		"([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
    		"([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
    		"([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";
    
    public static boolean validate(final String ip){
      pattern = Pattern.compile(PATTERN);
  	  matcher = pattern.matcher(ip);
  	  return matcher.matches();
      }
    
    public static void main(String a[]){
    	Stopwatch timer = new Stopwatch();
    	System.out.println("Time start for the method : "+timer.start());
    	File f = null;
    	BufferedReader b = null;
    	try {

             f = new File("src/com/test/resources/ipaddress.txt");
             b = new BufferedReader(new FileReader(f));
            String readLine = "";
            while ((readLine = b.readLine()) != null) {
                boolean isValidIpAddress = validate(readLine);
            	System.out.println("IP Address is : "+readLine+ ";" +"Is it Valid ? : "+isValidIpAddress);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    	finally{
    		try {
				b.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
    	}
    	System.out.println("Timer stop for the method : "+timer.stop());
    }
}

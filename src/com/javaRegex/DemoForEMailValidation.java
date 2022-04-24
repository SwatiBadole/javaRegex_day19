package com.javaRegex;
import java.util.Scanner;
import java.util.regex.*;
public class DemoForEMailValidation {
	 
	public static void main(String[] args) {
	       try (Scanner sc =new Scanner(System.in)){
	    	   {
	    		   while(true) {
	    			   System.out.println("Enter  the regex pattren");
	    			   String rgexPattern=sc.nextLine();
	    			   Pattern pattern= Pattern.compile(rgexPattern);
	    			   Matcher matcher=pattern.matcher("welcome");
	    			   boolean Found= false;
	    			   while(matcher.find()) {
	    				   System.out.println("found the text" +matcher.group() +"starting  at inex"+matcher.start()+"and ending index"+matcher.end());
	    				   Found =true; 
	    			   }
	    			   if(!Found) {
	    				   System.out.println("match not found");
	    			   }
	    			   }
	    			   
	 	    	   }
			} 
		}	
	}



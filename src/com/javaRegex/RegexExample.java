package com.javaRegex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Java program to validate a username
//using Regular Expression or ReGex
public class RegexExample {
	
	public static boolean isvalidUsername(String name){
		//regex to check valid username
	    //	 String regex = "^[A-Za-z]\\w{5,29}$";
		String regex = " ^[]A-Za-z]\\w{5,29}$";
	
		//	 Pattern p = Pattern.compile(regex);
		Pattern p=Pattern.compile(regex);
		// If the username is empty
        // return false
		if(name == null) {
			return false;
		}
		 Matcher m = p.matcher(name);
		 return m.matches();
		
	}

	public static void main(String[] args) {
		
		 // Test Case: 1
        String str1 = "Geeksforgeeks";
        System.out.println(isvalidUsername(str1));
        
        String str3 = "1Geeksforgeeks";
        System.out.println(isvalidUsername(str3));
  
        // Test Case: 3
        String str5 = "Ge";
        System.out.println(isvalidUsername(str5));
	}

}

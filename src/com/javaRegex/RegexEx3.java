package com.javaRegex;

import java.util.regex.*;

public class RegexEx3 {

	public static void main(String[] args) {
	
		Pattern pattern=Pattern.compile(".xx.");
		Matcher matcher=pattern.matcher("sxx1");
		System.out.println("String matches the given regex :"+ matcher.matches());
		
		System.out.println("*********************************");
		Pattern pattern1=Pattern.compile("[xyz]");
		Matcher matcher1=pattern.matcher("wbcs"); //false(not x or y or z)
		System.out.println("String matches the given regex :"+ matcher1.matches());
		System.out.println("*********************************");
		Pattern pattern2=Pattern.compile("[xyz]");
		Matcher matcher2=pattern.matcher("x");
		System.out.println("String matches the given regex:"+ matcher2.matches());
	
		System.out.println("**********************************");
		
		System.out.println(Pattern.matches("[xyz]", "wbcd"));//false(x,y and z not in given string)
		System.out.println(Pattern.matches("[xyz]", "x"));//true(among x comes one time)
        System.out.println(Pattern.matches("[xyz]", "xxyyzz"));
        System.out.println("***********************************");
        System.out.println("? quantifire ...");
        System.out.println(Pattern.matches("[ayz]", "a"));//true (a or y or z comes one line)
        System.out.println(Pattern.matches("[ayz]", "ayyzz"));
        
        System.out.println("************************************");
        System.out.println("+ quantifire .....");
        System.out.println(Pattern.matches("[ayz]+", "a"));//true (a or y or z or more times)
        
        System.out.println("************REGEX METACHARACTER**********");//meta character work as shortcut

        System.out.println(Pattern.matches("d", "abc"));
        System.out.println(Pattern.matches("d", "1"));
        System.out.println(Pattern.matches("d", "4422"));      
        
        System.out.println(Pattern.matches("D", "abc"));
        System.out.println(Pattern.matches("D", "m")); 
        
        
	}

}

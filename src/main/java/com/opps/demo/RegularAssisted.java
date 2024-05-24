package com.opps.demo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularAssisted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		String pattern= "[a-z]";//Basically gives us the restriction of what we should search for
		String check= "Regular Expresions"; //We given an expression
		Pattern p = Pattern.compile(pattern);//looking for words with lower-case letters
		Matcher c = p.matcher(check);//prepares to look for the lower-case letters
		
		while(c.find()) //Checks to see if they form words of lower-case letters 
		{
			System.out.println(check.substring(c.start(), c.end()));
		}
	}

}

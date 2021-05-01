package com.java;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class A {
public static void main(String[] args) {
	
	/*
	String str=" abc d 123490pqr 54897";
	Pattern pattern = Pattern.compile("\\w+([0-9]+)\\w+([0-9]+)");
	Matcher matcher = pattern.matcher(str);
	for(int i = 0 ; i < matcher.groupCount(); i++) {
	  matcher.find();
	  System.out.println(matcher.group());

	
	
	*/
	String line = "This order was32354 placed 343434for 43411 QT ! OK?";
    String regex = "[^\\d]+";

    String[] str = line.split(regex);
  //  String required = "";
    for(String st: str){
        System.out.println(st);
    }
	
	
	
    
	System.out.println("hi..this is done by sg162023");

	System.out.println("hi..this is done by git side   ");
	System.out.println("hi..this is done by  git side new changes... ");
	
	System.out.println("hi..this is done by sg162023,,,,,,dev 2 ");
	
	System.out.println("hi..this is done by sg162023,  at 28 .4.2021,,,,,dev 2 ");


}
}

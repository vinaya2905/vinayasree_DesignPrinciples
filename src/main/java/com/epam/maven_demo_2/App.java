package com.epam.maven_demo_2;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
    	Scanner sc=new Scanner(System.in);
    	int a=sc.nextInt();
    	int b=sc.nextInt();
    	char c = sc.next().charAt(0);
    	if(c=='+') {
    		Addition add=new Addition();
    		System.out.println("Addition of two numbers is :"+add.answer(a,b));
    	}
    	else if(c=='-') {
    		Subtraction sub=new Subtraction();
    		System.out.println("Subtraction of two numbers is :"+ sub.answer(a, b));
    	}
    	else if(c=='*') {
    		Product mul=new Product();
    		System.out.println("Product of two numbers is :"+ mul.answer(a, b));
    	}
    	else if(c=='/') {
    		Division div=new Division();
    		if(div.answer(a, b)==0) {
    			System.out.println("Division By zero Exception");
    		}
    		else {
    			System.out.println("Division of two numbers is :"+div.answer(a, b));
    		}
    	}
    	sc.close();
    }
}

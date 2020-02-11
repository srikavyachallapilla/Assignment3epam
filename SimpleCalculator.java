package com.epamwork.calculator;
import java.util.*;
public class SimpleCalculator {
	public static Double add(double n1, double n2) {
		// TODO Auto-generated method stub
		double s=n1+n2;
		return s;
	}
	public static Double sub(double n1, double n2) {
		// TODO Auto-generated method stub
		double s=n1-n2;
		return s;
	}public static Double mul(double n1, double n2) {
		// TODO Auto-generated method stub
		double s=n1*n2;
		return s;
	}public static Double div(double n1, double n2) {
		// TODO Auto-generated method stub
		double s=n1/n2;
		return s;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		double n1=sc.nextDouble();
		double n2=sc.nextDouble();
		char c=sc.next().charAt(0);
		switch(c) {
		case '+':
			System.out.println("the sum of two numbers are"+add(n1,n2));
		         break;
		         
		case '-':
			System.out.println("the subtaction of two numbers are"+sub(n1,n2));
		         break;
		case '*':
			System.out.println("the multiplication of two numbers are"+mul(n1,n2));
		         break;
		case '/':
			System.out.println("the division of two numbers are"+div(n1,n2));
		         break;
		default:
			System.out.println("invalid operator");
		}

	}

}

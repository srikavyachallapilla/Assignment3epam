package com.epamwork.calculator;

import java.util.Scanner;

public class Solidprinciple extends Calculation{
	public static void main(String[] args) {
		Calculation op=new Solidprinciple();
		Scanner sc=new Scanner(System.in);
		double a[]=new double[2];
		for(int i=0;i<2;i++) {
			a[i]=sc.nextDouble();
		}
		char c=sc.next().charAt(0);
		switch(c) {
		case '+':
			System.out.println(op.add(a[0],a[1]));
		         break;
		         
		case '-':
			System.out.println(op.sub(a[0],a[1]));
		         break;
		case '*':
			System.out.println(op.mul(a[0],a[1]));
		         break;
		case '/':
			System.out.println(op.div(a[0],a[1]));
		         break;
		default:
			System.out.println("invalid operator");
		}
	}

	@Override
	public double add(double n1, double n2) {
		// TODO Auto-generated method stub
		double s=n1+n2;
		return s;

	}

	@Override
	public double sub(double n1, double n2) {
		// TODO Auto-generated method stub
		double s=n1-n2;
		return s;
		}

	@Override
	public double mul(double n1, double n2) {
		// TODO Auto-generated method stub
		double s=n1*n2;
		return s;
	}

	@Override
	public double div(double n1, double n2) {
		// TODO Auto-generated method stub
		double s=n1/n2;
		return s;
	}

}

package com.turing.jdev.generics.test;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args){
		
		ArrayList<Integer> items = new ArrayList<Integer>();
		items.add(1);
		items.add(2);
		items.add(3);
		// items.add("UN TEXTO CUALQUIERA");
		items.add(4);
		items.add(5);
		
		printDoubled(items);
		
	}
	
	private static void printDoubled(ArrayList<Integer> list){
		for(int num : list){
			System.out.println(num * 2);
		}
	}
}

package com.turing.jdev.generics.test;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args){
		
		ArrayList items = new ArrayList();
		items.add(1);
		items.add(2);
		items.add(3);
		items.add("UN TEXTO CUALQUIERA");
		items.add(4);
		items.add(5);
		
		printDoubled(items);
		
	}
	
	private static void printDoubled(ArrayList list){
		for(Object obj : list){
			System.out.println((Integer) obj * 2);
		}
	}
}

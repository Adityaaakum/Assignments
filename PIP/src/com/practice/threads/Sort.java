package com.practice.threads;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Sort {
	
	public static void main(String[] args) {
		
		ArrayList<Integer>l= new ArrayList<Integer>();
		l.add(31);
		l.add(39);
		l.add(12);
		l.add(80);
		System.out.println(l);
		List<Integer>l2= new ArrayList<Integer>();
		List<Integer>i=new ArrayList<Integer>();
		 i=l.stream().sorted().collect(Collectors.toList());
			System.out.println(i);
		
	}

}

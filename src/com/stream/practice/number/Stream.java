package com.stream.practice.number;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Stream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//finding even number
		System.out.println("*****************************************************************");
		List<Integer> list=Arrays.asList(10,15,8,49,25,98,32,15,98,8);
		list.stream().filter(n -> n%2 == 0).forEach(System.out::println);
		
		System.out.println("*****************************************************************");
		//number starting with 1 using stream
		list.stream().map(s -> s +"").filter(s -> s.startsWith("1")).forEach(System.out::println);
		
		System.out.println("*****************************************************************");
		// find duplicate element
		Set<Integer> set= new HashSet();
		list.stream().filter(n -> !set.add(n)).forEach(System.out::println);
		
		long count= list.stream().count();
		System.out.println("count : "+count);
		
	}

}



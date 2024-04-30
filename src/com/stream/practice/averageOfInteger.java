package com.stream.practice;

import java.util.Arrays;
import java.util.List;

public class averageOfInteger {

	public static void main(String[] args) {
		List<Integer> li=Arrays.asList(2,4,5,9,6,19,32,84);
		
		System.out.println("List of Integer is : "+li);
		
		double average=li.stream().mapToDouble(Integer::doubleValue)
				.average()
				.orElse(0.0);
		System.out.println("Average of li is: "+average);

	}

}

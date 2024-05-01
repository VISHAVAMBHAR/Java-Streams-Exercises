package com.stream.practice.number;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class removeDuplicate {

	public static void main(String[] args) {
		List<Integer> num= Arrays.asList(5,8,66,2,5,33,66,4,2,98,66,8);
		
		List<Integer> distinctNum=num.stream()
				.distinct()
				.collect(Collectors.toList());
		System.out.println("Distinct list of num : "+distinctNum);
		

	}

}

package com.stream.practice.number;

import java.util.Arrays;
import java.util.List;

public class SumOfEvenOdd {

	public static void main(String[] args) {
		
		List<Integer> num= Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		int sumOfEven = num.stream().filter(n -> n%2==0)
				.mapToInt(Integer::intValue)
				.sum();
		System.out.println("Sum of even numbers : "+ sumOfEven);
		
		int sumOfOdd = num.stream().filter(n -> n%2!=0)
				.mapToInt(Integer::intValue)
				.sum();
		System.out.println("Sum of odd numbers : "+ sumOfOdd);
		

	}

}

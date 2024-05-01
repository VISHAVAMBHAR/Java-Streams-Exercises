package com.stream.practice.number;

import java.util.Arrays;
import java.util.List;

public class findSecondSmallestLargest {

	public static void main(String[] args) {
	    List < Integer > nums = Arrays.asList(1, 17, 54, 14, 14, 33, 45,5);
	    System.out.println("List of numbers: " + nums);
	    
	    Integer secondSmallest= nums.stream()
	    		.distinct()
	    		.sorted()
	    		.skip(1)
	    		.findFirst()
	    		.orElse(null);
	    System.out.println("Second smallest element: " + secondSmallest);
	    
	    Integer secondLargest = nums.stream()
	    		.distinct()
	    		.sorted((a,b) -> Integer.compare(b, a))
	    		.skip(1)
	    		.findFirst()
	    		.orElse(null);
	    System.out.println("Second smallest element: " + secondLargest );

	}

}

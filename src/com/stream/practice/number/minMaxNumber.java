package com.stream.practice.number;

import java.util.Arrays;
import java.util.List;

public class minMaxNumber {

	public static void main(String[] args) {
	    List < Integer > nums = Arrays.asList(1, 17, 54, 14, 14, 33, 45,5);
	    System.out.println("List of numbers: " + nums);
	    
	    Integer minNum=nums.stream().min(Integer::compare)
	    		.orElse(null);
	    System.out.println("Minimum value of the said list: " + minNum);
	    
	    Integer maxNum=nums.stream().max(Integer::compare)
	    		.orElse(null);
	    System.out.println("Minimum value of the said list: " + maxNum);

	}

}

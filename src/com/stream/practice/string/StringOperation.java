package com.stream.practice.string;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StringOperation {

	public static void main(String[] args) {
		List<String> colors=Arrays.asList("red","green","Blue",
				"ORANGE","YELLO","WHITE","pink","gray","purpule","black");
		System.out.println("list of colors : "+colors);
		

		List<String> upperCaseString = colors.stream()
				.map(String::toUpperCase)
				.collect(Collectors.toList());
		System.out.println("UpperCase list : "+upperCaseString);
		
		List<String> lowerCaseString = colors.stream()
				.map(String::toLowerCase)
				.collect(Collectors.toList());
		System.out.println("LowerCase list : "+lowerCaseString);
		char b='g';
		
		long count=colors.stream().filter(s -> s.startsWith(String.valueOf(b)))
		.count();
		System.out.println("count "+count);
		
		System.out.println(" Sorting list of strings in ascending order");
		List<String> ascendingOrder = lowerCaseString.stream()
				.sorted()
				.collect(Collectors.toList());
		System.out.println("Sorted in Ascending Order: " + ascendingOrder);
		
		System.out.println("Sorting list of strings in descendingOrder  order");
		List<String> descendingOrder  = lowerCaseString.stream()
				.sorted(Comparator.reverseOrder())
				.collect(Collectors.toList());
		System.out.println("Sorted in descendingOrder  Order: " + descendingOrder );

	}

}

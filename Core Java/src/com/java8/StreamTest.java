package com.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest {
	
	public static void main(String[] args) {
		
		Collection<String> collection = Arrays.asList("a", "b", "c");
		
		Stream streamOfCollection = collection.stream();
		
		System.out.println("streamOfCollection = " + streamOfCollection.collect(Collectors.toList()));
		
		//--------------------------------------------------------------------------------------------------------
		
		Stream<String> streamOfArray = Stream.of("A", "b", "D");
		System.out.println("streamOfArray = " + streamOfArray.collect(Collectors.toList()));
		
		Stream streamOfArray1 = Stream.of(1, "Manish", "34.78", 23.78);
		System.out.println("streamOfArray1 = " + streamOfArray1.collect(Collectors.toList()));
		
		
		String[] arr = new String[]{"a", "b", "c"};
		Stream<String> streamOfArrayFull = Arrays.stream(arr);
		Stream<String> streamOfArrayPart = Arrays.stream(arr, 1, 3);
		
		//--------------------------------------------------------------------------------------------------------
		
		Stream<Integer> streamIntBuilder = Stream.<Integer>builder().add(1).add(55).add(34).build();
		System.out.println("streamIntBuilder = " + streamIntBuilder.collect(Collectors.toList()));
		
		Stream<String> streamStringBuilder = Stream.<String>builder().add("Manish").add("i").add("Keshav").build();
		System.out.println("streamStringBuilder = " + streamStringBuilder.collect(Collectors.toList()));
		
		Stream streamBuilder = Stream.builder().add(1).add("Manish").add(34.89).build();
		System.out.println("streamBuilder = " + streamBuilder.collect(Collectors.toList()));

		//--------------------------------------------------------------------------------------------------------
		
		List<String> listStr = new ArrayList<String>();
		listStr.add("Manish");listStr.add("Manish");listStr.add("Indudhar");listStr.add("Nandini");
		
		Stream<List<String>> strString = Stream.of(listStr);
		System.out.println("listStr = " + strString.collect(Collectors.toList()));
		
		
		
	}

}

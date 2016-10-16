package com.java.functional.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author AYON SANYAL
 * This classs shows the utilities of Map method of stream api. The Map method plays the role of selecting an element from a collection or on stream.
 *
 */
public class MappingOfStreams {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> collectionOfWords = Arrays.asList("Ada","Pada","Kisne","Pada","Ram");
		List<Integer> collectionOfInteger = collectionOfWords.stream().map(String::length).collect(Collectors.toList());
        collectionOfInteger.forEach(System.out::println);
		
        String[] wordArray = {"Hello World"};
        Stream<String> streamOfWords = Arrays.stream(wordArray);
        Stream<String> streamOfWords2 = Arrays.stream(wordArray);
        streamOfWords.map(word->word.split(" ")).map(Arrays::stream).distinct().collect(Collectors.toList()).forEach(System.out::println);
        streamOfWords.close();
        
        streamOfWords2.map(word->word.split("")).flatMap(Arrays::stream).distinct().collect(Collectors.toList()).forEach(System.out::println);
        
        
	}

}

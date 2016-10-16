package com.java.functional.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * @author AYON SANYAL
 * 
 * The  This class operation takes as argument a predicate (a function returning a boolean) and returns a stream including all elements that match the predicate.
 *
 */
public class FilteringAndSlicingWithFilterandDistinct {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       List<Integer> NumberList = Arrays.asList(1,2,3,4,5,6,7,8,9,10); 
       List<Integer> NumberOdd= NumberList.stream().filter((Integer i)->(!(i%2==0))).collect(Collectors.toList());
       List<Integer> NumberEven = NumberList.stream().filter((Integer i)->i%2==0).collect(Collectors.toList());
       
		List<String> team = new ArrayList<>();
		team.add("player1");
		team.add("player2");
		team.add("player3");
		team.add("player4");
		team.add("player5");
		team.add("player5");
		team.add("player5");
		team.add("player5");
		team.add("player6");
		team.add("player7");
		team.add("player8");
		team.add("player8");
		
		/*team =  team.stream().filter((String s)->s.endsWith(String.valueOf(NumberEven.get(0)))).collect(Collectors.toList());*/
		
		///Below Code Snippet will filter the unique elements
		team= team.stream().distinct().collect(Collectors.toList());
		team.forEach(System.out::println);
		
		
		
		
	}

}

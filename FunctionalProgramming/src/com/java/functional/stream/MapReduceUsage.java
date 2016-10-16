package com.java.functional.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * @author AYON SANYAL
 * This class shows usge of reduce operations on stream
 *
 */
public class MapReduceUsage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> numList= Arrays.asList(5,7,10,34,6,8,37);
		
	Optional<Integer> max =	numList.stream().reduce(Integer::max);
	int sum =	numList.stream().reduce(0,(a,b)->a+b);
	Optional<Integer> summation =	numList.stream().reduce(Integer::sum);
	int summation2 =	numList.stream().map(i->i+1).reduce(1,(a,i)->a*i);
	System.out.println(max.get()+""+sum);;
	System.out.println(summation2);
	
	}

}

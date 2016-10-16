package com.java.functional;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamForIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list1 = Arrays.asList(1,2,3);
		List<Integer> list2 = Arrays.asList(5,7);
		List<int[]> pairs = list1.stream().flatMap(s->list2.stream().filter(d->(s+d)%3==0).map(d->new int[]{s,d})).collect(Collectors.toList());
		pairs.forEach(d-> {System.out.println(d);});
		

	}

}

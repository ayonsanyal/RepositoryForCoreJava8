package com.java.functional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalClassUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list1 = Arrays.asList(1,2,3,4,5);
		Optional<Integer> pehlaElement = list1.stream().map(x->x*x).filter(x->x%4==0).findFirst();
		int sum = list1.stream().reduce(0, Integer::sum);
		System.out.println(sum);
		System.out.println(pehlaElement.get());
		Optional<Integer> buju = list1.stream().reduce((a,b)->a+b);
		System.out.println(buju.get());
	}

}

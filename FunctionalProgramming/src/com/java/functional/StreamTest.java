package com.java.functional;

import java.util.List;
import java.util.TooManyListenersException;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class StreamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		java.util.List<Integer> hush = new java.util.ArrayList<>();
		hush.add(1);
		hush.add(2);
		hush.add(3);
		hush.add(4);
		hush.add(5);
		hush.add(6);
		hush.add(7);
		hush.add(8);
		hush.add(9);
		hush.add(10);
		hush.add(10);
		java.util.List<Integer> fush = (List<Integer>) hush.stream().filter(d->{return (d%2)== 0;}).distinct().collect(Collectors.toList());
		fush.forEach(System.out::println);
		Supplier<String> i = ()->"Car";
		Consumer<String> c = x->System.out.print(x.toUpperCase());
		Consumer<String> d = x->System.out.print(x.toLowerCase());
		c.andThen(d).accept(i.get());
		System.out.println();
		
		
		
		
	}

}

package com.rays.Stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

public class TestContestant {

	public static void main(String[] args) {

		ArrayList<Contestant> list = new ArrayList<Contestant>();

		list.add(new Contestant("Lucky", "7697687749"));
		list.add(new Contestant("Ankit", "9998765490"));
		list.add(new Contestant("Kunal", "8976497639"));
		list.add(new Contestant("Amit", "1146587"));
		list.add(new Contestant("Pratik", "8889997776"));
		list.add(new Contestant("Krati", "7697687749"));

		// Get the phone numbers
		System.out.println("<----Get the phone numbers---->");
		list.stream().map(e -> e.phone).forEach(e -> System.out.println(e));

		// Get valid phone numbers
		System.out.println("<----Get valid phone numbers---->");
		list.stream().map(e -> e.phone).filter(e -> e.length() == 10).forEach(e -> System.out.println(e));

		// Remove Duplicate No
		System.out.println("<----Remove Duplicate No---->");
		list.stream().map(e -> e.phone).filter(e -> e.length() == 10).distinct().forEach(e -> System.out.println(e));
		
		//Shuffle Phone No
				System.out.println("<----Shuffle Phone No---->");
				list.stream().map(e -> e.phone + e.name).distinct().
				collect(Collectors.collectingAndThen(Collectors.toList(), e -> {
					Collections.shuffle(e);
					return e.stream();
				})).limit(2).forEach(e -> System.out.println(e));
				
				
				System.out.println("------------------");
				
	}}



package com.example.jpql.service;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class Sollution
{
	protected void getDescription()
	{
		System.out.println("interview");
	}
}

class VideoInterview extends Interview
{
	protected void getDescription()
	{
		System.out.println("video");
	}
	
	protected void getSequence()
	{
		System.out.println("i");
	}
}
public class MuntazarVai {

	public static void main(String[] args)
	{
		/*
		 * Interview obj = new VideoInterview(); obj.getS
		 */
		List booleanStrings=Arrays.asList("True","False");
		Filter(booleanStrings,(str)->true);

	}
	
	static void filter(List names, Predicate condition)
	{
		names.stream().filter((nmaes)-> 
			(condition.test(nmaes))).forEach((names)->
			{
				System.out.println(names + " ");
			})

	

}

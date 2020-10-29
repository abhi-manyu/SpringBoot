package com.demo.example.repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DEMO {

	public static void main(String[] args)
	{
		//int[] nums = new Integer{5,4,9,3,1,8};
		List<Integer> numbers =
				new ArrayList<Integer>(Arrays.asList(5,4,9,3,1,8));
		System.out.println(numbers);
		
		for(int num:numbers)
		{
			if(num%2!=0)
			   numbers.set(numbers.indexOf(num),num+1);
				//numbers.add(num);
		}
		System.out.println(numbers);
	}

}

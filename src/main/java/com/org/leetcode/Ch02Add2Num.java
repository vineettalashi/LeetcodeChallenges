package com.org.leetcode;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Ch02Add2Num {

	public static void main(String[] args) {
		List<Integer> num1 = new LinkedList<>();
		num1.add(2);num1.add(4);num1.add(6);         //number1 = 642
		
		List<Integer> num2 = new LinkedList<>();
		num2.add(1);num2.add(3);num2.add(5);         //number2 = 531
		
		List<Integer> sum = new LinkedList<>();     // sum = 642 + 531 = 1173 --> 3711
		
		sum = addTwoNumbers(num1,num2);
		
	}

	private static List<Integer> addTwoNumbers(List<Integer> num1, List<Integer> num2) {
		ListIterator<Integer> it = num1.listIterator();
		while(it.hasPrevious()) {
			it.next();
		}
		return null;
	}

}

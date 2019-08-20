package com.org.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Ch01TwoSum {

	public static void main(String[] args) {
		
		int[] numarray = {1,5,0,3,1,7,8};
		int target = 8;
		Set<Integer[]> resultIndicesArraySetBF = getSetOfIndicesArrayBruteForce(numarray,target);
		resultIndicesArraySetBF.stream().iterator().forEachRemaining(array->System.out.println(array[0]+","+array[1]));
		System.out.println("\n************\n");
		Set<Integer[]> resultIndicesArraySet = getSetOfIndicesArray(numarray,target);
		resultIndicesArraySet.stream().iterator().forEachRemaining(array->System.out.println(array[0]+","+array[1]));
				
	}
	
	private static Set<Integer[]> getSetOfIndicesArray(int[] numarray, int target) {
		Set<Integer[]> set = new HashSet<Integer[]>();
		Map<Integer,Integer> numIndMap = new HashMap<>();
		for(int i = 0;i<numarray.length;i++) {
			int complement = target-numarray[i];
			if(numIndMap.containsKey(complement)) {
				set.add(new Integer[]{numIndMap.get(complement),i});
			}
			numIndMap.put(numarray[i],i);
			
		}
		return set;
	}

	private static Set<Integer[]> getSetOfIndicesArrayBruteForce(int[] numarray, int target) {
		Set<Integer[]> set = new HashSet<Integer[]>();
		for(int i = 0;i<numarray.length;i++) {
			for(int j=i+1;j<numarray.length;j++) {
				 if((numarray[i] + numarray[j]) == target){
					 set.add(new Integer[]{i,j});
				 }
				 
			}
		}
		
		return set;
	}
}

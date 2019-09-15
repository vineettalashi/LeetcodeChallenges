package com.org.leetcode;

public class Ch04Median {

	public static void main(String[] args) {
		int[] num1 = {1,2,7,9,55};
		int[] num2 = {3,4,5};
		double median = findMedianSortedArrays(num1, num2);
		System.out.println(median);
			
	}
	
    public static double findMedianSortedArrays(int[] num1, int[] num2) {
    	int num3Size = num1.length+num2.length;
		int[] num3 = new int[num3Size];
		int temp;
		
		for(int i=0;i<num1.length;i++) {
			num3[i] = num1[i];
		}
		int j=num1.length;
		for(int i=0;i<num2.length;i++) {
			num3[j] = num2[i];
			j++;
		}
		/*for(int k=0;k<num3.length;k++) {
			for(int m=k+1;m<num3.length;m++)
				if(num3[k]>num3[m]) {
					temp = num3[k];
					num3[k]=num3[m];
					num3[m]=temp;
				}
		}*/
		
		num3 = insertionSort(num3, num3Size);
		
		double median=0;
		if(num3Size%2!=0) {
			median= num3[num3Size/2];
		}
		else {
			double middleValue = (num3[(num3Size/2)-1]+num3[(num3Size/2)]);
			median = middleValue/2;
		}
		
		return median;
    }
    
    static int[] insertionSort(int arr[], int n) {  
        int i, key, j;  
        for (i = 1; i < n; i++) 
        {  
            key = arr[i];  
            j = i - 1;
            while (j >= 0 && arr[j] > key) {  
                arr[j + 1] = arr[j];  
                j = j - 1;  
            }  
            arr[j + 1] = key;  
        }        
        return arr;
    }  

}

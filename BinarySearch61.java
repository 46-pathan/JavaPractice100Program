package practicequestion;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch61 {

	public static void main(String[] args) {
		int i,n,search,arr[];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of elements for array");
		n=sc.nextInt();
		arr=new int[n];
		
		System.out.println("Enter "+n+" elements ");
		for(i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		System.out.println("Enter value to find");
		search=sc.nextInt();
		
		
		int result=binarySearch(arr,search);
		
		if(result==-1) {
			System.out.println("not in array");
		}else {
			System.out.println(search +" is at "+result);
		}

	}
	
	static int binarySearch(int[] arr,int s) {
		int left=0;
		int right=arr.length-1;
		
		while(left<=right) {
			int mid=left+(right-left)/2;
			
			if(arr[mid]==s) {
				return mid;
			}
			
			if(arr[mid]<s) {
				left=mid+1;
			}else {
				right=mid-1;
			}
			
		}
		return -1;
	}

}

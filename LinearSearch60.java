package practicequestion;

import java.util.Scanner;

public class LinearSearch60 {

	public static void main(String[] args) {
		int i,n,search,arr[];
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of elements for array");
		n=sc.nextInt();
		arr=new int[n];
		
		System.out.println("Enter "+n+"elements ");
		for(i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Enter value to find");
		search=sc.nextInt();
		
		for(i=0;i<n;i++) {
			if(arr[i]==search) {
				System.out.println(search + " is at "+(i+1));
				break;
			}
		}
		if(i==n) {
			System.out.println("not in array");
		}

	}

}

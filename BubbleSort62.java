package practicequestion;

import java.util.Scanner;

public class BubbleSort62 {

	public static void main(String[] args) {
		int n,arr[];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of elements of array");
		n=sc.nextInt();
		
		arr=new int[n];
		System.out.println("Enter "+n+" elements ");
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		int temp;
		for(int i=0;i<n-1;i++) {
			 for(int j=0;j<n-i-1;j++) {
				 if(arr[j]>arr[j+1]) {
					 temp=arr[j];
					 arr[j]=arr[j+1];
					 arr[j+1]=temp;
				 }
			 }
		}
		
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}

package practicequestion;

import java.util.Random;
import java.util.Scanner;

public class WhileLoopProgram19 {

	public static void main(String[] args) {
		Random rnd=new Random();
		Scanner sc=new Scanner(System.in);
		int n=rnd.nextInt(11);
		int ans=11;
		while(ans!=n) {
			System.out.println("Enter number till it match : ");
			ans=sc.nextInt(11);
		}
		System.out.println("You guess it right");

	}

}

package practicequestion;

import java.util.Random;

public class RandomNumber56 {

	public static void main(String[] args) {
		Random rnd=new Random();
		
		for(int i=0;i<10;i++) {
			System.out.println(rnd.nextInt(100));
		}
		

	}

}

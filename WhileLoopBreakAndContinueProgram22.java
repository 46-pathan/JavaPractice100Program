package practicequestion;

public class WhileLoopBreakAndContinueProgram22 {

	public static void main(String[] args) {
		int i=0;
		while(i<11){
			i++;
			if(i==5) 
				continue;
			
			System.out.println(i);
			
			if(i==7) 
				break;
			
		}

	}

}

package practicequestion;

interface Test{
	void show();
}

public class InterfaceProgram52 implements Test{	
	
	public static void main(String[] args) {
		
		InterfaceProgram52 a=new InterfaceProgram52();
		a.show();
	}

	public void show() {
		System.out.println("This is implemented method from interface");
		
	}

}

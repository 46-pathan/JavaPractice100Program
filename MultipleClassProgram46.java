package practicequestion;

class Laptop{
	Laptop(){
		System.out.println("Constructor of Laptop Class");
	}
	
	void laptopMethod() {
		System.out.println("This is Laptop Method");
	}
}

class Computer{
	Computer(){
		System.out.println("Constructor of Computer Class");
	}
	
	void computerMethod() {
		System.out.println("This is Computer Method");
	}
}

public class MultipleClassProgram46 {
	
	public static void main(String[] args) {
		Computer obj1=new Computer();
		Laptop obj2=new Laptop();
		
		obj1.computerMethod();
		obj2.laptopMethod();
		
	}

}

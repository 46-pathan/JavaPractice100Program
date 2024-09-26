package practicequestion;

public class StaticAndInstanceMethod45 {

	static void display() {
		System.out.println("Static Method");
	}
	
	void show() {
		System.out.println("Instance Method");
	}
	
	public static void main(String[] args) {
		
		display();
		
		StaticAndInstanceMethod45 obj=new StaticAndInstanceMethod45();
		obj.show();

	}

}

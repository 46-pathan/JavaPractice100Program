package practicequestion;

public class CreatMethodProgram42 {
	
	CreatMethodProgram42(){
		System.out.println("Constructor Method");
	}

	public static void main(String[] args) {
		method();
		CreatMethodProgram42 obj=new CreatMethodProgram42();
		obj.nonstaticmethod();

	}
	
	static void method() {
		System.out.println("Static Method");
	}
	
	void nonstaticmethod() {
		System.out.println("Nonstatic Method");
	}

}

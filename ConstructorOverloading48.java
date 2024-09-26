package practicequestion;

public class ConstructorOverloading48 {
	String name;
	
	ConstructorOverloading48(){
		System.out.println("This is non Parameterized constructor");
	}
	
	ConstructorOverloading48(String t){
		name=t;
		System.out.println("This is Parameterized constructor");
	}

	public static void main(String[] args) {
		ConstructorOverloading48 obj1=new ConstructorOverloading48();
		ConstructorOverloading48 obj2=new ConstructorOverloading48("Parameterized");
		
		System.out.println(obj2.getName());
		System.out.println(obj1.getName());
		obj1.setName("NonParameterized");
		System.out.println(obj1.getName());
		
		

	}
	
	void setName(String t) {
		name=t;
	}
	String getName() {
		return name;
	}

}

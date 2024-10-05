package practicequestion;


class Animal{
	void speak() {
		System.out.println("Different ways");
	}
}

class Dogs extends Animal{
	void speak() {
		System.out.println("barking");
	}
}

class Cats extends Animal{
	void speak() {
		System.out.println("meow");
	}
}
class Horses extends Animal{
	void speak() {
		System.out.println("neighing");
	}
}

public class MethodOverridingProgram100 {

	public static void main(String[] args) {
		Dogs pet1=new Dogs();
		Cats pet2=new Cats();
		Horses pet3=new Horses();
		
		pet1.speak();
		pet2.speak();
		pet3.speak();

	}

}

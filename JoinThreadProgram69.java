package practicequestion;

public class JoinThreadProgram69 extends Thread{
	
	public void run() {
		for(int i=1;i<=5;i++) {
			try {
				Thread.sleep(500);
			}catch(InterruptedException e) {
				System.out.println(e);
			}
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		
		JoinThreadProgram69 obj1=new JoinThreadProgram69();
		JoinThreadProgram69 obj2=new JoinThreadProgram69();
		JoinThreadProgram69 obj3=new JoinThreadProgram69();
		
		obj1.start();
		try {
			obj1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		obj2.start();
		obj3.start();
		

	}

}

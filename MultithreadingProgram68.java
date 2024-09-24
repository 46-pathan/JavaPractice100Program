package practicequestion;

public class MultithreadingProgram68 extends Thread{
	
	public void run() {
		System.out.println("Thread Executing");
		
	}
	
	public static void main(String[] args){
		MultithreadingProgram68 m=new MultithreadingProgram68();
		m.start();
		try {
			m.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}

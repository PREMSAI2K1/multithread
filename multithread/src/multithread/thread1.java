package multithread;

public class thread1 extends Thread {
	public void run() {
		for(int i=1;i<=10;i++) {
			if(i==9) {
				try {
					Thread.sleep(1000);
				}
				catch(Exception e) {
					System.out.println(e);
				}
			}
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		Thread t1=new thread1();
		t1.run();
		
	}
}

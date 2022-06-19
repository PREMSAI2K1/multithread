package multithread;

public class prioritythread extends Thread {
	public void run() {
		System.out.println("current thread"+Thread.currentThread().getName());
	}
	public static void main(String[] args) {
		prioritythread t1=new prioritythread();
		prioritythread t2=new prioritythread();
		prioritythread t3=new prioritythread();
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);
		t3.setPriority(Thread.NORM_PRIORITY);
		t1.start();
		t2.start();
		t3.start();
		
		
		
	}

}

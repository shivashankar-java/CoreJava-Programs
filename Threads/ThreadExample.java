package Threads;

public class ThreadExample extends Thread {

	public void run() {
		for(int i=1;i<=5;i++) {
			try {
				Thread.sleep(1050);
			}catch (Exception e) {
				System.out.println(e);
			}
			System.out.println(i);
		}	
	}
	
	public static void main(String[] args) {
		ThreadExample te1 =new ThreadExample();
		te1.start();
		ThreadExample te2 =new ThreadExample();
		te2.start();

	}
}

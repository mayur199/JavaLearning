class MyRunnable implements Runnable{
	public void run() {
		for (int i=1; i<=5;i++) {
			System.out.println("Thread is running: " +i);
			try {
				Thread.sleep(1000);

			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class ThreadExample {
	public static void main(String[] args) {
		MyRunnable runnable = new MyRunnable();
		Thread thread = new Thread(runnable);
		thread.start();
	}

}

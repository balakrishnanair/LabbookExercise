package lab9;

import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task extends Thread {
	public void run() {
		for( ;  ;  ) {
			try {
				Date d = new Date();
				System.out.println(d);
				Thread.sleep(10000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
}

public class exercise1 {
	
	public static void main(String[] args) {

		ExecutorService service = Executors.newFixedThreadPool(20);
		service.execute(new Task());
	}
}


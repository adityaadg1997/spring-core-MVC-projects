package Practise;

public class Consumer implements Runnable{
	Company c;
	
	public Consumer(Company c) {
		this.c = c;
	}


	@Override
	public void run() {

		while(true) {
			try {
				c.consumed_item();
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}

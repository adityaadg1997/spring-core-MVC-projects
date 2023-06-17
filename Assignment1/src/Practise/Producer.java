package Practise;

public class Producer implements Runnable {

	Company c;

	public Producer(Company c) {
		this.c = c;
	}

	@Override
	public void run() {	
		int i=1;
		while(true) {
			try {
				c.produced_item(i);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			i++;
		}

	}

}

package Practise;

public class Company {

	int n;
	
	boolean f=false;

	synchronized public void produced_item(int n) throws InterruptedException {
		if(f) {
			wait();
		}
		this.n = n;
		System.out.println("produced : " + this.n);
		f=true;
		notify();
	}
 
	synchronized public int consumed_item() throws InterruptedException {
		if(!f) {
			wait();
		}
		System.out.println("consumed : " + this.n);
		f=false;
		notify();

		return this.n;
	}
}

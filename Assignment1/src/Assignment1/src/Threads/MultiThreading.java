package Assignment1.src.Threads;

class A{
	int num;
	boolean valueSet = false;

	public synchronized void setValue(int num) {
		while(valueSet) {
			try {wait();} catch (InterruptedException e) {e.printStackTrace();}
		}
		System.out.println("setValue : "+ num);
		this.num=num;
		valueSet = true;
		notify();
	}

	public synchronized void getValue() {
		while(!valueSet) {
			try {wait();} catch (InterruptedException e) {e.printStackTrace();}
		}
		System.out.println("getValue : "+ num);
		valueSet = false;
		notify();
	}	
}



class Producer implements Runnable{
	A a;

	public Producer(A a) {
		this.a = a;
	}


	public void run() {
		int i=1;
		while(true) {
			a.setValue(i++);	
			try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
		}
		
	}
	
}


class Consumer implements Runnable{
	A a;

	public Consumer(A a) {
		this.a = a;
	}


	public void run() {
		
		while(true) {
			a.getValue(); 	
			try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
		}
		
	}
	
}


public class MultiThreading{
	public static void main(String[] args) {
		
		A a = new A();
		
		Producer producer = new Producer(a);
		Consumer consumer = new Consumer(a);
		
		Thread t1 = new Thread(producer);
		Thread t2 = new Thread(consumer);
		
		
		t1.start();t2.start();
	

	}


}

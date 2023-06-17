package Threads;

public class myThread {

	public static void main(String[] args) {
		MyClass myClass = new MyClass();
		
		MyProducer myProducer = new MyProducer(myClass);
		MyConsumer myConsumer = new MyConsumer(myClass);
		
		Thread t1 = new Thread(myProducer);
		Thread t2 = new Thread(myConsumer);
		
		t1.start();t2.start();
		
	}

}

class MyClass{
	int num;
	boolean valueSet = false;
	
	public synchronized void setValue(int num) {
		while(valueSet) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.num=num;
		valueSet = true;
		notify();
	}
	
	public synchronized void getValue() {
		while(!valueSet) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("getValue : " + num);
		valueSet = true;
		notify();
	}
}

class MyProducer implements Runnable{
	MyClass myClass;
	
	public MyProducer(MyClass myClass) {
		this.myClass= myClass;
	}

	public void run() {
		
		int i = 0;
		while(true) {myClass.setValue(i++); System.out.println("setValue : " + i);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}}
	}
}

class MyConsumer implements Runnable{
	MyClass myClass;
	
	public MyConsumer(MyClass myClass) {
		this.myClass= myClass;
	}

	public void run() {
		
		while(true) {
			myClass.getValue();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
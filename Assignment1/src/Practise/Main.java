package Practise;

public class Main {

	public static void main(String[] args) {
		
		Company company = new Company();
		
		Producer producer = new Producer(company);
		Consumer consumer = new Consumer(company);

		Thread thread1 = new Thread(producer);
		Thread thread2 = new Thread(consumer);
		
		thread1.start();
		thread2.start();
	}

}

package synchronizaton;

class Table {
	  synchronized void printTable(int n) {// synchronized method
		for (int i = 1; i <= 5; i++) {
			System.out.println( i);
			try {
				Thread.sleep(400);
			} catch (Exception e) {
				System.out.println(e);
			}
		}

	}
	 void printTable1(int n) {// synchronized method
		for (int i = 1; i <= 5; i++) {
			System.out.println( "NOn synchonized "+i);
			try {
				Thread.sleep(400);
			} catch (Exception e) {
				System.out.println(e);
			}  
		}

	}
}

class MyThread1 extends Thread {
	Table t;

	MyThread1(Table t) {
		this.t = t;
	}

	public void run() {
		t.printTable(5);
	}

}

class MyThread2 extends Thread {
	Table t;

	MyThread2(Table t) {
		this.t = t;
	}

	public void run() {
		t.printTable(100);
	//	t.printTable1(100);
	}
}

public class TestSynchronization2 {
	public static void main(String args[]) {
		Table obj = new Table();// only one object
		MyThread1 t1 = new MyThread1(obj);
		MyThread2 t2 = new MyThread2(obj);
		t1.start();
		t2.start();
		Table obj1 = new Table();// only one object
		MyThread1 t3= new MyThread1(obj1);
		MyThread2 t4 = new MyThread2(obj1);
		t3.start();
		t4.start();
	}
}
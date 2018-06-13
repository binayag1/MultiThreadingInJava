package binaya.MultiThreading;

public class App 
{
    public static void main( String[] args )
    {
    		Hello hello=new Hello();
    		new Producer(hello);
    		new Consumer(hello);
    }
}

class Hello{
	int number;
	boolean isSet=false;
	public synchronized void put(int number) {
		if(isSet) {
			try{wait();}catch(Exception e) {}
		}
		System.out.println("Set Number:"+number);
		this.number=number;
		isSet=true;
		notify();
	}
	public synchronized void get() {
		while(!isSet)
		{
			try {wait();}catch(Exception e) {}
		}
		System.out.println("Get Number:"+number+"\n");
		System.out.println("========================");
		isSet=false;
		notify();
	}
}
class Producer implements Runnable{
	
	Hello h1;
	public Producer(Hello h1) {
		this.h1=h1;
		Thread t1=new Thread(this,"thread 1");
		t1.start();
	}
	@Override
	public void run() {
		int i=0;
		while(true) {
			h1.put(i++);
			try{Thread.sleep(1000);} catch(Exception e) {}
		}
	}
	
}
class Consumer implements Runnable{
	Hello h2;
	public Consumer(Hello h2) {
		this.h2=h2;
		Thread t2=new Thread(this,"thread 2");
		t2.start();
	}
	@Override
	public void run() {
		while(true) {
			h2.get();
			try {Thread.sleep(1000);}catch(Exception e) {}
		}
	}
	
}
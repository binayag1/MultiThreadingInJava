package binaya.MultiThreading;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	B b=new B();
    	C c=new C();
    	Thread t1=new Thread(b);
    	Thread t2=new Thread(c);
    	t1.start();
    	try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	t2.start();
    	
        
    }
}
class B implements Runnable{
	public void run() {
		for (int i = 1; i <=5; i++) {
			System.out.println("Hello from B");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
class C implements Runnable{
	public void run() {
		for (int i = 1; i <=5; i++) {
			System.out.println("Hello from C");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}


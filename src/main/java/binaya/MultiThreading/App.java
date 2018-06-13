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
    	b.printMessage();
    	c.printMessage();
    	
        
    }
}
class B{
	public void printMessage() {
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
class C{
	public void printMessage() {
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


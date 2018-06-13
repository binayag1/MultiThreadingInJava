package binaya.MultiThreading;

public class App 
{
    public static void main( String[] args )
    {
    	Counter c=new Counter();
    	Thread t1=new Thread(
    			()->{
    				for(int i=1;i<=1000;i++) {
    					c.increament();
    				}
    			},"thread1"
    			
    			);
    	Thread t2=new Thread(
    			()->{
    				for(int i=1;i<=1000;i++) {
    					c.increament();
    				}
    			},"thread2"
    			
    			);	
    	t1.start();
    	t2.start();
    	try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	System.out.println(c.count);
    }
}
class Counter{
	int count;
	public synchronized void increament() {
		count++;
	}
}


package binaya.MultiThreading;

public class App 
{
    public static void main( String[] args )
    {
    	Thread t1=new Thread(
    			()->{
    				for(int i=1;i<=5;i++) {
    					System.out.println("Hello from Thread 1. Priority: "+Thread.currentThread().getPriority());
    					try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
    				}
    			},"thread1"
    			
    			);
    	Thread t2=new Thread(
    			()->{
    				for(int i=1;i<=5;i++) {
    					System.out.println("Hello from Thread 2. Priority: "+Thread.currentThread().getPriority());
    					try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
    				}
    			},"thread2"
    			
    			);	
    	System.out.println(t1.getName());
    	System.out.println(t2.getName());
    	t1.setPriority(1);
    	t2.setPriority(10);
    	t1.start();
    	try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	t2.start();
    	try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	System.out.println("This is message from Main Thread-->>");
    	System.out.println(t1.isAlive());
    	
    }
}


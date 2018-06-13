# MultiThreadinInJava
	This project covers the concept about MultiThreading in Java.

# IDE used 
	Version: Oxygen.3a Release (4.7.3a)
	Build id: 20180405-1200

# In this Commit: 
	This is the example of inter thread communication, where two thread are created. One thread works to set
	the value of number where as other thread works to get the number. Here wait(), is used to pause 
	another thread until the value is set, similarly wait() is used until the value is get. This means, when number is not set, thread for get will wait and after value is set, set waits for get to get the value.  
	wait() belongs to Object class and hence sleep() belongs to Thread class. When sleep() is used, a thread 
	is paused for certain time, but wait() will pause the thread until it is being notified. 
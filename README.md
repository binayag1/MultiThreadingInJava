# MultiThreadinInJava
	This project covers the concept about MultiThreading in Java.

# IDE used 
	Version: Oxygen.3a Release (4.7.3a)
	Build id: 20180405-1200

# In this Commit: 
	In this example thread.join() and thread.isAlive() method has been used. join() will allow a thread 
	to be completed and isAlive() methods checks whether the thread is still alive or not. A message is
	printed at the end of main() thread. If join() is not used then the message will be displayed after
	the execution of thread1, thread 2 but after use of join(), first thread1 and thread2 will be executed
	completely and then the message from main() thread will be displayed.isAlive() method is used at the end
	and after join() method. So, by the time the execution reach to the isAlive() of thread 1 the execution 
	of thread 1 gets completed hence we get false message. 
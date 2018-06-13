# MultiThreadinInJava
	This project covers the concept about MultiThreading in Java.

# IDE used 
	Version: Oxygen.3a Release (4.7.3a)
	Build id: 20180405-1200

# In this Commit: 
	There are three classes named App, B and C. In class B and C, a method is written which display the message five times. To understand how thread can work, Thread.sleep() has been used. Which delays the execution of thread by 1000 millisecond. We can have the look of how thred gets executed. In class App, object of B and C has been created. Eventually, method are called. The process of execution will be in sequential order which mean first printMessage() of class B will executed 5 times and printMessage() of class C will be executed 5 times. But during the execution each loop execution is delayed by 1 second. 
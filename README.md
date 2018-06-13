# MultiThreadinInJava
	This project covers the concept about MultiThreading in Java.

# IDE used 
	Version: Oxygen.3a Release (4.7.3a)
	Build id: 20180405-1200

# In this Commit: 
	A new class has been added called Counter which increment the value by 1. Thread 1 and Thread 2 call the 
	method of same class. During the call we expect value 2000, as thread 1 has loop of 1000 and thread 2 has
	1000. But as both may call the method at the same time and fetch the same value and increment. This will 
	lead to the incorrect result. To avoid such error we need to use synchronized keyword. Which will allow
	only one threat to execute the method at a time. 
/*The following program creates two objects of class Time with member variables hour, min and sec.
A constructor initializes them with the given arguments. The method add() is used for calculating the result
of adding the corresponding instance variables.*/

import java.util.Scanner;
class Time
{
	private int hour;
	private int min;
	private int sec;
	
	public Time(int hour, int min, int sec) // constructor initializes instance variables
	{
		this.hour = hour;
		this.min = min;
		this.sec = sec;
	}
	
	void add(Time t) // method to add corresponding instance variables
	{	
		Time result = new Time(0, 0, 0);
		result.sec = (sec + t.sec) % 60; 
		int sec_carry = (sec + t.sec) / 60; 
		result.min = ((min + t.min) + sec_carry) % 60;
		int min_carry = ((min + t.min) + sec_carry) / 60;
		result.hour = (hour + t.hour) + min_carry;
		System.out.println(result.hour + " Hours " + result.min + " Minutes " + result.sec + " Seconds ");		
	}		
}

class Clock
{
	public static void main(String args[])
	{
		Time t1 = new Time(6, 35, 23); // parameters for first object
		Time t2 = new Time(12, 45, 45); // parameters for second object
		t2.add(t1);	// first object passed as parameter to add() 
	}
}
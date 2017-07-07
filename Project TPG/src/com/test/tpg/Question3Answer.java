package com.test.tpg;

import com.google.common.base.Stopwatch;

public class Question3Answer extends TimingMeasureToolService{
	
	public static void main(String a[]){
		Stopwatch timer = start();//method in a Tool class to invoke before execution of any method
		doAnything();
		//method in a Tool class to invoke after execution of 
		//any method to known the time taken for the execution of the method
		Stopwatch timeTakenByMethod = executionTimeforMethod(timer);
		System.out.println("Time consumed for the execution of the doAnything() method : "+timeTakenByMethod);
	}
	 public static void doAnything(){
	      System.out.println(" Here in doAnything Method ");
	      }

}

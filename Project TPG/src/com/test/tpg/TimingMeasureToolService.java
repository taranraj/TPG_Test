package com.test.tpg;

import com.google.common.base.Stopwatch;

public class TimingMeasureToolService{

	public static Stopwatch start() {
		Stopwatch timer = null;
		try{
			timer = new Stopwatch();
			timer.start();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return timer;
	}

	public static Stopwatch executionTimeforMethod(Stopwatch timer) {
		try{
			timer.stop();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return timer;
	}

}

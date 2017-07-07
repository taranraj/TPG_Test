package com.test.tpg;

import java.util.Arrays;

public class Question2Answer {
	
	public static void main(String a[]){
		StudentInformation [] infoList = new StudentInformation[5];
		infoList[0] = new StudentInformation(33, "Tina",3.68);
		infoList[1] = new StudentInformation(85, "Louis",3.85);
		infoList[2] = new StudentInformation(56, "Samil",3.75);
		infoList[3] = new StudentInformation(19, "Samar",3.75);
		infoList[4] = new StudentInformation(22, "Lorry",3.76);
		Arrays.sort(infoList,new StudentInfoComparator());
		int i=0;
		for(StudentInformation info: infoList){
			System.out.println("Student" + ++i + " : " + info.getName() +
					", GPA : " + info.getGpa() +", ID : " + info.getId());
		}
	}

}

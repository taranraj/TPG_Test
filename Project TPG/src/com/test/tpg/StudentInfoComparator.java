package com.test.tpg;

import java.util.Comparator;

public class StudentInfoComparator implements Comparator<StudentInformation>{

	@Override
	public int compare(StudentInformation o1, StudentInformation o2) {
		int gpa = o2.getGpa().compareTo(o1.getGpa());
		if(gpa==0){
			int name = o1.getName().toString().compareTo(o2.getName().toString());
			if(name==0){
				return o1.getId().compareTo(o2.getId());
			}
			else{
				return name;
			}
		}
		return o2.getGpa().compareTo(o1.getGpa());
	}
}

package com.kk.beans;

import java.util.Set;

public class EnggCourse {
	private  Set<String> subjects;

	public void setSubjects(Set<String> subjects) {
		this.subjects = subjects;
	}

	@Override
	public String toString() {
		return "EnggCourse [subjects=" + subjects + "]";
	}
	
	
	
	

}
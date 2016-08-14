package com.cpe50.inheritance_sw;

public class LabCourse extends CollegeCourse {

    public LabCourse(String department, int courseNumber, int credits) {
        super(department, courseNumber, credits);
    }

    @Override
    public void display() {
        super.display(50);
    }
}

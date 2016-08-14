package com.cpe50.inheritance_sw;

import javax.swing.*;

public class CollegeCourse {

    private String department;
    private int courseNumber, credits;
    private double fee;


    public CollegeCourse(String department, int courseNumber, int credits) {

        this.department = department;
        this.courseNumber = courseNumber;
        this.credits = credits;
        this.fee = 120 * this.credits;
    }

    public void display(){
        String content = "Department : " + this.department + "\n" +
                "Course Number : " + this.courseNumber + "\n" +
                "Credits : " + this.credits + "\n" +
                "Fee : " + this.fee;

        JOptionPane.showMessageDialog(null, content);
    }

    public void display(int extraFee){
        String content = "Department : " + this.department + "\n" +
                "Course Number : " + this.courseNumber + "\n" +
                "Credits : " + this.credits + "\n" +
                "Fee : " + (this.fee + (extraFee * this.credits));

        JOptionPane.showMessageDialog(null, content);
    }


}

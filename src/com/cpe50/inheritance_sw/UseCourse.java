package com.cpe50.inheritance_sw;

import javax.swing.*;

/**
 * Created by msalvio on 09/08/16.
 */
public class UseCourse {
    public static void main(String[] args) {


        String department   = JOptionPane.showInputDialog(null, "Enter Department");
        int    courseNumber = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter course number"));
        int    credits      = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter credits"));

        if ( isLab(department) ) {
            LabCourse labCourse = new LabCourse(department, courseNumber, credits);
            labCourse.display();
        } else {
            CollegeCourse collegeCourse = new CollegeCourse(department, courseNumber, credits);
            collegeCourse.display();
        }
    }

    public static boolean isLab(String courseInput){
        String[] labCourses = { "BIO", "CHM", "CIS", "PHY" };
        for ( String course : labCourses ) {
            if ( courseInput.equals(course) ) {
                return true;
            }
        }

        return false;

    }


}

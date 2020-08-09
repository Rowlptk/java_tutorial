package com.exam;

import java.util.List;
import java.util.Scanner;

public class ExamRegister {
    
    Scanner scanner = new Scanner(System.in);
    
    private String studentName;
    private int gradeLevel;
    private int rollNumber;
    private long contactNumber;

    public ExamRegister(String studentName, int gradeLevel, int rollNumber, long contactNumber) {
        this.studentName = studentName;
        this.gradeLevel = gradeLevel;
        this.rollNumber = rollNumber;
        this.contactNumber = contactNumber;
    }
    
    public String getStudentName() {
        return studentName;
    }

    public int getGradeLevel() {
        return gradeLevel;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public long getContactNumber() {
        return contactNumber;
    }
}

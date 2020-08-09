package com.exam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MCQ { 

    public static Scanner s = new Scanner(System.in);
    public static List<Exam> studentList = new ArrayList<>();

    public static void main(String[] args) {

        Questions setA = new Questions("SET-A");

        Question ques1 = new Question(1, "Two plus Two is ...... ", "Four", "Five", "Seven", "Nine", 1);
        setA.addQuestion(ques1);
        Question ques2 = new Question(2, "3 x 3 ...", "ninty", "nine", "ten", "hundred", 2);
        setA.addQuestion(ques2);
        Question ques3 = new Question(3, "Old name of java is ...", "himalayan", "tree", "oak", "goat", 3);
        setA.addQuestion(ques3);

        registerStudents(2);
        printList();
        System.out.println("Assign Exam to Student : \nName : ");
        String studentName = s.nextLine();
        System.out.println("Contact Number : ");
        long contactNumber = s.nextLong();
        s.nextLine();
        startExam(studentName, contactNumber, setA);
            
    }
    
    public static List registerStudents(int totalNumberOfStudents) {
        System.out.println("Kindly fill " + totalNumberOfStudents + " students value : ");
        for(int i=1; i <= totalNumberOfStudents; i++) {
            System.out.println("Student "+ i +" Name : ");
            String studentName = s.nextLine();
            System.out.println("Student "+ i +" Grade Level : ");
            int gradeLevel = s.nextInt();
            s.nextLine();
            System.out.println("Student "+ i +" Roll Number : ");
            int rollNumber = s.nextInt();
            s.nextLine();
            System.out.println("Student "+ i +" Contact Number : ");
            long contactNumber = s.nextLong();
            s.nextLine();
            studentList.add(new Exam(studentName, gradeLevel, rollNumber, contactNumber));
            System.out.println("\n*****************************************************************\n");
        }
        return studentList;
    }
    
    public static boolean printList() {
        if (studentList.isEmpty()) {
            System.out.println("No Students found!");
            return false;
        }
        System.out.println("Name\tGrade\tRoll\tContact");
        for(int i=0; i < studentList.size(); i++) {
            Exam s = studentList.get(i);
            System.out.println(s.getStudentName() + "\t" + s.getGradeLevel() + "\t" + s.getRollNumber() + "\t" + s.getContactNumber());
        }
        return true;
    }
    
    public static boolean findStudent(String StudentName, long contactNumber) {
        if(studentList.isEmpty()) {
            System.out.println("Student List is Empty");
            return false;
        }
        
        for(int i = 0; i<studentList.size(); i++) {
            Exam s = studentList.get(i);
            if(s.getStudentName().equals(StudentName) && s.getContactNumber() == contactNumber) {
                return true;
            } 
        } 
        return false;
    }
    
    public static int findIndex(String StudentName, long contactNumber) {
        int i = -1;
        for(i = 0; i<studentList.size(); i++) {
            Exam s = studentList.get(i);
            if(s.getStudentName().equals(StudentName) && s.getContactNumber() == contactNumber) {
                break;
            } 
        } 
        return i;
    }
    
    public static void startExam(String studentName, long contactNumber, Questions setName) {
        boolean search = findStudent(studentName, contactNumber);
        if(search) {
            int i = findIndex(studentName, contactNumber);
            studentList.get(i).assignExam(setName);
            System.out.println(studentName + " scored " +studentList.get(i).calculateScore() + " marks.");
        } else {
            System.out.println("Student not found!");
        }
    }
}

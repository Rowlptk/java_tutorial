package com.exam;

import java.util.List;

public class Exam extends ExamRegister {

    private int score = 0;
    
    public Exam(String studentName, int gradeLevel, int rollNumber, long contactNumber) {
        super(studentName, gradeLevel, rollNumber, contactNumber);
    }
    
    
    public void assignExam(Questions set) {
        System.out.println(set.getSetName() + "is assigned to " + this.getStudentName());
        System.out.println("Press Y to Start : ");
        String option = scanner.nextLine();
        if(option.equals("Y") || option.equals("y")) {
            startExam(set);
        } else {
        System.out.println("Exam Terminated!");
        }
    }
    
    private void startExam(Questions set) {
        List<Question> li = set.getSet();
        for(int i=0 ; i < li.size(); i++) {
            System.out.println("Q" + li.get(i).getQuestionNumber() + ". " +  li.get(i).getQuestion());
            System.out.println("1. " + li.get(i).getOptionOne());
            System.out.println("2. " + li.get(i).getOptionTwo());
            System.out.println("3. " + li.get(i).getOptionThree());
            System.out.println("4. " + li.get(i).getOptionFour());
            int ans = scanner.nextInt();
            boolean count = li.get(i).matchAnswer(ans);
            if(count) {
                this.score++;
            }
            scanner.nextLine();
        }
    }
    
    public int calculateScore() {
        return this.score;
    }
    
}

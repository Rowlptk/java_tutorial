package com.exam;

public class Question {
    private int questionNumber;
    private String question;
    private String optionOne;
    private String optionTwo;
    private String optionThree;
    private String optionFour;
    private int answer;

    public Question(int questionNumber, String question, String optionOne, String optionTwo, String optionThree, String optionFour, int answer) {
        this.questionNumber = questionNumber;
        this.question = question;
        this.optionOne = optionOne;
        this.optionTwo = optionTwo;
        this.optionThree = optionThree;
        this.optionFour = optionFour;
        if(answer >= 1 && answer <= 4) {
            this.answer = answer;
        } else {
            System.out.println("Answer must be in the range 1 - 4");
            System.exit(answer);
        }
    }

    public String getOptionOne() {
        return optionOne;
    }

    public String getOptionTwo() {
        return optionTwo;
    }

    public String getOptionThree() {
        return optionThree;
    }

    public String getOptionFour() {
        return optionFour;
    }

    public int getQuestionNumber() {
        return questionNumber;
    }

    public String getQuestion() {
        return question;
    }
    
    public boolean matchAnswer(int ans) {
        if(this.answer == ans) {
            System.out.println("Correct Answer");
            return true;
        }
            System.out.println("Wrong Answer");
            return false;
    }
}

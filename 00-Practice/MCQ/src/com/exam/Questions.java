package com.exam;

import java.util.*;

public class Questions {
    private String SetName;
    private List<Question> set = new ArrayList<>();

    public Questions(String setName) {
        this.SetName = setName;
    }

    public void addQuestion(Question ques) {
        set.add(ques);
    }

    public String getSetName() {
        return SetName;
    }

    public List<Question> getSet() {
        return set;
    }
    
    public void printSet() {
        if(getSet().isEmpty()) {
            System.out.println(getSetName() + " is Empty!");
        } else {
            for(int i = 0; i < getSet().size(); i++) {
                System.out.println(getSet().get(i).getQuestion());
            }
        }
//        System.out.println(getSet());
    }
}

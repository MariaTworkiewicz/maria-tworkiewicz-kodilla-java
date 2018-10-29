package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer {
    private final String mentorName;
    private int updateCount;

    public Mentor(String mentorName){
        this.mentorName = mentorName;
    }

    public String getMentorName(){
        return mentorName;
    }

    public int getUpdateCount(){
        return updateCount;
    }

    @Override
    public void update(HomeworkMakerQueue homeworkMaker) {
        System.out.println(mentorName + ": New homework submitted by " + homeworkMaker.getName() + "\n" +
                " (total: " + homeworkMaker.getHomeworks().size() + " messages)");
        updateCount++;
    }

}

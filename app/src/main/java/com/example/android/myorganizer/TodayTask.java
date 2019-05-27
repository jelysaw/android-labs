package com.example.android.myorganizer;

import java.util.Date;
import java.util.GregorianCalendar;


public class TodayTask {
    String taskName;
    String taskDescription;
    GregorianCalendar taskDate;


    TodayTask(String taskName, String taskDescription, GregorianCalendar taskDate){
        setTaskName(taskName);
        setTaskDate(taskDate);
        setTaskDescription(taskDescription);
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public GregorianCalendar getTaskDate() {
        return taskDate;
    }

    public void setTaskDate(GregorianCalendar taskDate) {
        this.taskDate = taskDate;
    }
}

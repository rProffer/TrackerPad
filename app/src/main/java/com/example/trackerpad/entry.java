package com.example.trackerpad;

import android.app.Notification;
import android.media.SoundPool;

import java.util.Date;

public class entry {
    String task;
    Date deadline;
    SoundPool sound;
    Boolean notification;

    public entry(String task, Date dLine, Boolean noticeMe){ //needs sound setting
        this.task = task;
        this.deadline = dLine;
        this.notification = noticeMe;
    }
    public void setTask(String task){
        this.task = task;
    }
    public String getTask(){
        return this.task;
    }
    public void setDeadline(Date deadline){
        this.deadline = deadline;
    }
    public Date getDeadline(){
        return this.deadline;
    }
    public void setSounds(SoundPool s){

    }
    public void clearSound(){
        this.sound = null;
    }

    public String toString(){
        return this.getTask();
    }
}

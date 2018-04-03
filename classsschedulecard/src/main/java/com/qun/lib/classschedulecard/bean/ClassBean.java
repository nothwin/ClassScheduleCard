package com.qun.lib.classschedulecard.bean;

/**
 * Created by Administrator on 2018/4/3 0003.
 */

public class ClassBean {
    private int startIndex;//从第几节课开始
    private int classLength; //课程长度占几个课时
    private String className;
    private String teacherName;
    private String classroom;
    private String time;

    public ClassBean() {

    }

    public ClassBean(int startIndex, int classLength, String className, String teacherName, String classroom, String time) {
        this.startIndex = startIndex;
        this.classLength = classLength;
        this.className = className;
        this.teacherName = teacherName;
        this.classroom = classroom;
        this.time = time;
    }

    public int getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    public int getClassLength() {
        return classLength;
    }

    public void setClassLength(int classLength) {
        this.classLength = classLength;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getClassroom() {
        return classroom;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "ClassBean{" +
                "startIndex=" + startIndex +
                ", classLength=" + classLength +
                ", className='" + className + '\'' +
                ", teacherName='" + teacherName + '\'' +
                ", classroom='" + classroom + '\'' +
                ", time='" + time + '\'' +
                '}';
    }
}

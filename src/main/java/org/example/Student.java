package org.example;

public class Student {
   private String firstName;
   private String lastName;
   private long studentNumber;
   private String course;
   private String courseCode;

    public Student() {

    }

    public Student(String firstName, String lastName, long studentNumber, String course, String courseCode) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentNumber = studentNumber;
        this.course = course;
        this.courseCode = courseCode;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public long getStudentNumber() {
        return studentNumber;
    }

    public String getCourse() {
        return course;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setStudentNumber(long studentNumber) {
        this.studentNumber = studentNumber;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " " + studentNumber + " " + course + " " + courseCode + "\n";
    }
}

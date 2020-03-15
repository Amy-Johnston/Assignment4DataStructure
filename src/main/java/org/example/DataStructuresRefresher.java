package org.example;

import java.util.*;

/**
 * Author: Amy Johnston (218188773)
 * Program: DataStructuresRefresher
 * Date: 18 March 2020
 */
public class DataStructuresRefresher
{
    public static void main( String[] args )
    {
        Student stu1 = new Student("Amy", "Johnston", 218188773, "APPLICATIONS DEVELOPMENT PRACTICE 3", "ADP372S");
        Student stu2 = new Student("Yusrah", "Soeker", 218150768, "APPLICATIONS DEVELOPMENT PRACTICE 3", "ADP372S");
        Student stu3 = new Student("Junaid", "Martin", 216187606, "APPLICATIONS DEVELOPMENT PRACTICE 3", "ADP372S");
        Student stu4 = new Student("Bella", "Vitu", 214386441, "APPLICATIONS DEVELOPMENT PRACTICE 3", "ADP372S");

        List<Student> list = new ArrayList<>();
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);
        list.add(stu4);

        HashSet<Student> set = new HashSet<>();
        set.add(stu1);
        set.add(stu2);
        set.add(stu3);
        set.add(stu4);

        Map<String, Student> map = new HashMap<>();
        map.put("s001", stu1);
        map.put("s002", stu2);
        map.put("s003", stu3);
        map.put("s004", stu4);

        System.out.println("ARRAYLIST OF STUDENTS THAT ATTEND CPUT: ");
        for(Student elements : list) {
            System.out.println(elements.getFirstName() + " " + elements.getLastName() + " " + elements.getStudentNumber() +
                    " " + elements.getCourse() + " " + elements.getCourseCode());
        }

        System.out.println("\nHASHSET OF STUDENTS THAT ATTEND CPUT: ");
        for(Student students : set) {
            System.out.println(students.getFirstName() + " " + students.getLastName() + " " + students.getStudentNumber() +
                    " " + students.getCourse() + " " + students.getCourseCode());
        }

        System.out.println("\nHASHMAP OF STUDENTS THAT ATTEND CPUT: ");
            System.out.println(map.toString().replace(",", " ").replace("{", " ").replace("}", " ").trim());
    }
}

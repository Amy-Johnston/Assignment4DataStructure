package org.example;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

/**
 * Author: Amy Johnston (218188773)
 * Date: 18 March 2020
 */
public class DataStructuresRefresherTest
{
    Student stu1 = new Student("Amy", "Johnston", 218188773, "APPLICATIONS DEVELOPMENT PRACTICE 3", "ADP372S");
    Student stu2 = new Student("Yusrah", "Soeker", 218150768, "APPLICATIONS DEVELOPMENT PRACTICE 3", "ADP372S");
    Student stu3 = new Student("Junaid", "Martin", 216187606, "APPLICATIONS DEVELOPMENT PRACTICE 3", "ADP372S");
    Student stu4 = new Student("Bella", "Vitu", 214386441, "APPLICATIONS DEVELOPMENT PRACTICE 3", "ADP372S");

    List<Student> list;
    HashSet<Student> set;
    Map<String, Student> map;

    @Before
    public void setUp() throws Exception{
        //LIST
        list = new ArrayList<>();
        list.add(stu1);
        list.add(stu2);

        //SET
        set = new HashSet<>();
        set.add(stu1);
        set.add(stu2);
        set.add(stu3);

        //MAP
        map = new HashMap<>();
        map.put("s001", stu1);
        map.put("s002", stu2);
        map.put("s003", stu3);
    }

    @Test
    public void testList()
    {
        assertEquals("The size of the ArrayList is 2",2, list.size()); //checking size of ArrayList
        list.add(stu3); //adding another student object aka stu3
        assertEquals("The size of the ArrayList is 3", 3, list.size());

        assertEquals(218188773, stu1.getStudentNumber()); //checking to see if the student number is the same
        stu1.setStudentNumber(217177883);
        assertEquals(217177883, stu1.getStudentNumber());

        list.remove(stu1); //removing stu1 from the ArrayList
        assertFalse(list.contains(stu1)); //checking that this statement is false since we removed stu1

        list.add(stu4); //added stu4 to the ArrayList
        assertTrue(list.contains(stu4)); //checking to see if it was actually added

    }

    @Test
    public void testSet()
    {
        assertEquals("The size of the HashSet is 3", 3, set.size()); //checking size of ArrayList
        set.add(stu3); //adding an already added student object, but duplicates are not allowed
        assertEquals("The size of the HashSet is still 3 because HashSet does not allow duplicate values",
                3, set.size()); //confirms that SET does not allow duplicates as the size stays the same

        set.remove(stu1); //removing stu1 from the ArrayList
        assertFalse(set.contains(stu1)); //checking it was removed
    }

    @Test
    public void testMap()
    {
        assertFalse(map.isEmpty()); //checking if it has objects

        map.put("s004", stu4); //adding another

        assertTrue(map.containsKey("s001")); //checking if the HashMap has the key value of s001

        map.remove("s004"); //removing
        assertFalse(map.containsValue(stu4)); //checking it was removed
    }
}

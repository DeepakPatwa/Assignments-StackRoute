package com.stackroute.PE5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainTest {
    public static void main(String[] args)
    {
        Student student1 = new Student("iit01","Deepak",22);
        Student student2 = new Student("iit029","Durgesh",22);
        Student student3 = new Student("iit03","Kishlay",23);
        Student student4 = new Student("iit04", "Achintya", 25);
        Student student5 = new Student("iit05","Saurabh",24);

        List<Student> studentList = new ArrayList<>();

        student1.setId("iit01");student1.setName("Deepak");student1.setAge(22);
        studentList.add(student1);
        student2.setId("iit029");student2.setName("Durgesh");student2.setAge(22);
        studentList.add(student2);
        student3.setId("iit03");student3.setName("Kishlay");student3.setAge(23);
        studentList.add(student3);
        student4.setId("iit04");student4.setName("Achintya");student4.setAge(25);
        studentList.add(student4);
        student5.setId("iit05");student5.setName("Saurabh");student5.setAge(24);
        studentList.add(student5);

        Collections.sort(studentList, new StudentSorter());

        for(Student std: studentList)
            System.out.println(std);

    }
}

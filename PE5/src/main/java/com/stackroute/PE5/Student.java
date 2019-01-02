package com.stackroute.PE5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Student {
    private String id;
    private String name;
    private int age;


    public void setStudentDetail(String id, String name, int age)
    {
        this.id=id;
        this.name=name;
        this.age=age;
    }

    public int getAge() {
        return age;
    }

    public String getId(){
        return id;
    }
    public String getName()
    {
        return name;
    }
    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


}

class StudentSorter implements Comparator<Student> {

    @Override
    public int compare(Student stud1, Student stud2) {
        if(stud1.getAge()==stud2.getAge())
        {
            if(stud1.getName().equals(stud2.getName()))
            {
                return stud1.getId().compareTo(stud2.getId());
            }
            else
                return  stud2.getName().compareTo(stud1.getName());
        }
        else
            return stud2.getAge()-stud1.getAge();
    }
}

class MainTest{
    public static void main(String[] args)
    {
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();
        Student student4 = new Student();
        Student student5 = new Student();

        List<Student> studentList = new ArrayList<>();

        student1.setStudentDetail("iit01","Deepak",22);
        studentList.add(student1);
        student2.setStudentDetail("iit029","Durgesh",22);
        studentList.add(student2);
        student3.setStudentDetail("iit03","Kislay",23);
        studentList.add(student3);
        student4.setStudentDetail("iit04", "Achintya", 25);
        studentList.add(student4);
        student5.setStudentDetail("iit05","Saurabh",24);
        studentList.add(student5);

        Collections.sort(studentList, new StudentSorter());

        for(Student std: studentList)
            System.out.println(std);

    }
}

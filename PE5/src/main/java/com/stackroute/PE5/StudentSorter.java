package com.stackroute.PE5;

import java.util.Comparator;

public class StudentSorter implements Comparator<Student> {

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

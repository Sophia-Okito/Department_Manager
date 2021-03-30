package org.decagon.sophia;

import org.decagon.sophia.model.Person;
import org.decagon.sophia.services.*;

public class Manager {
    public static void main(String[] args) throws Exception {
        Person teacherJoy = new Person("Joy", 100, "Teacher", 3, 200, 0);
        Person teacherJames = new Person("James", 103, "Teacher", 1, 100, 14);

        Person labAttendent = new Person("Judas", 505,  "Non-Academic", 12, 5);

        Person studentBob= new Person("Bob", "Student", 10005,  300, 5, 13);

        Person applicant10 = new Person("Stephen", 23, 10, "Applicant", "" );
        Person applicant15 = new Person("Samuel", 16, 15, "Applicant", "" );

        Person principal = new Person("Fatimah", 1, "Principal", 10);

        Course courses = new Course(5,3,6,4,4);
        Levels year1 = new Levels(200);

        // Displaying Principal Information

        ExamsAndRecord.getInfo(principal);

        // Displaying Teacher Information Before Promotion
        ExamsAndRecord.getInfo(teacherJoy);


        OfficeOfPrincipal.promote(principal, teacherJoy);

        // Displaying Teacher Information After Promotion - Ranking increased.
        ExamsAndRecord.getInfo(teacherJoy);

        //Displaying 100Level courses before teacher teaches
        courses.getCourses(year1);

        //number of times the courses were taught increased by 1 after teaching.
        teacherJoy.teach(courses);

        courses.getCourses(year1);

        // Displaying Teacher Information Before Sack
        ExamsAndRecord.getInfo(teacherJames);

        OfficeOfPrincipal.sack(principal,teacherJames);

        // Displaying Teacher Information After sack - Ranking reset = 0.
        ExamsAndRecord.getInfo(teacherJames);


        //Displaying Student info before expulsion;
        ExamsAndRecord.getInfo(studentBob);

        studentBob.takeClass();

        OfficeOfPrincipal.expel(principal, studentBob);

        //Displaying student info after expulsion - level = 0
        ExamsAndRecord.getInfo(studentBob);

        //Non academic staff info before performing duties;
        ExamsAndRecord.getInfo(labAttendent);

        labAttendent.performDuties();
        teacherJoy.complaint(labAttendent);

        //Non academic staff info after performing duties and reported by a teacher
        // noOfDuties and noOfComplaint both increased by 1;
        ExamsAndRecord.getInfo(labAttendent);


        //Applicant info before successful admission;
        ExamsAndRecord.getInfo(applicant10);

        AdmissionOffice.admit(principal, applicant10);


        //Applicant info after successful admission;
        ExamsAndRecord.getInfo(applicant10);

        //Applicant info before admission;
        ExamsAndRecord.getInfo(applicant15);

        AdmissionOffice.admit(principal, applicant15);

        //Applicant info after unsuccessful admission
       ExamsAndRecord.getInfo(applicant15);


    }
}

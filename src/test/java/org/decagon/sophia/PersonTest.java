package org.decagon.sophia;

import org.decagon.sophia.model.Person;
import org.decagon.sophia.services.Course;
import org.decagon.sophia.services.Levels;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class PersonTest {
    Person teacherJoy = new Person("Joy", 100, "Teacher", 3, 200, 0);
    Person teacherJames = new Person("James", 103, "Teacher", 1, 100, 14);

    Person labAttendent = new Person("Judas", 505,  "Non-Academic", 12, 5);

    Person studentBob= new Person("Bob", "Student", 10005,  300, 5, 13);

    Person applicant10 = new Person("Stephen", 23, 10, "Applicant", "" );
    Person applicant15 = new Person("Samuel", 16, 15, "Applicant", "" );

    Person principal = new Person("Fatimah", 1, "Principal", 10);

    Course courses = new Course(5,3,6,4,4);
    Levels year1 = new Levels(200);


    @Test
    public void testComplaint() {
        int before = labAttendent.getNoOfComplaints();
        teacherJoy.complaint(labAttendent);
        int after = labAttendent.getNoOfComplaints() + 1;
        assertTrue(after > before);
    }
}

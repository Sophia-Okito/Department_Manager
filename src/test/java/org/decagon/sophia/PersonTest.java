package org.decagon.sophia;

import org.decagon.sophia.model.Person;
import org.decagon.sophia.services.Course;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class PersonTest {
    Person teacherJoy = new Person("Joy", 100, "Teacher", 3, 200, 0);

    Person labAttendent = new Person("Judas", 505,  "Non-Academic", 12, 5);

    Course courses = new Course(5,3,6,4,4);

    @Test
    public void testComplaint() {
        int expected = labAttendent.getNoOfComplaints() + 1;
        teacherJoy.complaint(labAttendent);
        int actual = labAttendent.getNoOfComplaints();
        assertEquals(actual, expected);
    }

    @Test
    public void testTeach() {
        int expected = courses.getBiology() + 1;
        teacherJoy.teach(courses);
        int actual = courses.getBiology();
        assertEquals(actual, expected);
    }

    @Test
    public void testPerformDuties() {
        int expected = labAttendent.getNumOfDuties() + 1;
        labAttendent.performDuties();
        int actual = labAttendent.getNumOfDuties();
        assertEquals(actual, expected);
    }
}

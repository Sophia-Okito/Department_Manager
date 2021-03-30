package org.decagon.sophia;

import org.decagon.sophia.model.Person;
import org.decagon.sophia.services.OfficeOfPrincipal;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class OfficeOfPrincipalTest {
    Person teacherJoy = new Person("Joy", 100, "Teacher", 3, 200, 0);
    Person teacherJames = new Person("James", 103, "Teacher", 1, 100, 14);

    Person studentBob= new Person("Bob", "Student", 10005,  300, 5, 13);

    Person principal = new Person("Fatimah", 1, "Principal", 10);

    @Test
    public void testExpel() throws Exception {
        int expected = 0;
        OfficeOfPrincipal.expel(principal, studentBob);
        int actual = studentBob.getLevel();
        assertEquals(actual, expected);
    }

    @Test
    public void testPromote() throws Exception {
        int expected = teacherJoy.getRanking() + 1;
        OfficeOfPrincipal.promote(principal, teacherJoy);
        int actual = teacherJoy.getRanking();
        assertEquals(actual, expected);
    }

    @Test
    public void testSack() throws Exception {
        int expected = 0;
        OfficeOfPrincipal.sack(principal, teacherJames);
        int actual = teacherJames.getRanking();
        assertEquals(actual, expected);
    }

}

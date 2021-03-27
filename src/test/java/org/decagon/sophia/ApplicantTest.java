package org.decagon.sophia;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
//import static org.junit.Assert.assertThat;

public class ApplicantTest {

    @Test
    public void testGetGrade() {
        Applicant app1 = new Applicant("AY", 1001, 24);
        System.out.println(app1.getGrade());
        assertTrue("Error, random is too high",  100 >= app1.getGrade());
        assertTrue("Error, random is too low",  0  <= app1.getGrade());
    }

    @Test
    public void testGetAdmissionStatus() {
        Applicant app2 = new Applicant("Francis", 1002, 26);
        assertEquals("Unsuccessful", app2.getAdmissionStatus());
    }


}

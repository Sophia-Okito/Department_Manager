package org.decagon.sophia;

import org.decagon.sophia.model.Person;
import org.decagon.sophia.services.AdmissionOffice;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AdmissionOfficeTest {
    Person applicant10 = new Person("Stephen", 23, 10, "Applicant", "" );
    Person applicant15 = new Person("Samuel", 16, 15, "Applicant", "" );

    Person principal = new Person("Fatimah", 1, "Principal", 10);

    @Test
    public void testAdmit() throws Exception {
        String expected = applicant10.getAvgGrade() > 59 ? "Successful" : "Unsuccessful";
        AdmissionOffice.admit(principal, applicant10);
        assertEquals(applicant10.getStatus(), expected);

        AdmissionOffice.admit(principal, applicant15);
        assertEquals("Unsuccessful", applicant15.getStatus());
    }
}

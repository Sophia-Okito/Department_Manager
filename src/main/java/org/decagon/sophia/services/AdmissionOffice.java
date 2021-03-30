package org.decagon.sophia.services;

import org.decagon.sophia.model.Person;

public class AdmissionOffice {
    public static void admit(Person principal, Person applicant) {

        /* Admit applicants and update their status*/

        if (principal.getPosition().equals("Principal") && applicant.getPosition().equals("Applicant")) {
            if (applicant.getAvgGrade() > 59 && applicant.getAge() > 17) {
                applicant.setStatus("Successful");
            } else {
                applicant.setStatus("Unsuccessful");
            }
        } else {
            System.err.println("\nNot an applicant\n");
        }
    }

}

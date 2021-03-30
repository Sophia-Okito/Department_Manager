package org.decagon.sophia.services;

import org.decagon.sophia.model.Person;

public class ExamsAndRecord {
    public static void getInfo(Person person) throws Exception {

        /* Display information about person */

        switch (person.getPosition()) {
            case "Applicant":
                System.out.printf("\nApplicant with ID %d\nName: %s\nAge: %d\nGrade: %d\nAdmission Status: %s\n", person.getId(),
                        person.getName(), person.getAge(), person.getAvgGrade(), person.getStatus());
                break;
            case "Student":
                System.out.printf("\nStudent with ID %d\nName: %s\nLevel: %s\nTotal Course: %d\nAverage Grade: %d\nNo. " +
                        "of Complaint: %d\n", person.getId(), person.getName(), person.getLevel(),
                        person.getTotalCourses(), person.getAvgGrade(), person.getNoOfComplaints());
                break;

            case "Teacher":
                System.out.printf("\nTeacher with ID %d\nName: %s\nRanking: %s\nLevel Taught: %d\nNo. of Complaint %d\n",
                        person.getId(), person.getName(), person.getRanking(), person.getLevelTaught(), person.getNoOfComplaints());
                break;

            case "Non-Academic":
                System.out.printf("\nNon Academic Staff with ID of %d\nName: %s\nNo of Duties Performed: %d\nNo of Complaint: " +
                        "%d\n", person.getId(), person.getName(), person.getNumOfDuties(), person.getNoOfComplaints());
                break;

            case "Principal":
                System.out.printf("\nPrincipal with ID of %d\nName: %s\nRanking: %d\n", person.getId(), person.getName(), person.getRanking());
                break;
            default:
                System.err.println("\nPerson info can not be displayed or does not exist.\n");
                break;
        }

    }

}

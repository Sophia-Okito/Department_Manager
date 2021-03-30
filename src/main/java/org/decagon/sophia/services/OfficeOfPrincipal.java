package org.decagon.sophia.services;

import org.decagon.sophia.model.Person;

public class OfficeOfPrincipal {
    public static void expel(Person principal, Person student) {

        /* Expels Students  and reset their details*/

        if (student.getPosition().equals("Student") && principal.getPosition().equals("Principal")) {
            if (student.getNoOfComplaints() > 10) {
                student.setLevel(0);
                student.setTotalCourses(0);
                student.setAvgGrade(0);
                student.setNoOfComplaints(0);
                System.out.println("\nPrincipal expelled " + student.getName() + "\n") ;
            }
        } else {
            System.err.println("\nThis person cannot be expelled or does not have the authority to expel\n");
        }
    }


    public static void promote(Person principal, Person person) {

        /* Promote teachers and students and update their ranking and level respectively */

        if ((person.getPosition().equals("Student") || person.getPosition().equals("Teacher"))
                && principal.getPosition().equals("Principal")) {
            if (person.getPosition().equals("Student") && person.getLevel() < 300) {
                person.setLevel(person.getLevel() + 100);
                System.out.println("\nPrincipal promoted " + person.getName() + "\n");
            } else {
                person.setRanking(person.getRanking() + 1);
                System.out.println("\nPrincipal promoted " + person.getName() + "\n");
            }
        } else {
            System.err.println("This person cannot be promoted");
        }

    }


    public static void sack(Person principal, Person person) {

        /* sack teacher and non academic staff and reset their details */

        if (principal.getPosition().equals("Principal") && (person.getPosition().equals("Teacher") ||
                person.getPosition().equals("Non-Academic")) && person.getNoOfComplaints() > 10) {
            if (person.getPosition().equals("Non-Academic") && person.getNumOfDuties() < 1){
                person.setNoOfComplaints(0);
                System.out.println("Principal sack " + person.getName() + "\n");
            } else {
                person.setRanking(0);
                person.setNoOfComplaints(0);
                person.setLevelTaught(0);
                System.out.println("Principal sack " + person.getName() + "\n");

            }
        } else {
            System.err.println("This person cannot be sacked\n");
        }
    }
}

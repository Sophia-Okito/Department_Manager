package org.decagon.sophia.model;

import org.decagon.sophia.services.Course;

import java.util.Objects;

public class Person implements PersonInterface {

    /* * @class create student, staff and applicant of university. */

    private final String name;
    private int age;
    private int id;
    private final String position;
    private int numOfDuties;
    private int level;
    private int totalCourses;
    private int avgGrade;
    private int noOfComplaints;
    private String status = "";
    private int levelTaught;
    private int ranking;

    public Person(String name, int id, String position, int ranking) {

        /* Principal constructor */

        this.name = name;
        this.id = id;
        this.position = position;
        this.ranking = ranking;
    }

    public Person(String name, int id, String position, int ranking, int levelTaught, int noOfComplaints) {

        /* Teacher constructor */

        this.name = name;
        this.id = id;
        this.position = position;
        this.noOfComplaints = noOfComplaints;
        this.levelTaught = levelTaught;
        this.ranking = ranking;
    }

    public Person(String name, int id, String position, int numOfDuties, int noOfComplaints) {

        /* Non-Academic Staff constructor */

        this.name = name;
        this.id = id;
        this.position = position;
        this.numOfDuties = numOfDuties;
        this.noOfComplaints = noOfComplaints;
    }


    public Person(String name, String position, int id, int level, int totalCourses, int noOfComplaints) {

        /* Student constructor */

        this.name = name;
        this.id = id;
        this.position = position;
        this.level = level;
        this.totalCourses = totalCourses;
        this.noOfComplaints = noOfComplaints;
        avgGrade = (int) (Math.random() * 101);
    }


    public Person(String name, int age, int id, String position, String status) {

        /* Applicant Constructor */

        this.name = name;
        this.age = age;
        this.id = id;
        this.position = position;
        this.status = status;
        avgGrade = (int) (Math.random() * 101);
    }

    @Override
    public void complaint(Person person) {

        /* Report Teacher, Student and non-academic staff and increases number of complaint by 1 */

        if (person.position.equals("Teacher") || person.position.equals("Student") || person.position.equals("Non-Academic")) {
            System.out.println("\nI was Disrespected\n");
            person.noOfComplaints++;
            System.out.println(person.name + " got reported\n");
        } else {
            System.out.println("\nThis Person is beyond Complaint\n");
        }

    }

    @Override
    public void teach(Course subject) {

        /* Teacher teaches courses based on level and update details */

        if (Objects.equals(this.position, "Teacher")) {
            if (this.levelTaught == 100) {
                subject.setMaths(subject.getMaths() + 1);
                subject.setEnglish(subject.getEnglish() + 1);
            } else if (this.levelTaught == 200) {
                subject.setBiology(subject.getBiology() + 1);
                subject.setChemistry(subject.getChemistry() + 1);
            } else  if (this.levelTaught == 300) {
                subject.setPhysics(subject.getPhysics() + 1);
                subject.setChemistry(subject.getChemistry() + 1);
            } else {
                System.out.println("No course for this level");
            }

        } else {
            System.out.println("This person can not teach");
        }
    }


    @Override
    public void takeClass() {

        /* students take courses */

        if (this.position.equals("Student")) {
            System.out.println("\nLearning - " + this.name);
        } else {
            System.out.println("\nThis person can not take course\n");
        }
    }


    @Override
    public void performDuties() {

        /* non academic staff perform duties and update details. */

        if (this.position.equals("Non-Academic")) {
            System.out.println("\nPerforming Duties - " + this.name + "\n");
            this.numOfDuties += 1;
        } else {
            System.out.println("\nWhat Duties?\n");
        }
    }

    public int getNoOfComplaints() {
        return noOfComplaints;
    }

    public String getPosition() {
        return position;
    }

    public int getAvgGrade() {
        return avgGrade;
    }

    public int getAge() {
        return age;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getNumOfDuties() {
        return numOfDuties;
    }

    public int getLevel() {
        return level;
    }

    public int getTotalCourses() {
        return totalCourses;
    }

    public String getStatus() {
        return status;
    }

    public int getLevelTaught() {
        return levelTaught;
    }

    public int getRanking() {
        return ranking;
    }

    public void setNumOfDuties(int numOfDuties) {
        this.numOfDuties = numOfDuties;
    }

    public void setNoOfComplaints(int noOfComplaints) {
        this.noOfComplaints = noOfComplaints;
    }

    public void setLevelTaught(int levelTaught) {
        this.levelTaught = levelTaught;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setTotalCourses(int totalCourses) {
        this.totalCourses = totalCourses;
    }

    public void setAvgGrade(int avgGrade) {
        this.avgGrade = avgGrade;
    }
}

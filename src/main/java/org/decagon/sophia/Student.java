package org.decagon.sophia;

public class Student extends PersonalInfo implements Department {
    private String level;
    private int totalCourses;
    private int totalGrades;
    private int avgGrade;
    private int noOfComplaints;
    private String status;

    public Student(String name, int id, String level, int totalCourses) {
        super(name, id);
        this.level = level;
        this.totalCourses = totalCourses;
        noOfComplaints = (int) (Math.random() * 16);
        totalGrades = (int) (Math.random() * 101) * totalCourses;
        avgGrade = (int) (totalGrades / totalCourses);
        status = "In-School";

    }

    public String getLevel() {
        return level;
    }

    public int getTotalCourses() {
        return totalCourses;
    }

    public int getTotalGrades() {
        return totalGrades;
    }

    public int getAvgGrade() {
        return avgGrade;
    }

    public int getNoOfComplaints() {
        return noOfComplaints;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    @Override
    public void complaint() {
        System.out.println("Disrepected by " + this.id);
    }

    public void takeClass() {
        System.out.println("This class was awesome");
    }

    @Override
    public void getInfo() {
        System.out.println("Student with ID " + this.id + "\nName: " + this.getName() + "\nStudent Status: " + this.status
                + "\nLevel: " + this.level + "\nTotal Course: " + this.totalCourses + "\nAverage: " + this.avgGrade
                + "\nNo. of Complaint: " + this.noOfComplaints);
    }

}

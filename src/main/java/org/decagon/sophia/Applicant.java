package org.decagon.sophia;

public class Applicant extends PersonalInfo {
    private int grade;
    private String admissionStatus = "Unsuccessful";

    public Applicant(String name, int id, int age) {
        super(name, id, age);
        grade = (int) (Math.random() * 101);
    }

    public int getGrade() {
        return this.grade;
    }

    public String getAdmissionStatus() {
        return admissionStatus;
    }

    public void setAdmissionStatus(String admissionStatus) {
        this.admissionStatus = admissionStatus;
    }

    public void getInfo() {
        System.out.println("Applicant with ID " + this.id + "\nName: " + this.getName() + "\nAge: " +
                this.getAge() + "\nGrade: " + this.grade + "\nAdmission Status: " + this.admissionStatus);
    }
}

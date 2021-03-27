package org.decagon.sophia;

public class Principal {

    public void admit(Applicant applicant){
        if (applicant.getGrade() >  69 && !(applicant.getAge() <= 17)) {
            applicant.setAdmissionStatus("Successful");
        }
    }


    public void expel(Student student) {
        if (student.getNoOfComplaints() > 10 || student.getAvgGrade() < 30) {
            student.setStatus("Expel");
        }
    }


    public void promoteStudent(Student student) {
        if (student.getAvgGrade() > 49 && student.getStatus() == "In-School") {
            student.setLevel("Year 2");
        }

    }

    public void sackTeacher(Teacher teacher) {
        if (teacher.getNoOfComplaints() > 10) {
            teacher.setStatus("Sacked");
        }
    }
}

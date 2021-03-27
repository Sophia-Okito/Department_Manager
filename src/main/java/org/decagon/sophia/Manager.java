package org.decagon.sophia;

public class Manager {
    public static void main(String[] args) {
        Applicant app1 = new Applicant("Sophia", 1001, 18);
        app1.setAdmissionStatus();
        app1.getInfo();

        System.out.println();

        Student std1 = new Student("Wilson", 10001, "Year 1", 4);
        std1.getInfo();

        System.out.println();

        NonAcademic staff1 = new NonAcademic("Jessica", 2002, 23);
        staff1.getInfo();

        System.out.println();

        Teacher teacher = new Teacher("James", 3003, "Year 2", 2);
        teacher.getInfo();
    }
}

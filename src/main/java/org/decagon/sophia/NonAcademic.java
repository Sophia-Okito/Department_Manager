package org.decagon.sophia;

public class NonAcademic extends PersonalInfo implements Department {
    private int numOfDuties;
    private int noOfComplaints;

    public NonAcademic(String name, int id, int age) {
        super(name, id, age);
        numOfDuties = (int) (Math.random() * 11);
        noOfComplaints = (int) (Math.random() * 16);
    }

    @Override
    public void complaint() {
        System.out.println("Disrepected by " + this.id);
    }

    public void performDuties() {
        System.out.println("Duty done!");
    }

    public int getNumOfDuties() {
        return this.numOfDuties;
    }

    public int getNoOfComplaints() {
        return noOfComplaints;
    }

    @Override
    public void getInfo() {
        System.out.println("Staff with ID " + this.id + "\nName: " + this.getName() + "\nTotal Duties Performed: "
                + this.numOfDuties + "\nNo. of Complaint " + this.noOfComplaints);
    }
}

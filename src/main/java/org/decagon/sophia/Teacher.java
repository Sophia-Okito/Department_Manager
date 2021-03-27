package org.decagon.sophia;

public class Teacher extends PersonalInfo implements Department {
    private String levelTaught;
    private int noOfCourses;
    private int noOfComplaints;
    private String status;

    public Teacher(String name, int id, String levelTaught, int noOfCourses) {
        super(name, id);
        this.levelTaught = levelTaught;
        this.noOfCourses = noOfCourses;
        noOfComplaints = (int) (Math.random() * 16);
        status = "Employed";
    }

    public void teach() {
        System.out.println("Teaching.....");
    }

    @Override
    public void complaint() {
        System.out.println("Disrepected by " + this.id);
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

    @Override
    public void getInfo() {
        System.out.println("Teacher with ID " + this.id + "\nName: " + this.getName() + "\nLevel Taught: " + this.levelTaught +
                "\nTotal no. of Courses: " + this.noOfCourses + "\nNo. of Complaint " + this.noOfComplaints);
    }
}

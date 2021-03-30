package org.decagon.sophia.services;

public class Course extends Levels {
    private int maths;
    private int english;
    private int biology;
    private int physics;
    private int chemistry;

    public Course(int maths, int english, int biology, int physics, int chemistry) {
        super();
        this.maths = maths;
        this.english = english;
        this.biology = biology;
        this.physics = physics;
        this.chemistry = chemistry;
    }

    public void setMaths(int maths) {
        this.maths = maths;
    }

    public void setEnglish(int english) {
        this.english = english;
    }

    public void setBiology(int biology) {
        this.biology = biology;
    }

    public void setPhysics(int physics) {
        this.physics = physics;
    }

    public void setChemistry(int chemistry) {
        this.chemistry = chemistry;
    }

    public int getMaths() {
        return maths;
    }

    public int getEnglish() {
        return english;
    }

    public int getBiology() {
        return biology;
    }

    public int getPhysics() {
        return physics;
    }

    public int getChemistry() {
        return chemistry;
    }

    public void getCourses(Levels lvl) {
        if (lvl.level == 100) {
            System.out.printf("\nNumber of times courses were taught\nMaths: %d\nEnglish: %d\n", getMaths(), getEnglish());
        } else if (lvl.level == 200) {
            System.out.printf("\nNumber of times courses were taught\nBiology: %d\nChemistry: %d\n", getBiology(), getChemistry());
        } else if (lvl.level == 300) {
            System.out.printf("\nNumber of times courses taught\nChemistry: %d\nPhysics: %d\n", getChemistry(), getPhysics());
        } else {
            System.out.println("\nNo level found\n");
        }

    }
}

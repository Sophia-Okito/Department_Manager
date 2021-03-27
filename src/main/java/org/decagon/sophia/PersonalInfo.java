package org.decagon.sophia;

public class PersonalInfo {
    private String name;
    private int age;
    public int id;
    private String status;

    public PersonalInfo(String name, String status, int id, int age) {
        this.status = status;
        this.name = name;
        this.id = id;
        this.age = age;

    }

    public PersonalInfo(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;

    }

    public PersonalInfo(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return this.name;
    }

    public String getStatus() {
        return status;
    }
}

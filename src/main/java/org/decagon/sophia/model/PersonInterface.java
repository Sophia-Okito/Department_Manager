package org.decagon.sophia.model;

import org.decagon.sophia.services.Course;

public interface PersonInterface {
    void complaint(Person person);
    void teach(Course subject);
    void takeClass();
    void performDuties();
}

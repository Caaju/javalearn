package Entities;

public class Room {
    private Student student;

    public Student getStudent() {
        return student;
    }

    public void rented(Student student){
        this.student=student;
    }
}

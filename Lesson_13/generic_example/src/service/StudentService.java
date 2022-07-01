package service;

import model.Student;
import service.Service;

public class StudentService implements Service<Student> {
    @Override
    public Student add() {
        return null;
    }

    @Override
    public void updateName(Student student) {

    }

    @Override
    public boolean delete(Student student) {
        return false;
    }
}

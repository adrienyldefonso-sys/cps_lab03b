package pe.edu.tecsup.lab03.services;

import pe.edu.tecsup.lab03.entities.StudentEntity;
import pe.edu.tecsup.lab03.repositories.StudentRepository;

import java.util.List;

public class StudentService {
    private StudentRepository repository;

    public StudentService() {
        this.repository = new StudentRepository();
    }

    public void addStudent(String name, String grade) {
        StudentEntity student = new StudentEntity(name, grade);
        repository.save(student);
    }

    public List<StudentEntity> getStudents() {
        return repository.findAll();
    }

    public StudentEntity getStudentByName(String name) {
        return repository.findByName(name);
    }

    public boolean removeStudent(String name) {
        return repository.deleteByName(name);
    }
}
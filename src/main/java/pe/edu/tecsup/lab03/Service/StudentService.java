package pe.edu.tecsup.lab03.services;

import pe.edu.tecsup.lab03.entities.StudentEntity;
import pe.edu.tecsup.lab03.repositories.StudentRepository;
import java.util.List;

public class StudentService {
    private StudentRepository repository;

    public StudentService() {
        this.repository = new StudentRepository();
    }

    public void addStudent(String name, double grade) {
        // Lógica simple para asignar un ID automático
        StudentEntity student = new StudentEntity((int)(Math.random() * 1000), name, grade);
        repository.save(student);
    }

    public List<StudentEntity> getStudents() {
        return repository.getAll();
    }
}
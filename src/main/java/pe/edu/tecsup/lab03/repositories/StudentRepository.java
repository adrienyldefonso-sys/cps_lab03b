package pe.edu.tecsup.lab03.repositories;

import pe.edu.tecsup.lab03.entities.StudentEntity;
import java.util.ArrayList;
import java.util.List;

public class StudentRepository {
    // Simulamos una base de datos
    private List<StudentEntity> students = new ArrayList<>();

    public void save(StudentEntity student) {
        students.add(student);
    }

    public List<StudentEntity> getAll() {
        return students;
    }
}
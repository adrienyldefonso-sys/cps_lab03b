package pe.edu.tecsup.lab03.repositories;

import pe.edu.tecsup.lab03.entities.StudentEntity;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository {
    private List<StudentEntity> students;

    public StudentRepository() {
        this.students = new ArrayList<>();
    }

    public void save(StudentEntity student) {
        students.add(student);
    }

    public List<StudentEntity> findAll() {
        return students;
    }

    public StudentEntity findByName(String name) {
        for (StudentEntity s : students) {
            if (s.getName().equalsIgnoreCase(name)) {
                return s;
            }
        }
        return null;
    }

    public boolean deleteByName(String name) {
        return students.removeIf(s -> s.getName().equalsIgnoreCase(name));
    }
}
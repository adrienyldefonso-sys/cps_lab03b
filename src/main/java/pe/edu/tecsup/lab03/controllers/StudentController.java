package pe.edu.tecsup.lab03.controllers;

import pe.edu.tecsup.lab03.entities.StudentEntity;
import pe.edu.tecsup.lab03.services.StudentService;
import java.util.List;

public class StudentController {
    private StudentService service;

    public StudentController() {
        this.service = new StudentService();
    }

    public void manageStudents() {
        // Ejemplo de lógica
        service.addStudent("Adriel", "17.5");
        service.addStudent("Carlos", "14.0");

        List<StudentEntity> list = service.getStudents();
        for (StudentEntity s : list) {
            System.out.println("Alumno: " + s.getName() + " - Nota: " + s.getGrade());
        }
    }
}
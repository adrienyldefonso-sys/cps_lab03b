package pe.edu.tecsup.lab03.controllers;

import pe.edu.tecsup.lab03.services.StudentService;

public class StudentController {
    private StudentService service;

    public StudentController() {
        this.service = new StudentService();
    }

    public void createStudent(String name, double grade) {
        service.addStudent(name, grade);
        System.out.println("Estudiante registrado: " + name);
    }

    public void showAllStudents() {
        System.out.println("--- Lista de Estudiantes ---");
        service.getStudents().forEach(s ->
                System.out.println("ID: " + s.getId() + " | Nombre: " + s.getName() + " | Nota: " + s.getGrade())
        );
    }
}
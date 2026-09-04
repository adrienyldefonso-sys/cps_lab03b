package pe.edu.tecsup.lab03.entities;

public class StudentEntity {
    private String name;
    private String grade;

    public StudentEntity() {
    }

    public StudentEntity(String name, String grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "StudentEntity{" +
                "name='" + name + '\'' +
                ", grade='" + grade + '\'' +
                '}';
    }
}
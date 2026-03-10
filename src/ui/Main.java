package ui;

import model.Person;
import model.Student;
import model.Teacher;

public class Main {
    public static void main(String[] args) {

        System.out.println("Sistema de Gestión Académica");

        Person person = new Person();
        person.setFirstName("Carlos");
        person.setLastName("Lopez");

        Student student = new Student();
        student.setFirstName("Miguel");
        student.setBirthDate("2005-08-10");

        Teacher teacher = new Teacher();
        teacher.setFirstName("Ana");

        System.out.println("Persona: " + person.getFirstName());
        System.out.println("Estudiante: " + student.getFirstName());
        System.out.println("Profesor: " + teacher.getFirstName());

    }
}
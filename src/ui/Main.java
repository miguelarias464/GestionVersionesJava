package ui;

import model.*;

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
        User user = new User(1, "miguel", "miguel@mail.com", "123", "activo", "2026");
        Role role = new Role(1, "admin", "Administrador");
        UserRole userRole = new UserRole(user.getUserId(), role.getRoleId());

        System.out.println("\n=== USERS & ROLES ===");
        System.out.println("Usuario: " + user.getUsername());
        System.out.println("Rol: " + role.getName());
        System.out.println("Relación: " + userRole.getUserId() + " - " + userRole.getRoleId());
    }
}
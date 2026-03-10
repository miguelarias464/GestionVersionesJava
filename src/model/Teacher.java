package model;

public class Teacher extends Person {

    public Teacher() {
        super();
    }

    public Teacher(String userId, String code, String documentNumber,
                   String firstName, String lastName, String status) {

        super(userId, code, documentNumber, firstName, lastName, status);
    }
}
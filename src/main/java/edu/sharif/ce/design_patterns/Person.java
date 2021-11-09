package edu.sharif.ce.design_patterns;

import java.time.LocalDate;

public class Person implements Cloneable {
    public Person(int nationalCode, String firstName, String lastName, String fatherName, LocalDate birthDate) {
        throw new UnsupportedOperationException();
    }

    public void setNationalCode(int nationalCode) {
        throw new UnsupportedOperationException();
    }

    public void setFirstName(String firstName) {
        throw new UnsupportedOperationException();
    }

    public void setLastName(String lastName) {
        throw new UnsupportedOperationException();
    }

    public void setFatherName(String fatherName) {
        throw new UnsupportedOperationException();
    }

    public void setBirthDate(LocalDate birthDate) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean equals(Object o) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int hashCode() {
        throw new UnsupportedOperationException();
    }

    @Override
    public Person clone() {
        throw new UnsupportedOperationException();
    }
}

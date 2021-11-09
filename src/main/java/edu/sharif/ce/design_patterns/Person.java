package edu.sharif.ce.design_patterns;

import java.time.LocalDate;
import java.util.Objects;

public class Person implements Cloneable {
    private int nationalCode;
    private String firstName;
    private String lastName;
    private String fatherName;
    private LocalDate birthDate;

    public Person(int nationalCode, String firstName, String lastName, String fatherName, LocalDate birthDate) {
        this.nationalCode = nationalCode;
        this.firstName = firstName;
        this.lastName = lastName;
        this.fatherName = fatherName;
        this.birthDate = birthDate;
    }

    private Person(Person other) {
        if (other != null) {
            this.nationalCode = other.nationalCode;
            this.firstName = other.firstName;
            this.lastName = other.lastName;
            this.fatherName = other.fatherName;
            this.birthDate = other.birthDate;
        }
    }

    public int getNationalCode() {
        return nationalCode;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFatherName() {
        return fatherName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setNationalCode(int nationalCode) {
        this.nationalCode = nationalCode;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return nationalCode == person.nationalCode && Objects.equals(firstName, person.firstName) && Objects.equals(lastName, person.lastName) && Objects.equals(fatherName, person.fatherName) && Objects.equals(birthDate, person.birthDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nationalCode, firstName, lastName, fatherName, birthDate);
    }

    @Override
    public Person clone() {
        try {
            return (Person) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}

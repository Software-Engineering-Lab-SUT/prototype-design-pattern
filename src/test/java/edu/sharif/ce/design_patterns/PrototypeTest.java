package edu.sharif.ce.design_patterns;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class PrototypeTest {
    @Test
    public void EqualsTest() {
        var person = new Person(1, "Hossein", "Behboudi", "Ali",
                LocalDate.of(1999, 7, 14));
        var newPerson = new Person(1, "Hossein", "Behboudi", "Ali",
                LocalDate.of(1999, 7, 14));
        Assert.assertEquals(person, newPerson);
    }

    @Test
    public void nationalCodeNotEqualsTest() {
        var person = new Person(1, "Hossein", "Behboudi", "Ali",
                LocalDate.of(1999, 7, 14));
        var newPerson = new Person(2, "Hossein", "Behboudi", "Ali",
                LocalDate.of(1999, 7, 14));
        Assert.assertNotEquals(person, newPerson);
    }

    @Test
    public void firstNameNotEqualsTest() {
        var person = new Person(1, "Hossein", "Behboudi", "Ali",
                LocalDate.of(1999, 7, 14));
        var newPerson = new Person(1, "Armin", "Behboudi", "Ali",
                LocalDate.of(1999, 7, 14));
        Assert.assertNotEquals(person, newPerson);
    }

    @Test
    public void lastNameNotEqualsTest() {
        var person = new Person(1, "Hossein", "Behboudi", "Ali",
                LocalDate.of(1999, 7, 14));
        var newPerson = new Person(1, "Hossein", "Bahrami", "Ali",
                LocalDate.of(1999, 7, 14));
        Assert.assertNotEquals(person, newPerson);
    }

    @Test
    public void fatherNameNotEqualsTest() {
        var person = new Person(1, "Hossein", "Behboudi", "Ali",
                LocalDate.of(1999, 7, 14));
        var newPerson = new Person(1, "Hossein", "Behboudi", "Amin",
                LocalDate.of(1999, 7, 14));
        Assert.assertNotEquals(person, newPerson);
    }

    @Test
    public void birthDateNotEqualsTest() {
        var person = new Person(1, "Hossein", "Behboudi", "Ali",
                LocalDate.of(1999, 7, 14));
        var newPerson = new Person(1, "Hossein", "Behboudi", "Ali",
                LocalDate.of(1999, 6, 14));
        Assert.assertNotEquals(person, newPerson);
    }

    @Test
    public void nationalCodeDeepCloneTest() {
        var person = new Person(1, "Hossein", "Behboudi", "Ali",
                LocalDate.of(1999, 7, 14));
        var newPerson = person.clone();
        newPerson.setNationalCode(2);
        Assert.assertNotEquals(person, newPerson);
    }


    @Test
    public void firstNameDeepCloneTest() {
        var person = new Person(1, "Hossein", "Behboudi", "Ali",
                LocalDate.of(1999, 7, 14));
        var newPerson = person.clone();
        newPerson.setFirstName("Arman");
        Assert.assertNotEquals(person, newPerson);
    }

    @Test
    public void lastNameDeepCloneTest() {
        var person = new Person(1, "Hossein", "Behboudi", "Ali",
                LocalDate.of(1999, 7, 14));
        var newPerson = person.clone();
        newPerson.setLastName("Rezaee");
        Assert.assertNotEquals(person, newPerson);
    }

    @Test
    public void fatherNameDeepCloneTest() {
        var person = new Person(1, "Hossein", "Behboudi", "Ali",
                LocalDate.of(1999, 7, 14));
        var newPerson = person.clone();
        newPerson.setFatherName("Amir");
        Assert.assertNotEquals(person, newPerson);
    }

    @Test
    public void birthDateDeepCloneTest() {
        var person = new Person(1, "Hossein", "Behboudi", "Ali",
                LocalDate.of(1999, 7, 14));
        var newPerson = person.clone();
        newPerson.setBirthDate(LocalDate.of(1998, 7, 14));
        Assert.assertNotEquals(person, newPerson);
    }

    @Test
    public void prototypeTest() {
        var person = new Person(1, "Hossein", "Behboudi", "Ali",
                LocalDate.of(1999, 7, 14));
        var newPerson = person.clone();
        Assert.assertEquals(person, newPerson);
    }
}

package org.example;

import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;

public class Author extends Person{
    public Author(int id, String firstname, String lastname, LocalDate birthdate) {
        super(id, firstname, lastname, birthdate);
    }
}
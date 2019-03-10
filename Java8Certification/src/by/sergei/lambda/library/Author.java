package by.sergei.lambda.library;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public class Author {
    
    private String name;
    private String lastName;
    private LocalDate birthDate;
    private String country;
    private long income;
    
    public Author(String name, String lastName, LocalDate birthDate, String country, long income) {
        this.name = name;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.country = country;
        this.income = income;
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public LocalDate getBirthDate() {
        return birthDate;
    }
    public void setBirthDate(LocalDate  birthDate) {
        this.birthDate = birthDate;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public long getIncome() {
        return income;
    }
    public void setIncome(long income) {
        this.income = income;
    }

}

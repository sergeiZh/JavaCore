package by.sergei.lambda.library;

import java.util.Date;
import java.util.List;

public class Author {
    
    private String name;
    private String lastName;
    private Date birthDate;
    private String country;
    private int age;
    private List<Award> awards;
    private long income;
    
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
    public Date getBirthDate() {
        return birthDate;
    }
    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public List<Award> getAwards() {
        return awards;
    }
    public void setAwards(List<Award> awards) {
        this.awards = awards;
    }
    public long getIncome() {
        return income;
    }
    public void setIncome(long income) {
        this.income = income;
    }

}

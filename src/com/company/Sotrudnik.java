package com.company;

public class Sotrudnik {

    private String name;
    private String surname;
    private String lastname;
    private String email;
    private long phone_number;
    private int salary;
    private int age;
    private String position;

    public Sotrudnik(String name, String surname, String lastname, String email, long phone_number, int salary, int age, String position) {
        this.name = name;
        this.surname = surname;
        this.lastname = lastname;
        this.email = email;
        this.phone_number = phone_number;
        this.salary = salary;
        this.age = age;
        this.position = position;
    }
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public String getLastname() {
        return lastname;
    }
    public String getEmail() {
        return email;
    }
    public long getPhone_number() {
        return phone_number;
    }
    public int getSalary() {
        return salary;
    }
    public int getAge() {
        return age;
    }
    public String getPosition() {
        return position;
    }


}

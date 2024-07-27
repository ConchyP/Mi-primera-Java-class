package dev.conchy.models;

public class Person {

    private String name;
    private String lastName;
    private String dni;
    private int date; 
    private String country;
    private char gender;

    public Person(String name, String lastName, String dni, int date, String country, char gender) {
        this.name = name;
        this.lastName = lastName;
        this.dni = dni;
        this.date = date;
        this.country = country;
        this.gender = gender;
    }

  
    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDni() {
        return dni;
    }

    public int getDate() {
        return date;
    }

    public String getCountry() {
        return country;
    }

    public char getGender() {
        return gender;
    }


    public void print() {
        System.out.println(this.toString());

    }

    @Override
    public String toString() {
        return "Person:\n" +
                "Name: " + name + "\n" +
                "Last Name: " + lastName + "\n" +
                "DNI: " + dni + "\n" +
                "Date: " + date + "\n" +
                "Country: " + country + "\n" +
                "Gender: " + gender;
    }
};

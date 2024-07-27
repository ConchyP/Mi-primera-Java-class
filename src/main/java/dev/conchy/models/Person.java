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
        System.out.println("Name: " + name);
        System.out.println("Last Name: " + lastName);
        System.out.println("DNI: " + dni);
        System.out.println("Date: " + date);
        System.out.println("Country: " + country);
        System.out.println("Gender: " + gender);
    }

    public static void main(String[] args) {
        Person person1 = new Person("Bob", "Esponja", "01010101X", 1999, "EE.UU", 'H');
        Person person2 = new Person("Arenita", "Mejillas", "46543654A", 2001, "Mexico", 'M');
        
        person1.print();
        System.out.println();
        person2.print();
    }
};

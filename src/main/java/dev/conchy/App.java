package dev.conchy;

import dev.conchy.models.Person;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }
    
    public static void main(String[] args) {
        Person person1 = new Person("Bob", "Esponja", "01010101X", 1999, "EE.UU", 'H');
        Person person2 = new Person("Arenita", "Mejillas", "46543654A", 2001, "Mexico", 'M');
        
        person1.print();
        System.out.println();
        person2.print();
        System.out.println();

    }
}

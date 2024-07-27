package dev.conchy.models;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PersonTest {
    @Test
    void testGetName() {
        
        Person Indi = new Person("Indi","Love","01010101W",1988,"Spain",'M');
        assertEquals("Indi", Indi.getName());
        
    }

    @Test
    void testGetLastName() {
        
          Person Indi = new Person("Indi","Love","01010101W",1988,"Spain",'M');
          assertEquals("Love", Indi.getLastName());
    }

    @Test
    void testGetDate() {
          
          Person Indi = new Person("Indi","Love","01010101W",1988,"Spain",'M');
          assertEquals("01010101W", Indi.getDni());
    }

    @Test
    void testGetDni() {
           
           Person Indi = new Person("Indi","Love","01010101W",1988,"Spain",'M');
           assertEquals(1988, Indi.getDate());
     }

    @Test
    void testGetCountry() {
         
         Person Indi = new Person("Indi","Love","01010101W",1988,"Spain",'M');
         assertEquals("Spain", Indi.getCountry());
    }

    @Test
    void testGetGender() {
          
          Person Indi = new Person("Indi","Love","01010101W",1988,"Spain",'M');
          assertEquals('M', Indi.getGender());
    }
    }
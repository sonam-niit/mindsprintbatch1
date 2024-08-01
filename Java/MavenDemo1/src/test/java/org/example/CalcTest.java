package org.example;

import org.junit.jupiter.api.*;

public class CalcTest {
    Calculator c;

    @BeforeAll
    public static void beforeAll(){
        System.out.println("Before All");
    }
    @AfterAll
    public static void afterAll(){
        System.out.println("After All");
    }
    @BeforeEach
    public void setUp(){
        c=new Calculator();
        System.out.println("Object created");
    }
    @AfterEach
    public void tearDown(){
        c=null;
        System.out.println("Object Destroyed");
    }
    @Test
    public void checkAdd(){
        System.out.println("Test 1");
        Assertions.assertEquals(24,c.add(14,10));
        Assertions.assertNotEquals(1,c.add(10,-10));
    }
    @Test
    public void checkSub(){
        System.out.println("Test 2");
        Assertions.assertEquals(0,c.sub(14,14));
        Assertions.assertNotEquals(1,c.sub(10,-10));
    }
}

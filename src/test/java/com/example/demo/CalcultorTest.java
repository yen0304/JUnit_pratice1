package com.example.demo;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class CalcultorTest   {

    /*AfterEach
    public void after(){
        System.out.println("執行after");
    }

    @BeforeEach
    public void beforce(){
        System.out.println("執行beforce");
    }
    */

    @AfterAll
    public static void afterall(){
        System.out.println("執行@AfterAll");
    }
    @BeforeAll
    public static void beforceall(){
        System.out.println("執行@BeforceAll");
    }

    @DisplayName("這個是自定義的test1名稱")
    @Test
    public void test1() {
        System.out.println("執行test1");
    }

    @Disabled
    @Test
    public void test2() {
        System.out.println("執行test2");
    }

}
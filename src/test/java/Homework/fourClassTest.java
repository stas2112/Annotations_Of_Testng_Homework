package Homework;

import org.testng.annotations.*;

public class fourClassTest {
    @BeforeTest
    public void bTest(){
        System.out.println("BeforeTest");
    }
    @AfterTest
    public void aTest(){
        System.out.println("AfterTest");
    }
    @AfterMethod
    public void aMethod(){
            System.out.println("AfterMethod");

    }

    @Test
    public void firstTest(){
        System.out.println("Test");
    }
}

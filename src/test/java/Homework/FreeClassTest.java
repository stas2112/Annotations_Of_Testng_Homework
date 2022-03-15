package Homework;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class FreeClassTest {
    @AfterClass
    public void aClass(){
        System.out.println("AfterClass");
    }
    @AfterTest
    public void aTest(){
        System.out.println("AfterTest");
    }
    @Test
    public void firstTest(){
    }
}

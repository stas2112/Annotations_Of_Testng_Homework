package Homework;

import org.testng.annotations.*;

public class FirstClassTest {
    int countCycleFirstData;
    @BeforeSuite
    public void bSuit() {
        System.out.println("BeforeSuite");
    }
    @BeforeClass
     public void bClass() {
        System.out.println("BeforeClass");
    }
    @AfterMethod
    public void aMethod(){
        System.out.println("AfterMethod");
    }
    @AfterSuite
    public void aSuite(){
        System.out.println("AfterSuite");
    }

    @Test
    public void printTestData(){
        System.out.println("Test");
    }
    @Test(dataProvider = "dataProviderForFirstTest")
    public void printTestDataWithFirstDataParameter(Object o1, Object o2){
        System.out.println(o1);
        System.out.println(o2);
    }

    @Test(priority = 1)
    public void voidTest(){

    }

    @Test(dataProvider = "dataProviderForSecondTest", invocationCount = 2, priority = 2)
    public void printTestDataWithSecondDataParameter(Object o1, Object o2){
    System.out.println(o1);
    System.out.println(o2);
    }



    @DataProvider(name="dataProviderForSecondTest")
    public Object[][] secondData(){
        int countOfDataCycles = countCycleFirstData;
        countCycleFirstData++;
        if (countOfDataCycles==0){
            return new Object[][]{
                    {"Test", "Test data: three four "}
            };
        }
       else if (countOfDataCycles==1){
            return new Object[][]{
                    {"Test", "Test data: true false"}
            };
        }
        return new Object[][] {};
}
    @DataProvider(name="dataProviderForFirstTest")
    public Object[][] firstData(){
        return new Object[][]{
                {"Test", "Test data: 1 2"}
    };
}
}
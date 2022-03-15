package Homework;

import org.testng.annotations.*;

public class TwoClassTest {
    int countOfDataCycles;
    @BeforeClass
    public void bClass(){
        System.out.println("BeforeClass");
    }
    @AfterClass()
    public void aClass(){
        System.out.println("AfterClass");
    }
    @AfterMethod()
    public void aMethod(){
        if(countOfDataCycles==1){
        System.out.println("AfterMethod");
    }}
    @Test(dataProvider = "dataProviderForFirstTest")
    public void printTestDataWithFirstDataParameter(Object o1,Object o2, Object o3, Object o4){
        System.out.println(o1 + "\n" +o2 + "\n" + o3 + "\n" +o4);
    }
    @Test(dataProvider = "dataProviderForFirstTest")
    public void printTestDataWithSecondDataParameter(Object o1,Object o2, Object o3, Object o4){
        System.out.println(o1 + "\n" +o2 + "\n" + o3 + "\n" +o4);
    }
    @DataProvider(name = "dataProviderForFirstTest")
    public Object[][] firstData(){
        if(countOfDataCycles==1){
            countOfDataCycles++;
            return new Object[][] {{"Test", "Test data: three four", "Test", "Test data: true false"}};
        }
        else{
        countOfDataCycles++;
        return new Object[][] {{"Test", "Test", "Test", "Test data: 1 2"}};
    }}

}

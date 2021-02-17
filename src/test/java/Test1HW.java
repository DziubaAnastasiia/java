package test.java;

import main.java.Test1;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class Test1HW {
    Test1 test1;

    @BeforeMethod
    public void setTest1(){
        test1 = new Test1();
    }

    @AfterMethod
    public void aftMethod(){
        System.out.println("Passed");
    }

    @Test
    public void Test1HWMethod(){
        test1.setNum1(23);
        test1.setNum2(3);
        test1.setNum3(78);
        int expectedMin = 3;
        int actualMin = test1.getMin();
        assertEquals(expectedMin, actualMin);
    }

    @Test
    public void TestMethod2(){
        test1.setNum1(1);
        test1.setNum2(2);
        test1.setNum3(3);
        int expectedMin = 1;
        int actualMin = test1.getMin();
        assertEquals(expectedMin, actualMin);
    }

    @Test
    public void TestMethod3() {
        test1.setNum1(1);
        test1.setNum2(1);
        test1.setNum3(1);
        int expectedMin = 0;
        int actualMin = test1.getMin();
        assertEquals(expectedMin, actualMin);
    }
    @Test
    public void TestMethod4(){
        test1.setNum1(-1);
        test1.setNum2(11);
        test1.setNum3(-66);
        int expectedMin = -66;
        int actualMin = test1.getMin();
        assertEquals(expectedMin, actualMin);
    }
}
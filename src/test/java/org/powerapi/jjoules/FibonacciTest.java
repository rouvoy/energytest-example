package org.powerapi.jjoules;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
import org.powerapi.jjoules.junit.EnergyTest;

/**
 * Unit test for simple App.
 */
@RunWith(JUnitPlatform.class)
public class FibonacciTest 
{
    private Fibonacci fibonacci;

    @BeforeEach
    public void init() {
        this.fibonacci = new Fibonacci();
    }

    @Test
    public void fibonacciZeroShouldBeZero()
    {
        Assertions.assertEquals(0,this.fibonacci.fibo(0));
    }

    @Test
    public void fibonacciOneShouldBeOne()
    {
        Assertions.assertEquals(1,this.fibonacci.fibo(1));
    }

    @EnergyTest
    public void fibonacciTenShouldBeFiftyFive()
    {
        Assertions.assertEquals(55,this.fibonacci.fibo(10));
    }


    @EnergyTest
    public void fibonacciThirtyShouldBeALot()
    {
        Assertions.assertEquals(832040,this.fibonacci.fibo(30));
    }
}

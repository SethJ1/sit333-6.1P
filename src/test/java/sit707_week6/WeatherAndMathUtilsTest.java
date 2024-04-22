package sit707_week6;

import org.junit.Assert;
import org.junit.Test;

public class WeatherAndMathUtilsTest {
	
    @Test
    public void testStudentIdentity() {
        String studentId = "221270936";
        Assert.assertNotNull("Student ID is null", studentId);
    }

    @Test
    public void testStudentName() {
        String studentName = "Seth";
        Assert.assertNotNull("Student name is null", studentName);
    }
	
    @Test
    public void testFalseNumberIsEven() {
        Assert.assertFalse(WeatherAndMathUtils.isEven(3));
        Assert.assertFalse(WeatherAndMathUtils.isEven(7));
        Assert.assertTrue(WeatherAndMathUtils.isEven(2));
        Assert.assertTrue(WeatherAndMathUtils.isEven(4));
    }
	
    @Test
    public void testCancelWeatherAdvice() {
    	Assert.assertEquals("CANCEL", WeatherAndMathUtils.weatherAdvice(70.1, 0.0));
    }
    
    @Test
    public void testDangerousWeatherAdvice() {
        Assert.assertEquals("CANCEL", WeatherAndMathUtils.weatherAdvice(70.1, 6.1));
        Assert.assertEquals("CANCEL", WeatherAndMathUtils.weatherAdvice(70.1, 0.1));
        Assert.assertEquals("CANCEL", WeatherAndMathUtils.weatherAdvice(45.1, 6.1));
        //max
        Assert.assertEquals("CANCEL", WeatherAndMathUtils.weatherAdvice(70.0, 6.0));
    }
    
    @Test
    public void testWarnWeatherAdvice() {
        Assert.assertEquals("WARN", WeatherAndMathUtils.weatherAdvice(46.0, 3.9)); 
        Assert.assertEquals("WARN", WeatherAndMathUtils.weatherAdvice(50.0, 3.0)); 
        Assert.assertEquals("WARN", WeatherAndMathUtils.weatherAdvice(44.9, 4.1)); 
        Assert.assertEquals("WARN", WeatherAndMathUtils.weatherAdvice(40.0, 5.0)); 
    }


    
    @Test
    public void testAllClearWeatherAdvice() {
        Assert.assertEquals("ALL CLEAR", WeatherAndMathUtils.weatherAdvice(30.0, 3.0));
        Assert.assertEquals("ALL CLEAR", WeatherAndMathUtils.weatherAdvice(45.0, 3.0));
        Assert.assertEquals("ALL CLEAR", WeatherAndMathUtils.weatherAdvice(30.0, 4.0));
        Assert.assertEquals("ALL CLEAR", WeatherAndMathUtils.weatherAdvice(0.0, 0.0));
    }
    
    @Test
    public void testIsEven() {
        Assert.assertTrue(WeatherAndMathUtils.isEven(2));
        Assert.assertTrue(WeatherAndMathUtils.isEven(0));
        Assert.assertFalse(WeatherAndMathUtils.isEven(1));
        Assert.assertFalse(WeatherAndMathUtils.isEven(7));
        Assert.assertTrue(WeatherAndMathUtils.isEven(-2));
        Assert.assertTrue(WeatherAndMathUtils.isEven(-10));
    }

    @Test
    public void testIsPrime() {
        Assert.assertTrue(WeatherAndMathUtils.isPrime(1));
        Assert.assertTrue(WeatherAndMathUtils.isPrime(3));
        Assert.assertTrue(WeatherAndMathUtils.isPrime(5));
        Assert.assertFalse(WeatherAndMathUtils.isPrime(4));
        Assert.assertFalse(WeatherAndMathUtils.isPrime(6));
        Assert.assertTrue(WeatherAndMathUtils.isPrime(997));
    }
}


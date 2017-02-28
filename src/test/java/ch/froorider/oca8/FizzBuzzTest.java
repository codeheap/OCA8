package ch.froorider.oca8;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Thomas Hasler on 28.02.2017.
 */
public class FizzBuzzTest {
    @Test
    public void getNameOfSample_standardTest() throws Exception {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String expectedName = "FizzBuzz";
        Assert.assertTrue(expectedName.equalsIgnoreCase(fizzBuzz.getNameOfSample()));
    }

    @Test
    public void getDescriptionOfSample_standardTest() throws Exception {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String expectedDescription = "FizzBuzz is a group word game for children to teach them about division. ";
        Assert.assertTrue(expectedDescription.equalsIgnoreCase(fizzBuzz.getDescriptionOfSample()));
    }

    @Test
    public void run_ExpectedBehaviour_NoErrorExpected() throws Exception {
        FizzBuzz fizzBuzz = new FizzBuzz();
        boolean status = fizzBuzz.run(null);
        Assert.assertEquals("Printout should be done.", true, status);
    }

}
package ch.froorider.oca8;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author U114843 on 12.01.2017.
 */
public class ZooPrinterTest {
    @Test
    public void getNameOfSample_standardTest() throws Exception {
        ZooPrinter printer = new ZooPrinter();
        String expectedName = "ZooPrinter";
        Assert.assertTrue(expectedName.equalsIgnoreCase(printer.getNameOfSample()));
    }

    @Test
    public void getDescriptionOfSample_standardTest() throws Exception {
        ZooPrinter printer = new ZooPrinter();
        String expectedDescription = "Prints out a list of given animals.";
        Assert.assertTrue(expectedDescription.equalsIgnoreCase(printer.getDescriptionOfSample()));
    }

    @Test
    public void run_standardBehaviour_NoErrorExpected() throws Exception {
        Map<String,Object> context = new HashMap<>();
        context.put("Tiger","Tiger");
        ZooPrinter printer = new ZooPrinter();
        boolean status = printer.run(context);
        Assert.assertEquals("Printout should be done.", true, status);
    }

    @Test
    public void run_nullAsInput_falseShouldBeReturned() throws Exception {
        ZooPrinter printer = new ZooPrinter();
        boolean status = printer.run(null);
        Assert.assertEquals("Printout should be done.", false, status);
    }

    @Test
    public void printAnimals_ExpectedBehaviour_NoErrorExpected() throws Exception {
        ZooPrinter printer = new ZooPrinter();
        List<Object> animals = new ArrayList<>();
        animals.add("Tiger");
        animals.add("Lion");
        boolean status = printer.printAnimals(animals);
        Assert.assertEquals("Printout should be done.", true, status);
    }

    @Test
    public void printAnimals_NoInputProvided_ShouldReturnFalse() throws Exception{
        ZooPrinter printer = new ZooPrinter();
        boolean status = printer.printAnimals(null);
        Assert.assertEquals("Printout was not possible.",false,status);
    }
}
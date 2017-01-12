package ch.froorider.oca8;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author U114843 on 12.01.2017.
 */
public class ZooPrinterTest {

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
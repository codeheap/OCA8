package ch.froorider.oca8;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import java.util.List;
import java.util.Map;

/**
 * @author Thomas Hasler
 *
 */
public class ZooPrinter implements RunnableSample{

    private static Logger logger = LogManager.getLogger(ZooPrinter.class);
    private static final String NAME_OF_SAMPLE = "ZooPrinter";
    private static final String DESCRIPTION_OF_SAMPLE = "Prints out a list of given animals.";

    /**
     * @param animals A List of objects to be printed out.
     * @return true if the list was printed. false if the printout was not possible.
     */
    boolean printAnimals(List<Object> animals){
        if(animals == null){
            logger.warn("Null cannot be printed.");
            return false;
        }

        for (Object animal:animals) {
            logger.info((String)animal);
        }
        return true;
    }

    @Override
    public String getNameOfSample() {
        return NAME_OF_SAMPLE;
    }

    @Override
    public String getDescriptionOfSample() {
        return DESCRIPTION_OF_SAMPLE;
    }

    @Override
    public boolean run(Map<String,Object> context) {
        if(context == null || context.values() == null){
            logger.warn("Null cannot be printed.");
            return false;
        }

        for (Object animal:context.values()) {
            logger.info("Animal of this zoo: "+(String)animal);
        }
        return true;
    }
}

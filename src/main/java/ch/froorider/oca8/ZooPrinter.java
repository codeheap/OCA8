package ch.froorider.oca8;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import java.util.List;

/**
 * @author Thomas Hasler
 *
 */
class ZooPrinter {

    private static Logger logger = LogManager.getLogger(ZooPrinter.class);

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
}

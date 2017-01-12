package ch.froorider.oca8;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by U114843 on 12.01.2017.
 *
 */
public class Application {

    private static Logger logger = LogManager.getLogger(Application.class);

    private Application() throws IllegalAccessException {
        throw new IllegalAccessException("This is the main class");
    }

    public static void main(String[] args){
        List<Object> input = new ArrayList<>();
        ZooPrinter printer = new ZooPrinter();

        if(args.length > 0) {
            logger.info("Printing out the input arguments.");
            for (int i = 0; i < args.length; i++) {
                input.add(args[i]);
            }

            printer.printAnimals(input);
        }
        else{
            logger.warn("Nothing to print.");
        }
    }
}

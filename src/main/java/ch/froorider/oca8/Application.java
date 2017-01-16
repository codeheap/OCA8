package ch.froorider.oca8;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ServiceLoader;

/**
 * Created by U114843 on 12.01.2017.
 *
 */
public class Application {

    private static Logger logger = LogManager.getLogger(Application.class);
    private static ServiceLoader<RunnableSample> samples = ServiceLoader.load(RunnableSample.class);

    private Application() throws IllegalAccessException {
        throw new IllegalAccessException("This is the main class and should not be created directly.");
    }

    public static void main(String[] args){
        List<Object> input = new ArrayList<>();
        ZooPrinter printer = new ZooPrinter();
        Map<String,Object> context = new HashMap<String, Object>();

        if(args.length > 0) {
            logger.info("Printing out the input arguments.");
            for (int i = 0; i < args.length; i++) {
                input.add(args[i]);
                context.put(args[i].toString(),args[i]);
            }

            printer.printAnimals(input);
        }
        else{
            logger.warn("Nothing to print.");
        }

        logger.info("Using service loader to print out some information.");
        for (RunnableSample sample:samples) {
            logger.info("Sample name: "+sample.getNameOfSample());
            logger.info("Sample description: "+sample.getDescriptionOfSample());
            logger.info("Starting sample");
            sample.run(context);
        }
    }
}

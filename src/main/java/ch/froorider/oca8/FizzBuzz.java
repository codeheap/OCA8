package ch.froorider.oca8;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Map;

/**
 * @author Thomas Hasler on 28.02.2017.
 *
 * Implementation of the well-known Fizz Buzz game.
 */
public class FizzBuzz implements RunnableSample{
    private static Logger logger = LogManager.getLogger(ZooPrinter.class);
    private static final String NAME_OF_SAMPLE = "FizzBuzz";
    private static final String DESCRIPTION_OF_SAMPLE = "FizzBuzz is a group word game for children to teach them about division. ";
    private static final String FIZZ = "Fizz";
    private static final String BUZZ = "Buzz";


    @Override
    public String getNameOfSample() {
        return NAME_OF_SAMPLE;
    }

    @Override
    public String getDescriptionOfSample() {
        return DESCRIPTION_OF_SAMPLE;
    }

    @Override
    public boolean run(Map<String, Object> context) {
        for (int i = 1; i <= 100; i++) {
            if(isDivisibleByThree(i) && !isDivisibleByFive(i)){
                logger.info(FIZZ);
            }
            else if(!isDivisibleByThree(i) && isDivisibleByFive(i)){
                logger.info(BUZZ);
            }
            else if(isDivisibleByThree(i) && isDivisibleByFive(i)){
                logger.info(FIZZ+BUZZ);
            }
            else{
                logger.info(i);
            }
        }
        return true;
    }

    private boolean isDivisibleByThree(int aNumber){
        int result = aNumber%3;
        return result == 0;
    }

    private boolean isDivisibleByFive(int aNumber){
        int result = aNumber%5;
        return result == 0;
    }
}

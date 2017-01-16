package ch.froorider.oca8;

import java.util.Map;

/**
 * @author uthor U114843 on 16.01.2017.
 */
public interface RunnableSample {

    String getNameOfSample();
    String getDescriptionOfSample();
    boolean run(Map<String,Object> context);

}

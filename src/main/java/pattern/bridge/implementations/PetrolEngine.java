/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pattern.bridge.implementations;

import java.util.logging.Logger;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 *
 * @author ilyas
 */
public class PetrolEngine implements Engine {

    private Log log = LogFactory.getLog(PetrolEngine.class);
    private int revolutionsPerMinute;

    public PetrolEngine() {
        revolutionsPerMinute = 2500;
    }

    @Override
    public void start() {
        log.info("Petrol engine started.");
    }

    @Override
    public void stop() {
        log.info("Petrol engine started.");
    }

    @Override
    public int increaseRPM(int rpm) {
        int resultRPM = this.revolutionsPerMinute + rpm;
        log.info("Petrol engine RPM : " + resultRPM);
        return resultRPM;
    }
}

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
public class DieselEngine implements Engine {

   private Log log = LogFactory.getLog(DieselEngine.class);
    private int revolutionsPerMinute;

    public DieselEngine() {
        revolutionsPerMinute = 1500;
    }

    @Override
    public void start() {
        log.info("Diesel engine started.");
    }

    @Override
    public void stop() {
        log.info("Diesel engine stopped.");
    }

    @Override
    public int increaseRPM(int rpm) {
        int resultRPM = revolutionsPerMinute + rpm;
        log.info("Diesel engine RPM : " + resultRPM);
        return resultRPM;
    }
}

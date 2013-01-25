/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pattern.bridge;

import pattern.bridge.implementations.Engine;

/**
 *
 * @author ilyas
 */
public class MachineTester extends Machine {

    int acceleration;

    public MachineTester(Engine engine, int acceleration) {
        super(engine);
        this.acceleration = acceleration;
    }

    @Override
    public void run() {
        engine.start();
        engine.increaseRPM(acceleration);
        engine.stop();
    }
}

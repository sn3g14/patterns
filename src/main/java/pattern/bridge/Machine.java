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
public abstract class Machine {

    protected Engine engine;

    protected Machine(Engine engine) {
        this.engine = engine;
    }

    public abstract void run();
}

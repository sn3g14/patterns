/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pattern.bridge.implementations;

/**
 *
 * @author ilyas
 */
public interface Engine {
    public void start();
    public void stop();
    public int increaseRPM(int rpm);
}

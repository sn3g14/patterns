import java.util.ArrayList;
import java.util.List;
import pattern.bridge.*;
import pattern.bridge.implementations.DieselEngine;
import pattern.bridge.implementations.PetrolEngine;

/**
 *
 * @author ilyas
 */
public class BridgePattern {

    public static void main(String arg[]) {
        List<Machine> machines = new ArrayList<Machine>();
        machines.add(new MachineTester(new DieselEngine(), 200));
        machines.add(new MachineTester(new PetrolEngine(), 500));
        for (Machine m : machines) {
            m.run();
        }

    }
}

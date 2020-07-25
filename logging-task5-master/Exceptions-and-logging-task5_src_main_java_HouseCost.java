import Materials.*;

import java.io.IOException;
import java.io.OutputStreamWriter;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class HouseCost {
    private Logger log = LogManager.getLogger(HouseCost.class);
    OutputStreamWriter streamWriter = new OutputStreamWriter(System.out);

    public double calculatecost(String material, double area) throws IOException {
        CalculateCost costs[] = {new Standard(), new AboveStandard()};
        CalculateCost hss = new HighStandard();
        String material1[] = {"Standard", "AboveStandard"};
        int val = 0;
        double d = 0;
        if (material.equals("HighStandard")) {
            return hss.calculatecost(area);
        } else if (material == "Standard" || material == "AboveStandard") {

            for (int i = 0; i < 2; i++) {
                if (material.equals(material1[i])) {
                    val = i;
                    break;
                }
            }

            d = costs[val].calculatecost(area);
        }
        return d;
    }
}


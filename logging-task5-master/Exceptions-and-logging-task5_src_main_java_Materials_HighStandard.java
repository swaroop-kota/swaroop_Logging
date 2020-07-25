package Materials;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class HighStandard implements CalculateCost {
    private Logger log = LogManager.getLogger(HighStandard.class);
    Scanner sc = new Scanner(System.in);

    @Override
    public double calculatecost(double area) {
        log.info("Enter automation: if full --> enter full\n");
        String standard1 = sc.next();
        if (standard1.equals("full")) {
            return area * 2500;
        } else {
            return area * 1800;
        }
    }
}

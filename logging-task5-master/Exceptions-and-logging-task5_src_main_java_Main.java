import Materials.HighStandard;

import java.util.Scanner;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    private Logger log = LogManager.getLogger(Main.class);

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        OutputStreamWriter streamWriter = new OutputStreamWriter(System.out);
        //Simple Interest and Compound Interest
        CompoundInterest ci = new CompoundInterest();
        SimpleInterest si = new SimpleInterest();
        double arr[] = new double[3];
        String vals[] = {"principle", "rate", "time"};
        for (int i = 0; i < 3; i++) {
            streamWriter.write("Enter the " + vals[i]);
            streamWriter.flush();
            arr[i] = sc.nextDouble();
        }
        double principle = arr[0];
        double rate = arr[1];
        double year = arr[2];
        streamWriter.write("Simple Interest: " + si.simpleInterest(principle, rate, year) + "\n");
        streamWriter.flush();
        streamWriter.write("Compound Interest: " + ci.compoundInterest(principle, rate, year) + "\n");
        streamWriter.flush();

        //House Construction cost
        streamWriter.write("\nEnter the material:(Standard/AboveStandard/HighStandard)\n");
        streamWriter.flush();
        String material = sc.next();
        streamWriter.write("Enter area:\n");
        streamWriter.flush();
        double area = sc.nextDouble();
        HouseCost hc = new HouseCost();
        double d = hc.calculatecost(material, area);
        streamWriter.write("Total Cost:" + String.valueOf(d));
        streamWriter.flush();
    }
}
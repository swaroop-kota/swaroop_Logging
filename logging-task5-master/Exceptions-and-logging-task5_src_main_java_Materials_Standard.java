package Materials;

public class Standard implements CalculateCost {
    public double calculatecost(double area) {
        return area * 1200;
    }
}
public class CompoundInterest {
    public double compoundInterest(double principal, double rate, double time) {
        return principal * (Math.pow(1 + rate / 100, time) - 1);
    }
}

package decorator.gof;

public class DefaultSalaryCalculator implements SalaryCalculator {

    @Override
    public double calculate(double grossAnnual) {
        return grossAnnual / 12;
    }
}
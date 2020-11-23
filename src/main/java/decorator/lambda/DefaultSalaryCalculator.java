package decorator.lambda;

import java.util.function.DoubleUnaryOperator;

public class DefaultSalaryCalculator implements DoubleUnaryOperator {
    @Override
    public double applyAsDouble(double grossAnnual) {
        return grossAnnual / 12;
    }
}
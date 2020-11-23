package decorator.gof;

import decorator.Taxes;

public class RegionalTaxDecorator extends AbstractTaxDecorator {
    public RegionalTaxDecorator(SalaryCalculator salaryCalculator) {
        super(salaryCalculator);
    }

    @Override
    protected double applyTax(double salary) {
        return Taxes.regionalTax(salary);
    }
}
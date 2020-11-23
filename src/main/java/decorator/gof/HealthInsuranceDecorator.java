package decorator.gof;

import decorator.Taxes;

public class HealthInsuranceDecorator extends AbstractTaxDecorator {

    public HealthInsuranceDecorator(SalaryCalculator salaryCalculator) {
        super(salaryCalculator);
    }

    @Override
    protected double applyTax(double salary) {
        return Taxes.healthInsurance(salary);
    }
}
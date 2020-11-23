package decorator.gof;

public class DecoratorGof {

    static double calculate(int annualGrossSalary) {
        return new HealthInsuranceDecorator(
                new RegionalTaxDecorator(
                        new GeneralTaxDecorator(
                                new DefaultSalaryCalculator()
                        )
                )
        ).calculate(annualGrossSalary);
    }
}

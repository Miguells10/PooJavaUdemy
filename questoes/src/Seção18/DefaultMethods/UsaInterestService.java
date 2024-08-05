package Seção18.DefaultMethods;

public class UsaInterestService implements InterestService{
    @Override
    public double getInterestRate() {
        return 0;
    }

    @Override
    public double payment(double amount, int months) {
        return InterestService.super.payment(amount, months);
    }
}

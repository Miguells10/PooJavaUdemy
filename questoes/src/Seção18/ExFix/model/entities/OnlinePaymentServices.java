package Seção18.ExFix.model.entities;

public interface OnlinePaymentServices {
    double paymentFee(double amount);
    double interest(double amount, int months);
}

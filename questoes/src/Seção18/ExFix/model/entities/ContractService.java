package Seção18.ExFix.model.entities;

import java.time.*;

import java.util.Calendar;
import java.util.Date;



public class ContractService {

    private final OnlinePaymentServices onlinePaymentService;

    public ContractService(OnlinePaymentServices onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }

    public void processContract(Contract contract, Integer months){
        double basicQuota = contract.getTotalValue() / months;

        for (int i = 1; i <= months; i++) {
            LocalDate dueDate = contract.getDate().plusMonths(i);
            double interest = onlinePaymentService.interest(basicQuota, i);
            double fee = onlinePaymentService.paymentFee(basicQuota + interest);
            double quota = basicQuota + interest + fee;
            contract.getInstallments().add(new Installment(dueDate, quota));
        }



    }



}

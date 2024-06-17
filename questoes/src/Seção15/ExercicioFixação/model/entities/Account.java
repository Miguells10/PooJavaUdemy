package Seção15.ExercicioFixação.model.entities;

import Seção15.Exceptions1.model.exceptions.DomainException;
import Seção15.ExercicioFixação.model.exceptions.ExceptionDomain;

public class Account {
    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimite;

    public Account(){

    }

    public Account(Integer number, String holder, Double balance, Double withdrawLimite) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimite = withdrawLimite;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public Double getWithdrawLimite() {
        return withdrawLimite;
    }

    public void deposit(Double amount){
        balance += amount;
    }

    public void withdraw(Double amount) throws ExceptionDomain {
        if (amount > withdrawLimite){
            throw new ExceptionDomain("The amount exceeds withdraw limit");
        }
        if (amount > balance){
            throw new ExceptionDomain("Not enough balance");
        }
        balance -= amount;
}

    @Override
    public String toString() {
        return "Account " +
                number +
                ", Holder: " + holder +
                ", Balance: " + balance +
                ", Withdraw limit: " + withdrawLimite;
    }


}

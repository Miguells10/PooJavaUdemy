package Seção18.ExProblem.model.services;

import Seção18.ExProblem.model.entities.CarRental;
import Seção18.ExProblem.model.entities.Invoice;

import java.time.Duration;

public class RentalService {

    private Double pricePerDay;
    private Double pricePerHour;
    private TaxService taxService;

    public RentalService(Double pricePerDay, Double pricePerHour, TaxService taxService) {
        this.pricePerDay = pricePerDay;
        this.pricePerHour = pricePerHour;
        this.taxService = taxService;
    }

    public void processInvoice(CarRental carRental){

        //Calculo entre as datas
        double minutes = Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes();
        double hours = minutes / 60.0;

        double basicPayment;
        if(hours <= 12){
            basicPayment = pricePerHour * Math.ceil(hours);//Math.ceil irá arredondar as horas para cima
        }
        else {
            basicPayment = pricePerDay * Math.ceil(hours/24);

        }

        double tax = taxService.tax(basicPayment);

        carRental.setInvoice(new Invoice(basicPayment, tax));

    }

}

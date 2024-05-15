package Seção9.ExFixacao;

public class Client {
    public String name;
    private int code;
    public double value;

    public Client(String name, int code, double value) {
        this.name = name;
        this.code = code;
        this.value = value;
    }

    public Client(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public double getValue() {
        return value;
    }

    public void deposit(double value){
        this.value += value;
    }

    public void withdraw(double value){
        this.value -= value + 5;
    }

    public String toString() {
        return "Account data{" +
                "name='" + name + '\'' +
                ", code=" + code +
                ", value= $ " + value +
                '}';
    }
}









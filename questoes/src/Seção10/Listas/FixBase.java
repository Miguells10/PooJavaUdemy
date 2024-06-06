package Seção10.Listas;

public class FixBase {
    private final Integer id;
    private String name;

    private double salary;

    public FixBase(Integer id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }


    public void setId(int id) {
    }

    public void setSalary(double salary) {
       this.salary = salary;
    }


}

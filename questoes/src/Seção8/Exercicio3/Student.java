package Seção8.Exercicio3;

public class Student {
    public String name;
    public double nota1;
    public double nota2;
    public double nota3;

    public String resulted() {
        if (nota1 > 30 || nota1 < 0) {
            System.out.println("Nota não condiz.");
        }
        if (nota2 > 35 & nota3 > 35) {
            System.out.println("Nota não condiz");
        }

        double soma = (nota1 + nota2 + nota3);
        System.out.println("Final grade = " + soma);
        String resultado = soma > 60 ? "PASS" : "FAILED";

        if (resultado.equals("FAILED")){
            System.out.println("Missing " + (60 - soma) + " points");
        }

        return resultado;

    }
}

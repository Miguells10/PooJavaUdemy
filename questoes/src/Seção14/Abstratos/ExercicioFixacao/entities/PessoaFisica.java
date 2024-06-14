package Seção14.Abstratos.ExercicioFixacao.entities;

public class PessoaFisica extends Contribuinte {
    public Double gastosSaude;

    public PessoaFisica() {
        super();
    }

    public PessoaFisica(String nome, Double rendaAnual, Double gastosSaude) {
        super(nome, rendaAnual);
        this.gastosSaude = gastosSaude;
    }

    @Override
    public double taxesPay() {
        if (getRendaAnual() < 20000) {
            if (gastosSaude > 0) {
                return (getRendaAnual() * 0.15) - (gastosSaude * 0.5);
            }
        } else if (gastosSaude > 0) {
            return (getRendaAnual() * 0.25) - (gastosSaude * 0.5);


        }
        return taxesPay();
    }
}

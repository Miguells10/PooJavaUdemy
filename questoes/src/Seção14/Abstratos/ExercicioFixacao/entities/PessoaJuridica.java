package Seção14.Abstratos.ExercicioFixacao.entities;

public class PessoaJuridica extends Contribuinte{

    public Integer numeroFuncionarios;

    public PessoaJuridica(){super();}

    public PessoaJuridica(String nome, Double rendaAnual, Integer numeroFuncionarios) {
        super(nome, rendaAnual);
        this.numeroFuncionarios = numeroFuncionarios;


    }

    public Integer getNumeroFuncionarios() {
        return numeroFuncionarios;
    }

    public void setNumeroFuncionarios(Integer numeroFuncionarios) {
        this.numeroFuncionarios = numeroFuncionarios;
    }

    @Override
    public double taxesPay() {
        if (numeroFuncionarios>10){
            return getRendaAnual() * 0.14;
        }else return getRendaAnual() * 0.16;
    }

}

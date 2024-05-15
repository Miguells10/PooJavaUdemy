package Seção10.Vetores;

public class registroQuartos {
    private String nome;
    private String email;
    private int quarto;

    public registroQuartos(String nome, String email, int quarto) {
        this.nome = nome;
        this.email = email;
        this.quarto = quarto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getQuarto() {
        return quarto;
    }


    @Override
    public String toString() {
        return "Busy rooms: \n " +
                quarto + ": " + nome + ", \n "+
                email + '\n';
    }
}

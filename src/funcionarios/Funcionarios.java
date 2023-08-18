package funcionarios;

public class Funcionarios {
    private String nome;
    private String login;
    private String senha;

    public String getNome() {
        return nome;
    }

    public String getLogin() {
        return login;
    }

    public String getSenha() {
        return senha;
    }

    public Funcionarios(String nome, String login, String senha) {
        this.nome = nome;
        this.login = login;
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "Funcionário: " + nome + " (Login: " + login + ")";
    }
}

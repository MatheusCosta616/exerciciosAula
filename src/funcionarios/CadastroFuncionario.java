package funcionarios;

import java.util.Scanner;

public class CadastroFuncionario {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem vindo-funcionário!");
        System.out.println("FAÇA SEU CADASTRO AQUI!");

        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Digite seu login: ");
        String login = scanner.nextLine();

        System.out.println("Digite sua senha: ");
        String senha = scanner.nextLine();

        Funcionarios funcionario = new Funcionarios(nome, login, senha);

        // Aqui, você criou um objeto Funcionarios com os dados informados.

        // Agora você pode fazer algo com esse objeto, como imprimir os detalhes:
        System.out.println("Cadastro concluído:");
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Login: " + funcionario.getLogin());
        // Não é uma boa prática imprimir senhas, então deixei de fora aqui.

        System.out.println(funcionario);

        scanner.close();
    }
}
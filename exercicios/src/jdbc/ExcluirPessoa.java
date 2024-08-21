package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ExcluirPessoa {

    public static void main(String[] args) throws SQLException {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe o codigo da pessoa a ser excluída: ");
        int codigo = entrada.nextInt();
        entrada.nextLine();

        Pessoa pessoaEncontrada = PessoaUtil.getPessoaById(codigo);

        if (pessoaEncontrada == null) {
            System.out.println("Pessoa não encontrada!");
            return;
        }

        System.out.print("Pessoa encontrada: " + pessoaEncontrada.getNome() + ". Tem certeza que deseja excluir (sim ou nao) ? ");
        String resposta = entrada.nextLine();

        while (!resposta.equalsIgnoreCase("sim") && !resposta.equalsIgnoreCase("nao")) {
            System.out.println("Resposta inválida, tente novamente!");
            System.out.print("Pessoa encontrada: " + pessoaEncontrada.getNome() + ". Tem certeza que deseja excluir (sim ou nao) ? ");
            resposta = entrada.nextLine();
        }

        if (resposta.equals("sim")) {
            PessoaUtil.deletePessoa(codigo);
        } else {
            return;
        }

        entrada.close();
    }
}

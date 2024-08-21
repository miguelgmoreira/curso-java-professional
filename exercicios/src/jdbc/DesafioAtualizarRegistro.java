package jdbc;

import java.sql.*;
import java.util.Scanner;

public class DesafioAtualizarRegistro {

    public static void main(String[] args) throws SQLException {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe o id da pessoa: ");
        int id = entrada.nextInt();
        entrada.nextLine();

        Pessoa pessoaEncontrada = PessoaUtil.getPessoaById(id);

        if (pessoaEncontrada == null) {
            System.out.println("Pessoa não encontrada!");
            return;
        }

        System.out.println("O nome atual é " + pessoaEncontrada.getNome());

        System.out.print("Informe o novo nome da pessoa: ");
        String novoNome = entrada.nextLine();

        PessoaUtil.updateNome(id, novoNome);

        entrada.close();
    }
}

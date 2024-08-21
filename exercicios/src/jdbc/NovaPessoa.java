package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class NovaPessoa {

    public static void main(String[] args) throws SQLException {

        // NÂO CONCATENAR STRINGS NA HORA DE MONTAR O SQL --> Usar o PreparedStatement

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o nome: ");
        String nome = entrada.nextLine();

        Connection conexao = FabricaConexao.getConexao();

        String sql = "INSERT INTO pessoas (nome) VALUES (?)";

        // Dessa forma ao invés de concatenar previne SQL Injections
        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setString(1, nome);

        stmt.execute();

        System.out.println("Pessoa incluida com sucesso");
        entrada.close();
    }
}

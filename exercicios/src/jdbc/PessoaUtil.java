package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PessoaUtil {

    public static Pessoa getPessoaById(int id) throws SQLException {
        // Sem saber o que era já fiz uma implementação de um DAO rsrs

        Connection conexao = FabricaConexao.getConexao();

        String select = "SELECT * FROM pessoas WHERE codigo = ?";
        PreparedStatement stmt = conexao.prepareStatement(select);
        stmt.setInt(1, id);

        ResultSet r = stmt.executeQuery();

        if (r.next()) {
            return new Pessoa(r.getInt("codigo"), r.getString("nome"));
        }
        return null;
    }

    public static void updateNome(int id, String novoNome) throws SQLException {

        Connection conexao = FabricaConexao.getConexao();

        String update = "UPDATE pessoas SET nome = ? WHERE codigo = ?";
        PreparedStatement stmt = conexao.prepareStatement(update);
        stmt.setString(1, novoNome);
        stmt.setInt(2, id);
        stmt.execute();

        System.out.println("Pessoa alterado com sucesso");

        stmt.close();
        conexao.close();
    }

    public static void deletePessoa(int codigo) throws SQLException {
        Connection conexao = FabricaConexao.getConexao();
        String sql = "DELETE FROM pessoas WHERE codigo = ?";

        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setInt(1, codigo);

        if (stmt.executeUpdate() > 0) {
            System.out.println("Pessoa excluída com sucesso!");
        } else {
            System.out.println("Nenhuma alteração feita!");
        }


        stmt.close();
        conexao.close();
    }
}

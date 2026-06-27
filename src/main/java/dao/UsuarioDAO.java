package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuarioDAO {

    public String autenticarUsuario(String email, String senha) {
        String sql = "SELECT tipo FROM usuarios WHERE email = ? AND senha = ?";

        try (Connection conn = new ConexaoDB().getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, email);
            stmt.setString(2, senha);

            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return rs.getString("tipo");
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }
}
package dao;

import model.Jogo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class jogoDAO {

    public void cadastrarJogo(Jogo jogo) {
        String sql = "INSERT INTO jogos (titulo, idade_recomendada, modalidade, status) VALUES (?, ?, ?, ?)";
        try (Connection conn = new ConexaoDB().getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, jogo.getTitulo());
            stmt.setString(2, jogo.getIdadeRecomendada());
            stmt.setString(3, jogo.getModalidade());
            stmt.setString(4, jogo.getStatus());
            stmt.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public ArrayList<Jogo> listarTodos() {
        String sql = "SELECT * FROM jogos";
        ArrayList<Jogo> listaJogos = new ArrayList<>();
        try (Connection conn = new ConexaoDB().getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                Jogo jogo = new Jogo();
                jogo.setId(rs.getInt("id"));
                jogo.setTitulo(rs.getString("titulo"));
                jogo.setIdadeRecomendada(rs.getString("idade_recomendada"));
                jogo.setModalidade(rs.getString("modalidade"));
                jogo.setStatus(rs.getString("status"));
                listaJogos.add(jogo);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return listaJogos;
    }

    // CORRIGIDO: Retorna o objeto completo para a tabela poder mostrar todas as colunas
    public ArrayList<Jogo> listarPorStatus(String status) {
        String sql = "SELECT * FROM jogos WHERE status = ?";
        ArrayList<Jogo> listaJogos = new ArrayList<>();
        try (Connection conn = new ConexaoDB().getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, status);
            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    Jogo jogo = new Jogo();
                    jogo.setTitulo(rs.getString("titulo"));
                    jogo.setIdadeRecomendada(rs.getString("idade_recomendada"));
                    jogo.setModalidade(rs.getString("modalidade"));
                    jogo.setStatus(rs.getString("status"));
                    listaJogos.add(jogo);
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return listaJogos;
    }

    public ArrayList<Jogo> listarEmprestadosPorUsuario(String nomeUsuario) {
        String sql = "SELECT * FROM jogos WHERE status = 'Emprestado' AND usuario_emprestimo = ?";
        ArrayList<Jogo> listaJogos = new ArrayList<>();
        try (Connection conn = new ConexaoDB().getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, nomeUsuario);
            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    Jogo jogo = new Jogo();
                    jogo.setTitulo(rs.getString("titulo"));
                    jogo.setIdadeRecomendada(rs.getString("idade_recomendada"));
                    jogo.setModalidade(rs.getString("modalidade"));
                    listaJogos.add(jogo);
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return listaJogos;
    }

    public void excluirPorTitulo(String titulo) {
        String sql = "DELETE FROM jogos WHERE titulo = ?";
        try (Connection conn = new ConexaoDB().getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, titulo);
            stmt.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public Jogo buscarPorTitulo(String titulo) {
        String sql = "SELECT * FROM jogos WHERE titulo = ?";
        try (Connection conn = new ConexaoDB().getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, titulo);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    Jogo jogo = new Jogo();
                    jogo.setTitulo(rs.getString("titulo"));
                    jogo.setIdadeRecomendada(rs.getString("idade_recomendada"));
                    jogo.setModalidade(rs.getString("modalidade"));
                    jogo.setStatus(rs.getString("status"));
                    return jogo;
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    public void atualizarStatusComUsuario(String titulo, String novoStatus, String usuario) {
        String sql = "UPDATE jogos SET status = ?, usuario_emprestimo = ? WHERE titulo = ?";
        try (Connection conn = new ConexaoDB().getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, novoStatus);
            stmt.setString(2, usuario);
            stmt.setString(3, titulo);
            stmt.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void atualizarStatus(String titulo, String novoStatus) {
        String sql = "UPDATE jogos SET status = ?, usuario_emprestimo = NULL WHERE titulo = ?";
        try (Connection conn = new ConexaoDB().getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, novoStatus);
            stmt.setString(2, titulo);
            stmt.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void atualizarJogo(String tituloOriginal, Jogo jogo) {
        String sql = "UPDATE jogos SET titulo = ?, idade_recomendada = ?, modalidade = ? WHERE titulo = ?";
        try (Connection conn = new ConexaoDB().getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, jogo.getTitulo());
            stmt.setString(2, jogo.getIdadeRecomendada());
            stmt.setString(3, jogo.getModalidade());
            stmt.setString(4, tituloOriginal);
            stmt.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
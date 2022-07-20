package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import dominio.Candidato;

// Classe DAO (Data Access Object) para Candidato
public class DAOCandidato {
    
    private Connection con;
    //Pré-compila a query para o banco de dados
    private PreparedStatement comando;
    
    //Classe acessada internamente para conectar com o banco
    private void conectar(){
        con = FabricaConexao.conexao();
    }
    
    //Classe que fecha a conexão com o banco
    private void fechar() {
        try {
            comando.close();
            con.close();
        } catch(SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao fechar conexão"+e.getMessage(), 
                    "Erro", JOptionPane.ERROR_MESSAGE, null);
        }
    }
    
    public boolean insereCandidato(Candidato candidato) {
        
        conectar();
        String sql = "INSERT INTO CANDIDATO(nome, cpf, data_nascimento, telefone, email, cidade) VALUES(?,?,?,?,?,?)";
        
        Date auxDataNascimento = new Date();
        auxDataNascimento = candidato.getDataNascimento();
        //convertendo para data de banco
        java.sql.Date sqlDataNascimento = new java.sql.Date(auxDataNascimento.getTime());
        
        try{
            comando = con.prepareStatement(sql);
            comando.setString(1, candidato.getNome());
            comando.setString(2, candidato.getCpf());
            comando.setDate(3, sqlDataNascimento);
            comando.setString(4, candidato.getTelefone());
            comando.setString(5, candidato.getEmail());
            comando.setString(6, candidato.getCidade());
            
            comando.execute();
            return true;
        } catch(SQLException e) {
              JOptionPane.showMessageDialog(null, "Erro ao inserir registro."+e.getMessage(), 
                    "Erro", JOptionPane.ERROR_MESSAGE, null);
        } finally {
            fechar();
        }
        return false;
    }
    
    public  ArrayList<Candidato> selecionarTodosRegistros() {
        conectar();
        //interface utilizada pra guardar dados vindos de um banco de dados
        ResultSet rs;
        String sql = "SELECT * FROM CANDIDATO";
        //lista que conterá todas as informações de pessoas no banco de dados
        ArrayList<Candidato> listaCandidatos = new ArrayList();
        try{
            comando = con.prepareStatement(sql);
            rs = comando.executeQuery();
            while(rs.next())
            {
                Candidato candidato = new Candidato();
                candidato.setId(rs.getInt("ID"));
                candidato.setNome(rs.getString("NOME"));
                candidato.setCpf(rs.getString("CPF"));
                candidato.setDataNascimento(rs.getDate("DATA_NASCIMENTO"));
                candidato.setTelefone(rs.getString("TELEFONE"));
                candidato.setEmail(rs.getString("EMAIL"));
                candidato.setCidade(rs.getString("CIDADE"));
                listaCandidatos.add(candidato);
            }
            fechar();
            return listaCandidatos;
        } catch(SQLException e) {
             JOptionPane.showMessageDialog(null, "Erro ao buscar registro."+e.getMessage(), 
                    "Erro", JOptionPane.ERROR_MESSAGE, null);
            fechar();
            return null;
        }
            
    }
    
    public boolean removeCandidato(Integer id) {
        conectar();
        String sql = "DELETE FROM CANDIDATO WHERE ID = ?";
        try {
            comando = con.prepareStatement(sql);
            comando.setInt(1, id);
            comando.executeUpdate();
            return true;
        } catch(SQLException e) {
              JOptionPane.showMessageDialog(null, "Erro ao excluir registro."+e.getMessage(), 
                    "Erro", JOptionPane.ERROR_MESSAGE, null);
        } finally {
            fechar();
        }
        return false;
    }
    
    public boolean alteraCandidato(Candidato candidato) {
        conectar();
        String sql = "UPDATE CANDIDATO SET NOME = ?, CPF = ?, DATA_NASCIMENTO = ?, TELEFONE = ?, EMAIL = ?, CIDADE = ? WHERE ID = ?";
        java.sql.Date sqlDataNascimento = new java.sql.Date(candidato.getDataNascimento().getTime());
        try {
            comando = con.prepareStatement(sql);
            comando.setString(1, candidato.getNome());
            comando.setString(2, candidato.getCpf());
            comando.setDate(3, sqlDataNascimento);
            comando.setString(4, candidato.getTelefone());
            comando.setString(5, candidato.getEmail());
            comando.setString(6, candidato.getCidade());
            comando.setInt(7, candidato.getId());
            comando.executeUpdate();
            return true;
        } catch(SQLException e) {
              JOptionPane.showMessageDialog(null, "Erro ao atualizar registro."+e.getMessage(), 
                    "Erro", JOptionPane.ERROR_MESSAGE, null);
        } finally {
            fechar();
        }
         return false;
    }
}
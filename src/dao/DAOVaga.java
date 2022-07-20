package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import dominio.Vaga;

// Classe DAO (Data Access Object) para Candidato
public class DAOVaga {
    
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
    
    public boolean insereVaga(Vaga vaga) {
        
        conectar();
        String sql = "INSERT INTO VAGA(tipo, quantidade, contratante, salario, necessita_experiencia, diploma_area) VALUES(?,?,?,?,?,?)";
        
        try{
            comando = con.prepareStatement(sql);
            comando.setString(1, vaga.getTipo());
            comando.setInt(2, vaga.getQuantidade());
            comando.setString(3, vaga.getContratante());
            comando.setFloat(4, vaga.getSalario());
            comando.setString(5, vaga.getNecessitaExperiencia());
            comando.setString(6, vaga.getDiplomaArea());
            
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
    
    public  ArrayList<Vaga> selecionarTodosRegistros() {
        conectar();
        //interface utilizada pra guardar dados vindos de um banco de dados
        ResultSet rs;
        String sql = "SELECT * FROM VAGA";
        //lista que conterá todas as informações de pessoas no banco de dados
        ArrayList<Vaga> listaVagas = new ArrayList();
        try{
            comando = con.prepareStatement(sql);
            rs = comando.executeQuery();
            while(rs.next())
            {
                Vaga vaga = new Vaga();
                vaga.setId(rs.getInt("ID"));
                vaga.setTipo(rs.getString("TIPO"));
                vaga.setQuantidade(rs.getInt("QUANTIDADE"));
                vaga.setContratante(rs.getString("CONTRATANTE"));
                vaga.setSalario(rs.getFloat("SALARIO"));
                vaga.setNecessitaExperiencia(rs.getString("NECESSITA_EXPERIENCIA"));
                vaga.setDiplomaArea(rs.getString("DIPLOMA_AREA"));
                listaVagas.add(vaga);
            }
            fechar();
            return listaVagas;
        } catch(SQLException e) {
             JOptionPane.showMessageDialog(null, "Erro ao buscar registro."+e.getMessage(), 
                    "Erro", JOptionPane.ERROR_MESSAGE, null);
            fechar();
            return null;
        }
            
    }
    
    public boolean removeVaga(Integer id) {
        conectar();
        String sql = "DELETE FROM VAGA WHERE ID = ?";
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
    
    public boolean alteraVaga(Vaga vaga) {
        conectar();
        String sql = "UPDATE VAGA SET TIPO = ?, QUANTIDADE = ?, CONTRATANTE = ?, SALARIO = ?, NECESSITA_EXPERIENCIA = ?, DIPLOMA_AREA = ? WHERE ID = ?";
        
        try {
            comando = con.prepareStatement(sql);
            comando.setString(1, vaga.getTipo());
            comando.setInt(2, vaga.getQuantidade());
            comando.setString(3, vaga.getContratante());
            comando.setFloat(4, vaga.getSalario());
            comando.setString(5, vaga.getNecessitaExperiencia());
            comando.setString(6, vaga.getDiplomaArea());
            comando.setInt(7, vaga.getId());
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
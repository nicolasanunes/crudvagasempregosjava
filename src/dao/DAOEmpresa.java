package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import dominio.Empresa;

// Classe DAO (Data Access Object) para Candidato
public class DAOEmpresa {
    
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
    
    public boolean insereEmpresa(Empresa empresa) {
        
        conectar();
        String sql = "INSERT INTO EMPRESA(nome, cnpj, email, telefone, cidade, endereco) VALUES(?,?,?,?,?,?)";
        
        try{
            comando = con.prepareStatement(sql);
            comando.setString(1, empresa.getNome());
            comando.setString(2, empresa.getCnpj());
            comando.setString(3, empresa.getEmail());
            comando.setString(4, empresa.getTelefone());
            comando.setString(5, empresa.getCidade());
            comando.setString(6, empresa.getEndereco());
            
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
    
    public  ArrayList<Empresa> selecionarTodosRegistros() {
        conectar();
        //interface utilizada pra guardar dados vindos de um banco de dados
        ResultSet rs;
        String sql = "SELECT * FROM EMPRESA";
        //lista que conterá todas as informações de pessoas no banco de dados
        ArrayList<Empresa> listaEmpresas = new ArrayList();
        try{
            comando = con.prepareStatement(sql);
            rs = comando.executeQuery();
            while(rs.next())
            {
                Empresa empresa = new Empresa();
                empresa.setId(rs.getInt("ID"));
                empresa.setNome(rs.getString("NOME"));
                empresa.setCnpj(rs.getString("CNPJ"));
                empresa.setEmail(rs.getString("EMAIL"));
                empresa.setTelefone(rs.getString("TELEFONE"));
                empresa.setCidade(rs.getString("CIDADE"));
                empresa.setEndereco(rs.getString("ENDERECO"));
                listaEmpresas.add(empresa);
            }
            fechar();
            return listaEmpresas;
        } catch(SQLException e) {
             JOptionPane.showMessageDialog(null, "Erro ao buscar registro."+e.getMessage(), 
                    "Erro", JOptionPane.ERROR_MESSAGE, null);
            fechar();
            return null;
        }
            
    }
    
    public boolean removeEmpresa(Integer id) {
        conectar();
        String sql = "DELETE FROM EMPRESA WHERE ID = ?";
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
    
    public boolean alteraEmpresa(Empresa empresa) {
        conectar();
        String sql = "UPDATE EMPRESA SET NOME = ?, CNPJ = ?, EMAIL = ?, TELEFONE = ?, CIDADE = ?, ENDERECO = ? WHERE ID = ?";
        
        try {
            comando = con.prepareStatement(sql);
            comando.setString(1, empresa.getNome());
            comando.setString(2, empresa.getCnpj());
            comando.setString(3, empresa.getEmail());
            comando.setString(4, empresa.getTelefone());
            comando.setString(5, empresa.getCidade());
            comando.setString(6, empresa.getEndereco());
            comando.setInt(7, empresa.getId());
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
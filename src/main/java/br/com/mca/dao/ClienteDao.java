/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mca.dao;

import br.com.mca.model.Cliente;
import br.com.mca.util.ConnectionFactory;
//import br.com.mca.util.StandardException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


/**
 *
 * @author joaoa
 */
public class ClienteDao extends Dao<Cliente>{

    @Override
    public boolean cadastrar(Cliente cliente) throws SQLException {
        PreparedStatement ps = null;
        String sql = "insert into cliente (CLI_COD, CLI_NOME, CLI_CPF, CLI_DT_NASC, CLI_SEXO, CLI_TELEFONE, CLI_ENDERECO)"
                + "values (CLIENTE_SEQ.nextval, ?, ?, ?, ?, ?, ?)";
        
        try{
            Connection conn = this.obterConexao();
            
            try {
                ps = conn.prepareStatement(sql);
                ps.setString(1, cliente.getNome());
                ps.setString(2, cliente.getCpf());
                ps.setDate(3, cliente.getNascimento());
                ps.setString(4, cliente.getSexo());
                ps.setString(5, cliente.getTelefone());
                ps.setString(6, cliente.getEndereco());
                
                ps.executeUpdate();
                
            }
            finally{
                try{
                    ConnectionFactory.closeConnection(conn, ps);
                    
                    JOptionPane.showMessageDialog(null, "A informação foi salva com sucesso!", "Informação", JOptionPane.INFORMATION_MESSAGE);
                }
                catch(Exception e) {
                    e.printStackTrace();
                }
            }
        }
        catch(SQLException ex) {
            ex.printStackTrace();
            return false;
        }
        return true;
    }

    @Override
    public boolean atualizar(Cliente cliente) throws SQLException {
        PreparedStatement ps = null;
        String sql = "update cliente set cli_nome = ?, cli_cpf = ?, cli_dt_nasc = ?," +
                    "cli_sexo = ?, cli_telefone = ?, cli_endereco = ? where cli_cod = ?";
        
        try{
            Connection conn = this.obterConexao();
            
            try {
                ps = conn.prepareStatement(sql);
                ps.setString(1, cliente.getNome());
                ps.setString(2, cliente.getCpf());
                ps.setDate(3, cliente.getNascimento());
                ps.setString(4, cliente.getSexo());
                ps.setString(5, cliente.getTelefone());
                ps.setString(6, cliente.getEndereco());
                ps.setInt(7, cliente.getCodigo());
                
                ps.executeUpdate();
                
            }
            finally{
                try{
                    ConnectionFactory.closeConnection(conn, ps);
                    
                    JOptionPane.showMessageDialog(null, "A informação foi atualizada com sucesso!", "Informação", JOptionPane.INFORMATION_MESSAGE);
                }
                catch(Exception e) {
                    e.printStackTrace();
                }
            }
        }
        catch(SQLException ex) {
            ex.printStackTrace();
            return false;
        }
        return true;
    }

    @Override
    public boolean excluir(Cliente cliente) throws SQLException {
        PreparedStatement ps = null;
        String sql = "DELETE FROM cliente WHERE cli_cod = ?";
        
        try{
            Connection conn = this.obterConexao();
            
            try {
                ps = conn.prepareStatement(sql);
                ps.setInt(1, cliente.getCodigo());
                
                ps.executeQuery();
                
            }
            finally{
                try{
                    ConnectionFactory.closeConnection(conn, ps);
                    
                    //JOptionPane.showMessageDialog(null, "A informação foi atualizada com sucesso!", "Informação", JOptionPane.INFORMATION_MESSAGE);
                }
                catch(Exception e) {
                    e.printStackTrace();
                }
            }
        }
        catch(SQLException ex) {
            ex.printStackTrace();
            return false;
        }
        return true;
    }

    @Override
    public Integer getCodigo(Cliente cliente) throws SQLException {
        PreparedStatement ps = null;
        Integer codigo = null;
        
        String sql = "select cli_cod from cliente where CLI_CPF = ?";
        
        try {
            Connection conn = this.obterConexao();
            
            ps = conn.prepareStatement(sql);
            
            ps.setString(1, cliente.getCpf());
            
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                cliente.setCodigo(rs.getInt("cli_cod"));
                codigo = cliente.getCodigo();
            }
            
            conn.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return codigo;
    }
    
}

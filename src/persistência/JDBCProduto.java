/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistência;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import modelo.Livro;

/**
 *
 * @author Marco
 */
public class JDBCProduto {
    
    Connection conexão;

    public JDBCProduto(Connection conexão) {
        this.conexão = conexão;
    }
    
    public void inserirLivro(Livro l){
        String sql = "insert into livro(nome, paginas, editora, emprestado) values (?, ?, ?, ?)";
        PreparedStatement ps;
        
        try{
            ps = this.conexão.prepareStatement(sql);
            ps.setString(1, l.getNome());
            ps.setInt(2, l.getPaginas());
            ps.setString(3, l.getEditora());
            ps.setString(4, l.getEmprestado());
            ps.execute();
        } catch (SQLException e){
            e.printStackTrace();
        }
    }
    
    public ArrayList<Livro> listarLivros(){
        ArrayList<Livro> livros = new ArrayList<Livro>();
        String sql = "select * from livro";
        
        try{
            Statement declaração = conexão.createStatement();
            ResultSet resposta = declaração.executeQuery(sql);
            
            while(resposta.next()){
                
                int id = resposta.getInt("id");
                String nome = resposta.getString("nome");
                int paginas = resposta.getInt("paginas");
                String editora = resposta.getString("editora");
                String emprestado = resposta.getString("emprestado");
                
                Livro l = new Livro(id, nome, paginas, editora, emprestado);
                livros.add(l);
            }
            
        } catch (SQLException e){
            e.printStackTrace();
        }
        
        return livros;
    }
    
    public void apagarTudo(){
        String sql = "delete from livro";
        
        PreparedStatement ps;
        
        try{
            ps = this.conexão.prepareStatement(sql);
            ps.execute();
        } catch (SQLException e){
            e.printStackTrace();
        }
    }
    
    public void Atualizar(Livro l){
        String sql = "UPDATE livro SET nome = ? , paginas = ?, editora = ?, emprestado = ? WHERE id = ?";
        PreparedStatement ps;
        
        try{
            ps = this.conexão.prepareStatement(sql);
            ps.setString(1, l.getNome());
            ps.setInt(2, l.getPaginas());
            ps.setString(3, l.getEditora());
            ps.setString(4, l.getEmprestado());
            ps.setInt(5, l.getId());
            ps.execute();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
    
}

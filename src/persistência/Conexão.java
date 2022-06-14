/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistência;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Marco
 */
public class Conexão {
    
    private Connection conexão;
    
    public Connection abrirConexão(){
        String url = "jdbc:mysql://localhost:3306/biblioteca?useTimezone=true&serverTimezone=UTC";
        String user = "root";
        String password = "";
        
        try {
            conexão = DriverManager.getConnection(url, user, password);
        } catch (SQLException ex) {
            Logger.getLogger(Conexão.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return conexão;
    }
    
    public void fecharConexão(){
        try {
            conexão.close();
        } catch (SQLException ex) {
            Logger.getLogger(Conexão.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

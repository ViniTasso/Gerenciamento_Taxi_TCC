/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sys.taxi.com.br.util;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author VGCT
 */
public class ConexaoSQL {

    public Connection getConnection() {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String driver = "jdbc:mysql://localhost:3306/taxi";
            Connection con = DriverManager.getConnection(driver, "root", "vgct");
            return con;
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }
}

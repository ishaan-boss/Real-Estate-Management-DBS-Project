package real_estate_management;


//import javax.sql.DataSource;
import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;





/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Mudit
 */
public class THE_CONNECTION {
    private static String servername="localhost";
    private static String dbname="Real_Estate_Management";
    private static String username="root";
    private static Integer portnumber=3306;
    private static String password="root@123";
    //create a function to get the connection

    public static Connection getTheConnection(){
        Connection connection =null;
        MysqlDataSource dataSouce= new MysqlDataSource();
        dataSouce.setServerName(servername);
        dataSouce.setUser(username);
        dataSouce.setDatabaseName(dbname);
        dataSouce.setPortNumber(portnumber);
        dataSouce.setPassword(password);
        try{
            connection =dataSouce.getConnection();
        }
        catch (SQLException ex){
            Logger.getLogger(THE_CONNECTION.class.getName()).log(Level.SEVERE,null,ex);
        }
        return connection;
    }


}

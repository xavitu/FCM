package com.db.utils;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConectorDB {
	static String userName;
	static String password;
	static String db;
	static int port;
	static String url = "jdbc:mysql://localhost";
	static Connection conn = null;
	static Statement s;
    
	public ConectorDB(String usr, String pass, String db, int port) {
		ConectorDB.userName = usr;
		ConectorDB.password = pass;
		ConectorDB.db = db;
		ConectorDB.port = port;
		ConectorDB.url += ":"+port+"/";
		ConectorDB.url += db;
	}

    public void connect() {
        try {
            Class.forName("com.mysql.jdbc.Connection");
            conn = (Connection) DriverManager.getConnection(url, userName, password);
            if (conn != null) {
                System.out.println("Conexi� a base de dades "+url+" ... Ok");
            }
        }
        catch(SQLException ex) {
            System.out.println("Problema al connecta-nos a la BBDD --> "+url);
        }
        catch(ClassNotFoundException ex) {
            System.out.println(ex);
        }

    }
    
    public void insertQuery(String query){
        try {
            s =(Statement) conn.createStatement();
            s.executeUpdate(query);
            System.out.println("Inserci� feta correctement");

        } catch (SQLException ex) {
            System.out.println("Problema al Inserir --> SQLEstate: " + ex.getSQLState() + " SQLError: "+ ex.getErrorCode());
        }
    }
    
    public void updateQuery(String query){
    	 try {
             s =(Statement) conn.createStatement();
             s.executeUpdate(query);

         } catch (SQLException ex) {
             System.out.println("Problema al Modificar --> " + ex.getSQLState());
         }
    }
    
    public void deleteQuery(String query){
    	 try {
             s =(Statement) conn.createStatement();
             s.executeUpdate(query);
             
         } catch (SQLException ex) {
             System.out.println("Problema al Eliminar --> " + ex.getSQLState());
         }
    	
    }
    
    public ResultSet selectQuery(String query){
    	ResultSet rs = null;
    	 try {
             s =(Statement) conn.createStatement();
             rs = s.executeQuery (query);
             
         } catch (SQLException ex) {
             System.out.println("Problema al Recuperar les dades --> " + ex.getSQLState());
         }
		return rs;
    }
    
    public void disconnect(){
    	try {
			conn.close();
		} catch (SQLException e) {
			System.out.println("Problema al tancar la connexi� --> " + e.getSQLState());
		}
    }

}

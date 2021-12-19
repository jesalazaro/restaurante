/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto5.modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Jaiver
 * 
 * Este archivo se encarga de implementar la interfaz de IMeseroDAO, y realizar la conexión  con la base de datos
 */
public class MeseroDAOjdbcImpl implements IMeseroDAO {
    
    //Conexion a la base de datos mediante el driver de conexion 

    private Connection conexion;
    
  
     private void conectar(){
        String DB_URL="jdbc:mysql://localhost:3306/reto4";
        String DB_USER ="root";
        String DB_PASSWORD = "4t4tfgB32.v45,";
        String DB_DRIVER_CLASS = "com.mysql.cj.jdbc.Driver";
        
        try {
            Class.forName(DB_DRIVER_CLASS);
            conexion = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MeseroDAOjdbcImpl.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error al conectar" + ex.getMessage());
        }
        catch(SQLException ex){
            System.out.println("Error al conectar de base de datos" +ex.getMessage());
        }
    }
     
     
     private void desconetar(){
     if(conexion != null){
         try{
             conexion.close();
         }
         catch(SQLException e){
             System.out.println("Error al desconectar");
         }
     }   
    }
     
     //los siguientes metodos conectan con la base de datos y retornan la informacion solicitada en cada caso.
    
    @Override
    public List<Mesero> obtenerTodosLosMeseros() {
      List<Mesero> meseros = new ArrayList<Mesero>();
        this.conectar();
        String sql = "SELECT * FROM mesero";
        try{
            Statement statement = conexion.createStatement();
            ResultSet res = statement.executeQuery(sql);
            while(res.next()){
                int mesId = res.getInt("mes_Id");
                String mesNombre = res.getString("mes_nombre");
                String mesApellidos = res.getString("mes_apellidos");
                Long mesDocumento = res.getLong("mes_documento");
                Long mesTelefono = res.getLong("mes_telefono");
                String mesCorreo = res.getString("mes_correo");
                Mesero mesero = new Mesero(mesId, mesNombre, mesApellidos, mesDocumento, mesTelefono, mesCorreo);
                meseros.add(mesero);
            }
        }
        catch (SQLException ex){
            System.out.println("Error al consultar" + ex.getMessage());
        }
        
        return meseros;
    }



    @Override
    public void actualizarMesero(Mesero mesero, int mesId) {
         this.conectar();
       String sql = "UPDATE mesero SET mes_nombre = ?, mes_apellidos = ?, mes_documento = ?, mes_telefono = ?, mes_correo = ? WHERE mes_id = ?";
        try {
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setString(1, mesero.getMesNombre());
            ps.setString(2, mesero.getMesApellido());
            ps.setLong(3, mesero.getMesDocumento());
            ps.setLong(4, mesero.getMesTelefono());
            ps.setString(5, mesero.getMesCorreo());
            ps.setInt(6, mesId);
            int filasActualizadas = ps.executeUpdate();
            if(filasActualizadas > 0 ){
                System.out.println("Se actualizó un mesero");
            }
        } catch (SQLException ex) {
            Logger.getLogger(MeseroDAOjdbcImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void eliminarMesero(Mesero mesero) {
        this.conectar();
         String sql = "DELETE FROM orden WHERE MESERO_mes_id = ?;";
         String sql1 = "DELETE FROM mesero WHERE mes_id = ?;";
       //String sql = "DELETE FROM mesero WHERE mes_id = ?";";
        try {
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setInt(1, mesero.getMesId());
            PreparedStatement ps1= conexion.prepareStatement(sql1);
            ps1.setInt(1, mesero.getMesId());
            int filasEliminadas = ps.executeUpdate();
            int filasEliminadas1 = ps1.executeUpdate();
            if(filasEliminadas1 > 0 ){
                System.out.println("Se eliminó un mesero");
            }
        } catch (SQLException ex) {
            Logger.getLogger(MeseroDAOjdbcImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public Mesero obtenerMeseroPorId(Integer id) {
      Mesero mesero = null;
        this.conectar();
        String sql = "SELECT * FROM mesero WHERE mes_id = ?";
        try{
            PreparedStatement statement = conexion.prepareStatement(sql);
            statement.setInt(1, id);
            ResultSet res = statement.executeQuery();
            while(res.next()){
                int mesId = res.getInt("mes_Id");
                String mesNombre = res.getString("mes_nombre");
                String mesApellidos = res.getString("mes_apellidos");
                Long mesDocumento = res.getLong("mes_documento");
                Long mesTelefono = res.getLong("mes_telefono");
                String mesCorreo = res.getString("mes_correo");
                mesero = new Mesero(mesId, mesNombre, mesApellidos, mesDocumento, mesTelefono, mesCorreo);
                
            }
        }
        catch (SQLException ex){
            System.out.println("Error al consultar" + ex.getMessage());
        }
        return mesero;
    }

    @Override
    public void insertarMesero(Mesero mesero) {
  this.conectar();
       String sql = "INSERT INTO mesero (mes_nombre, mes_apellidos, mes_documento, mes_telefono, mes_correo)   VALUES (?,?,?,?,?)";
        try {
            PreparedStatement via = conexion.prepareStatement(sql);
            via.setString(1, mesero.getMesNombre());
            via.setString(2, mesero.getMesApellido());
            via.setLong(3, mesero.getMesDocumento());
            via.setLong(4, mesero.getMesTelefono());
            via.setString(5, mesero.getMesCorreo());
            int filasInsertadas = via.executeUpdate();
            if(filasInsertadas > 0 ){
                System.out.println("Se inserto un mesero");
            }
        } catch (SQLException ex) {
            Logger.getLogger(MeseroDAOjdbcImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

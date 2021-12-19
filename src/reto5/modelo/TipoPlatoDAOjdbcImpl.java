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
 *  Este archivo se encarga de implementar la interfaz de IOrdenDAO y realizar la conexión  con la base de datos
 */
public class TipoPlatoDAOjdbcImpl implements ITipoPlatoDAO {
    
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
            Logger.getLogger(OrdenDAOjdbcImpl.class.getName()).log(Level.SEVERE, null, ex);
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
    public List<TipoPlato> obtenerTodosLosTipoPlatos() {
       List<TipoPlato> tipoplatos = new ArrayList<TipoPlato>();
        this.conectar();
        String sql = "SELECT * FROM tipo_plato";
        try{
            Statement statement = conexion.createStatement();
            ResultSet res = statement.executeQuery(sql);
            while(res.next()){
                int TipoPlatoId = res.getInt("tp_plt_id");
                String TipoPlatoNombre= res.getString("tp_plt_nombre");
                TipoPlato tipoPlato = new TipoPlato( TipoPlatoId,  TipoPlatoNombre);
                tipoplatos.add(tipoPlato);
            }
        }
        catch (SQLException ex){
            System.out.println("Error al consultar" + ex.getMessage());
        }
        
        return tipoplatos;
    }

    @Override
    public void insertarTipoPlato(TipoPlato tipoplato) {
        this.conectar();
       String sql = " SET FOREIGN_KEY_CHECKS=0;";
       String sql1 = "INSERT INTO tipo_plato (tp_plt_id, tp_plt_nombre)  VALUES (?,?)";
        try {
            PreparedStatement via = conexion.prepareStatement(sql);
            PreparedStatement via1 = conexion.prepareStatement(sql1);
            via1.setInt(1, tipoplato.getTipoPlatoId());
            via1.setString(2, tipoplato.getTipoPlatoNombre());
            int filasInsertadas = via.executeUpdate(sql);
            int filasInsertadas1 = via1.executeUpdate();
            if(filasInsertadas1 > 0 ){
                System.out.println("Se inserto un plato");
            }
        } catch (SQLException ex) {
            Logger.getLogger(OrdenDAOjdbcImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void actualizarTipoPlato(TipoPlato tipoplato, int TipoPltId) {
      this.conectar();
       String sql = "SET FOREIGN_KEY_CHECKS=0;";
       String sql1 = "UPDATE tipo_plato SET tp_plt_nombre = ?  WHERE tp_plt_id = ?";
        try {
            PreparedStatement ps = conexion.prepareStatement(sql);
            PreparedStatement ps1 = conexion.prepareStatement(sql1);
            ps1.setString(1, tipoplato.getTipoPlatoNombre());
            ps1.setInt(5, TipoPltId);
            int filasActualizadas = ps.executeUpdate();
            int filasActualizadas1 = ps1.executeUpdate();
            if(filasActualizadas1 > 0 ){
                System.out.println("Se actualizó un tipo de plato");
            }
        } catch (SQLException ex) {
            Logger.getLogger(OrdenDAOjdbcImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void eliminarTipoPlato(TipoPlato tipoplato) {
        this.conectar();
         String sql = "SET FOREIGN_KEY_CHECKS=0;";
         String sql1 = "DELETE FROM tipo_plato WHERE tp_plt_id = ?;";
        try {
            PreparedStatement ps = conexion.prepareStatement(sql);
            PreparedStatement ps1= conexion.prepareStatement(sql1);
            ps1.setInt(1, tipoplato.getTipoPlatoId());
            int filasEliminadas = ps.executeUpdate();
            int filasEliminadas1 = ps1.executeUpdate();
            if(filasEliminadas1 > 0 ){
                System.out.println("Se eliminó un tipo de plato");
            }
        } catch (SQLException ex) {
            Logger.getLogger(OrdenDAOjdbcImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public TipoPlato obtenerTipoPlatoPorId(Integer id) {
                 TipoPlato tipoplato = null;
        this.conectar();
        String sql = "SELECT * FROM tipo_plato WHERE tp_plt_id = ?";
        try{
            PreparedStatement statement = conexion.prepareStatement(sql);
            statement.setInt(1, id);
            ResultSet res = statement.executeQuery();
            while(res.next()){
                int TipoPlatoId = res.getInt("tp_plt_id");
                String TipoPlatoNombre = res.getString("tp_plt_nombre");
  
                
                tipoplato = new TipoPlato(TipoPlatoId, TipoPlatoNombre);
                
            }
        }
        catch (SQLException ex){
            System.out.println("Error al consultar" + ex.getMessage());
        }
        return tipoplato;  
    }
    
    
}

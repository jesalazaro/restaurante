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
import javax.swing.JOptionPane;
//import reto5.vista.frame;
import javax.swing.JFrame;
/**
 *
 * @author Jaiver
 * Este archivo se encarga de implementar la interfaz de IPlatoDAO, y realizar la conexión  con la base de datos
 */
public class PlatoDAOjdbcImpl implements IPlatoDAO {

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
    public List<Plato> obtenerTodosLosPlatos() {
        List<Plato> platos = new ArrayList<Plato>();
        this.conectar();
        String sql = "SELECT * FROM plato";
        try{
            Statement statement = conexion.createStatement();
            ResultSet res = statement.executeQuery(sql);
            while(res.next()){
                int platoId = res.getInt("plt_id");
                String PltNombre= res.getString("plt_nombre");
                long PltPrecio= res.getLong("plt_precio");
                String PltDescripcion = res.getString("plt_descripcion");
                int TipoPlt = res.getInt("TIPO_PLATO_tp_plt_id");
                Plato plato = new Plato(platoId, PltNombre, PltPrecio, PltDescripcion, TipoPlt);
                platos.add(plato);
            }
        }
        catch (SQLException ex){
            System.out.println("Error al consultar" + ex.getMessage());
        }
        
        return platos;
    }
    

    @Override
    public void insertarPlato(Plato plato) {
         
       this.conectar();
       String sql = " SET FOREIGN_KEY_CHECKS=0;";
       String sql1 = "INSERT INTO plato (plt_id, plt_nombre, plt_precio, plt_descripcion, TIPO_PLATO_tp_plt_id)  VALUES (?,?,?,?,?)";
        try {
            PreparedStatement via = conexion.prepareStatement(sql);
            PreparedStatement via1 = conexion.prepareStatement(sql1);
            via1.setInt(1, plato.getPltId());
            via1.setString(2, plato.getPltNombre());
            via1.setLong(3, plato.getPltPrecio());
            via1.setString(4, plato.getPltDescripcion());
            via1.setInt(5, plato. getTipoPlatoId());
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
    public void actualizarPlato(Plato plato, int PltId) {
       this.conectar();
       String sql = "SET FOREIGN_KEY_CHECKS=0;";
       String sql1 = "UPDATE plato SET plt_nombre = ?, plt_precio = ?, plt_descripcion = ?, TIPO_PLATO_tp_plt_id = ? WHERE plt_id = ?";
        try {
            PreparedStatement ps = conexion.prepareStatement(sql);
            PreparedStatement ps1 = conexion.prepareStatement(sql1);
            ps1.setString(1, plato.getPltNombre());
            ps1.setLong(2, plato.getPltPrecio());
            ps1.setString(3,  plato.getPltDescripcion());
            ps1.setInt(4, plato.getTipoPlatoId());
            ps1.setInt(5, PltId);
            int filasActualizadas = ps.executeUpdate();
            int filasActualizadas1 = ps1.executeUpdate();
            if(filasActualizadas1 > 0 ){
                System.out.println("Se actualizó un plato");
            }
        } catch (SQLException ex) {
            Logger.getLogger(OrdenDAOjdbcImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    

    @Override
    public void eliminarPlato(Plato plato) {
          this.conectar();
         String sql = "SET FOREIGN_KEY_CHECKS=0;";
         String sql1 = "DELETE FROM plato WHERE plt_id = ?;";
        try {
            PreparedStatement ps = conexion.prepareStatement(sql);
            PreparedStatement ps1= conexion.prepareStatement(sql1);
            ps1.setInt(1, plato.getPltId());
            int filasEliminadas = ps.executeUpdate();
            int filasEliminadas1 = ps1.executeUpdate();
            if(filasEliminadas1 > 0 ){
                System.out.println("Se eliminó un plato");
             //JOptionPane.showMessageDialog(frame, "Eggs are not supposed to be green.");
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(OrdenDAOjdbcImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public Plato obtenerPlatoPorId(Integer id) {
             Plato plato = null;
        this.conectar();
        String sql = "SELECT * FROM plato WHERE plt_id = ?";
        try{
            PreparedStatement statement = conexion.prepareStatement(sql);
            statement.setInt(1, id);
            ResultSet res = statement.executeQuery();
            while(res.next()){
                int PlatoId = res.getInt("plt_id");
                String PlatoNombre = res.getString("plt_nombre");
                long PlatoPrecio = res.getLong("plt_precio");
                String PlatoDescripcion= res.getString("plt_descripcion");
                int TipoPlatoId = res.getInt("TIPO_PLATO_tp_plt_id");
                
                plato = new Plato(PlatoId, PlatoNombre, PlatoPrecio, PlatoDescripcion, TipoPlatoId);
                
            }
        }
        catch (SQLException ex){
            System.out.println("Error al consultar" + ex.getMessage());
        }
        return plato;  
    }
}

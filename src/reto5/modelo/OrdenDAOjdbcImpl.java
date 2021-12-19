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
 * Este archivo se encarga de implementar la interfaz de IOrdenDAO y realizar la conexión  con la base de datos
 */
public  class OrdenDAOjdbcImpl implements IOrdenDAO{
    
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
    public List<Orden> obtenerTodasLasOrdenes() {
       List<Orden> ordenes = new ArrayList<Orden>();
        this.conectar();
        String sql = "SELECT * FROM orden";
        try{
            Statement statement = conexion.createStatement();
            ResultSet res = statement.executeQuery(sql);
            while(res.next()){
                int ordId = res.getInt("ordn_Id");
                String OrdnFecha = res.getString("ordn_fecha");
                int OrdnPlato= res.getInt("PLATO_plt_id");
                int OrdnMes = res.getInt("MESERO_mes_id");
                int OrdnCli = res.getInt("CLIENTE_cli_id");
                Orden orden = new Orden(ordId, OrdnFecha, OrdnPlato, OrdnMes, OrdnCli);
                ordenes.add(orden);
            }
        }
        catch (SQLException ex){
            System.out.println("Error al consultar" + ex.getMessage());
        }
        
        return ordenes;
    }

    @Override
    public void insertarOrden(Orden orden) {
       
        this.conectar();
       String sql = " SET FOREIGN_KEY_CHECKS=0;";
       String sql1 = "INSERT INTO orden (ordn_fecha, PLATO_plt_id, MESERO_mes_id, CLIENTE_cli_id )  VALUES (?,?,?,?)";
        try {
            PreparedStatement via = conexion.prepareStatement(sql);
            PreparedStatement via1 = conexion.prepareStatement(sql1);
            via1.setString(1, orden.getOrdnFecha());
            via1.setInt(2, orden.getOrdnPlatoId());
            via1.setInt(3, orden.getOrdnMesId());
            via1.setInt(4, orden.getOrdnCliId());
            int filasInsertadas = via.executeUpdate(sql);
            int filasInsertadas1 = via1.executeUpdate();
            if(filasInsertadas1 > 0 ){
                System.out.println("Se inserto una orden");
            }
        } catch (SQLException ex) {
            Logger.getLogger(OrdenDAOjdbcImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }

    @Override
    public void actualizarOrden(Orden orden, int OrdnId) {
      this.conectar();
       String sql = "SET FOREIGN_KEY_CHECKS=0;";
       String sql1 = "UPDATE orden SET ordn_fecha = ?, PLATO_plt_id = ?, MESERO_mes_id = ?, CLIENTE_cli_id = ? WHERE ordn_id = ?";
        try {
            PreparedStatement ps = conexion.prepareStatement(sql);
            PreparedStatement ps1 = conexion.prepareStatement(sql1);
            ps1.setString(1, orden.getOrdnFecha());
            ps1.setInt(2, orden.getOrdnPlatoId());
            ps1.setInt(3, orden.getOrdnMesId());
            ps1.setInt(4, orden.getOrdnCliId());
            ps1.setInt(5, OrdnId);
            int filasActualizadas = ps.executeUpdate();
            int filasActualizadas1 = ps1.executeUpdate();
            if(filasActualizadas1 > 0 ){
                System.out.println("Se actualizó una orden");
            }
        } catch (SQLException ex) {
            Logger.getLogger(OrdenDAOjdbcImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void eliminarOrden(Orden orden) {
         this.conectar();
         String sql = "SET FOREIGN_KEY_CHECKS=0;";
         String sql1 = "DELETE FROM orden WHERE ordn_id = ?;";
       //String sql = "DELETE FROM orden WHERE ordn_id = ?";";
        try {
            PreparedStatement ps = conexion.prepareStatement(sql);
            PreparedStatement ps1= conexion.prepareStatement(sql1);
            ps1.setInt(1, orden.getOrdId());
            int filasEliminadas = ps.executeUpdate();
            int filasEliminadas1 = ps1.executeUpdate();
            if(filasEliminadas1 > 0 ){
                System.out.println("Se eliminó una orden");
            }
        } catch (SQLException ex) {
            Logger.getLogger(OrdenDAOjdbcImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     *
     * @param id
     * @return
     */
    @Override
    public Orden obtenerOrdenPorId(Integer id) {
       Orden orden = null;
        this.conectar();
        String sql = "SELECT * FROM orden WHERE ordn_id = ?";
        try{
            PreparedStatement statement = conexion.prepareStatement(sql);
            statement.setInt(1, id);
            ResultSet res = statement.executeQuery();
            while(res.next()){
                int ordId = res.getInt("ordn_Id");
                String OrdnFecha = res.getString("ordn_fecha");
                int OrdnPlatoId = res.getInt("PLATO_plt_id");
                int OrdnMeseroId= res.getInt("CLIENTE_cli_id");
                int OrdnClienteId = res.getInt("MESERO_mes_id");
                
                orden = new Orden(ordId, OrdnFecha, OrdnPlatoId, OrdnMeseroId, OrdnClienteId);
                
            }
        }
        catch (SQLException ex){
            System.out.println("Error al consultar" + ex.getMessage());
        }
        return orden;   
    }
}

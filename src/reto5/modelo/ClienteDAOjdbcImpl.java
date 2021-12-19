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
 * Este archivo se encarga de implementar la interfaz de IClienteDAO, y realizar la conexión  con la base de datos.
 */
public class ClienteDAOjdbcImpl implements IClienteDAO{
    private Connection conexion;
    
    //Conexion a la base de datos mediante el driver de conexion 
    
    private void conectar(){
        String DB_URL="jdbc:mysql://localhost:3306/reto4";
        String DB_USER ="root";
        String DB_PASSWORD = "4t4tfgB32.v45,";
        String DB_DRIVER_CLASS = "com.mysql.cj.jdbc.Driver";
        
        try {
            Class.forName(DB_DRIVER_CLASS);
            conexion = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ClienteDAOjdbcImpl.class.getName()).log(Level.SEVERE, null, ex);
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
    public List<Cliente> obtenerTodosLosClientes() {
        List<Cliente> clientes = new ArrayList<Cliente>();
        this.conectar();
        String sql = "SELECT * FROM cliente";
        try{
            Statement statement = conexion.createStatement();
            ResultSet res = statement.executeQuery(sql);
            while(res.next()){
                int cliId = res.getInt("cli_Id");
                String cliNombre = res.getString("cli_nombres");
                String cliApellidos = res.getString("cli_apellidos");
                Long cliDocumento = res.getLong("cli_documento");
                Long cliTelefono = res.getLong("cli_telefono");
                Cliente cliente = new Cliente(cliId, cliNombre, cliApellidos, cliDocumento, cliTelefono);
                clientes.add(cliente);
            }
        }
        catch (SQLException ex){
            System.out.println("Error al consultar" + ex.getMessage());
        }
        
        return clientes;
    }

    @Override
    public void insertarCliente(Cliente cliente) {
       this.conectar();
       String sql = "INSERT INTO cliente (cli_nombres, cli_apellidos, cli_documento, cli_telefono)   VALUES (?,?,?,?)";
        try {
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setString(1, cliente.getCliNombre());
            ps.setString(2, cliente.getCliApellido());
            ps.setLong(3, cliente.getCliDocumento());
            ps.setLong(4, cliente.getCliTelefono());
            int filasInsertadas = ps.executeUpdate();
            if(filasInsertadas > 0 ){
                System.out.println("Se inserto un cliente");
            }
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAOjdbcImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    

@Override
    public void actualizarCliente(Cliente cliente, int cliId) {
        this.conectar();
       String sql = "UPDATE cliente SET cli_nombres = ?, cli_apellidos = ?, cli_documento = ?, cli_telefono = ? WHERE cli_id = ?";
        try {
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setString(1, cliente.getCliNombre());
            ps.setString(2, cliente.getCliApellido());
            ps.setLong(3, cliente.getCliDocumento());
            ps.setLong(4, cliente.getCliTelefono());
            ps.setInt(5, cliId);
            int filasActualizadas = ps.executeUpdate();
            if(filasActualizadas > 0 ){
                System.out.println("Se actualizó un cliente");
            }
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAOjdbcImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void eliminarCliente(Cliente cliente) {
         this.conectar();
         String sql = "DELETE FROM orden WHERE CLIENTE_cli_id = ?;";
         String sql1 = "DELETE FROM cliente WHERE cli_id = ?;";
       //String sql = "DELETE FROM cliente WHERE cli_id = ?";";
        try {
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setInt(1, cliente.getCliId());
            PreparedStatement ps1= conexion.prepareStatement(sql1);
            ps1.setInt(1, cliente.getCliId());
            int filasEliminadas = ps.executeUpdate();
            int filasEliminadas1 = ps1.executeUpdate();
            if(filasEliminadas1 > 0 ){
                System.out.println("Se eliminó un cliente");
            }
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAOjdbcImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public Cliente obtenerClientePorId(Integer id) {
        Cliente cliente = null;
        this.conectar();
        String sql = "SELECT * FROM cliente WHERE cli_id = ?";
        try{
            PreparedStatement statement = conexion.prepareStatement(sql);
            statement.setInt(1, id);
            ResultSet res = statement.executeQuery();
            while(res.next()){
                int cliId = res.getInt("cli_Id");
                String cliNombre = res.getString("cli_nombres");
                String cliApellidos = res.getString("cli_apellidos");
                Long cliDocumento = res.getLong("cli_documento");
                Long cliTelefono = res.getLong("cli_telefono");
                cliente = new Cliente(cliId, cliNombre, cliApellidos, cliDocumento, cliTelefono);
                
            }
        }
        catch (SQLException ex){
            System.out.println("Error al consultar" + ex.getMessage());
        }
        return cliente;
        
    }
    

    
    
}

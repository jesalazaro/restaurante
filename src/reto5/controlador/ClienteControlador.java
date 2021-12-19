/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto5.controlador;

import java.util.ArrayList;
import java.util.List;
import reto5.modelo.Cliente;
import reto5.modelo.ClienteDAOjdbcImpl;
import reto5.modelo.IClienteDAO;

/**
 *
 * @author Jaiver
 * 
 * El siguiente archivo permite a la vista comunicarse con el modelo, es decir sirve como puente para enviar la debida informacion en este caso
 * de la tabla clientes
 */



public class ClienteControlador {
    private List<Cliente> listaCliente;
    IClienteDAO daoCliente = new ClienteDAOjdbcImpl();
    
    public ClienteControlador() {
        listaCliente = new ArrayList<Cliente>();
    }
    
    public List<Cliente> obtenerTodosLosClientes(){
        return daoCliente.obtenerTodosLosClientes();
    }
    
    public void insertarCliente(Cliente cliente){
        daoCliente.insertarCliente(cliente);
    }
    
    public Cliente obtenerClientePorId(Integer id){
        return daoCliente.obtenerClientePorId(id);
    }
    
    public void actualizarCliente(Cliente cliente, int cliId) {
         daoCliente.actualizarCliente(cliente, cliId);
      }
    public void eliminarCliente(Cliente cliente){
        daoCliente.eliminarCliente(cliente);
    }
}
